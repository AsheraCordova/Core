package com.ashera.layout;

import com.ashera.widget.WidgetFactory;

public class LayoutPlugin  {
    public static void initPlugin() {
        //start - widgets
        WidgetFactory.register(new com.ashera.layout.ViewOnlyImpl());
        WidgetFactory.register(new com.ashera.layout.FrameLayoutImpl());
        WidgetFactory.register(new com.ashera.layout.LinearLayoutImpl());
        WidgetFactory.register(new com.ashera.layout.TextViewImpl());
        WidgetFactory.register(new com.ashera.layout.LinkImpl());
        WidgetFactory.register(new com.ashera.layout.ModelImpl());
        WidgetFactory.register(new com.ashera.layout.ScrollViewImpl());
        WidgetFactory.register(new com.ashera.layout.RelativeLayoutImpl());
        WidgetFactory.register(new com.ashera.layout.RootImpl());
        WidgetFactory.register(new com.ashera.layout.TableLayoutImpl());
        WidgetFactory.register(new com.ashera.layout.TableRowImpl());
        WidgetFactory.register(new com.ashera.layout.HorizontalScrollViewImpl());
        WidgetFactory.register(new com.ashera.layout.SwitchImpl());
        WidgetFactory.register(new com.ashera.layout.RadioGroupImpl());
        WidgetFactory.register(new com.ashera.layout.ChronometerImpl());
        WidgetFactory.register(new com.ashera.layout.ListViewImpl());
        WidgetFactory.register(new com.ashera.layout.ImageViewImpl());
        WidgetFactory.register(new com.ashera.layout.ImageButtonImpl());
        WidgetFactory.register(new com.ashera.layout.EditTextImpl());
        WidgetFactory.register(new com.ashera.layout.TextAreaImpl());
        WidgetFactory.register(new com.ashera.layout.ButtonImpl());
        WidgetFactory.register(new com.ashera.layout.CheckBoxImpl());
        WidgetFactory.register(new com.ashera.layout.RadioButtonImpl());
        WidgetFactory.register(new com.ashera.layout.ToggleButtonImpl());
        WidgetFactory.register(new com.ashera.layout.ViewOverlayImpl());
        WidgetFactory.register(new com.ashera.layout.mergeImpl());
        WidgetFactory.register(new com.ashera.layout.fragmentImpl());
        WidgetFactory.register(new com.ashera.layout.SpinnerImpl());
        WidgetFactory.register(new com.ashera.layout.MultiSelectionSpinnerImpl());
        WidgetFactory.register(new com.ashera.layout.WebViewImpl());
        WidgetFactory.register(new com.ashera.layout.ProgressBarImpl());
        WidgetFactory.register(new com.ashera.layout.PopupWindowImpl());
        WidgetFactory.register(new com.ashera.layout.AutoCompleteTextViewImpl());
        //end - widgets
        
        WidgetFactory.register(new com.ashera.layout.ImageViewImpl());
        

    }
}
