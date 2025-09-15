package com.ashera.core;

import java.io.File;
import java.io.IOException;

import com.ashera.utils.FileUtils;
import com.ashera.widget.PluginInvoker;

import androidx.navigation.NavArgument;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.NavType;
import androidx.navigation.fragment.FragmentNavigator;

public class MyNavHostFragment extends androidx.navigation.fragment.NavHostFragment{
    @Override
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NavController navController = getNavController();
        String fileName = getArguments().getString("fileName");
        String rootDirectory = getArguments().getString("rootDirectory");
        String namespace = getArguments().getString("namespace");

        NavGraph navGraph = new NavGraph(new NavGraphNavigator(navController.getNavigatorProvider()));
        FragmentNavigator fragmentNavigator = navController
                .getNavigatorProvider()
                .getNavigator(FragmentNavigator.class);
        IFragment parentFragment = (IFragment) getParentFragment();
        String contentLocation = PluginInvoker.resolveCDVFileLocation(rootDirectory  + "/" + fileName, parentFragment);
        String contentHtml = null;
        try {
            contentHtml = FileUtils.readFileToString(new File(contentLocation));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        com.ashera.parser.html.HtmlParser.parse(new com.ashera.parser.html.ContentHandlerAdapter() {

            @Override
            public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {

                switch (localName) {
                    case "navigation": {
                        navGraph.setStartDestination((int) parentFragment.getRootWidget().quickConvert(atts.getValue("startDestination"), "id"));
                        break;
                    }
                    case "fragment": {
                        FragmentNavigator.Destination fragmentDestination = fragmentNavigator.createDestination();
                        fragmentDestination.addArgument("rootDirectory", new NavArgument.Builder().setDefaultValue(rootDirectory).setType(NavType.StringType).build());
                        fragmentDestination.addArgument("namespace", new NavArgument.Builder().setDefaultValue(namespace).setType(NavType.StringType).build());
                        for (int i = 0; i < atts.getLength(); i++) {
                            String attrName = atts.getLocalName(i);
                            switch (attrName) {
                                case "id":
                                    fragmentDestination.setId((int) parentFragment.getRootWidget().quickConvert(atts.getValue(i), "id"));
                                    break;
                                case "name":
                                    fragmentDestination.setClassName(atts.getValue(i));
                                    break;
                                case "layout":
                                    String value = atts.getValue(i);
                                    value = value.replace("@", "") + ".xml";
                                    fragmentDestination.addArgument("fileName", new NavArgument.Builder().setDefaultValue(value).setType(NavType.StringType).build());
                                    break;
                            }
                        }
                        navGraph.addDestination(fragmentDestination);
                        break;
                    }
                }
            }
        }, contentHtml);

        navController.setGraph(navGraph);
    }
}
