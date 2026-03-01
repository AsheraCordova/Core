var fs = require('fs');
var path = require('path');
 
var rootdir = '';

function replace_string_in_file(filename, to_replace, replace_with) {
    var data = fs.readFileSync(filename, 'utf8');
    if (data.indexOf(replace_with) == -1) {
    	var result = data.replace(new RegExp(to_replace.replace(/[.*+?^${}()|[\]\\]/g, '\\$&'), "g"), replace_with);
    	fs.writeFileSync(filename, result, 'utf8');
    }
}

function appendstring_in_file(filename, str) {
    var data = fs.readFileSync(filename, 'utf8');
    if (data.indexOf(str) == -1) {
    	var result = data + '\n' + str;
    	fs.writeFileSync(filename, result, 'utf8');
    }
}
 
var filestoreplace = [
    "platforms/android/CordovaLib/src/org/apache/cordova/CordovaActivity.java",
    "extends Activity",
    "extends androidx.appcompat.app.AppCompatActivity",
    "platforms/android/app/src/main/assets/www/cordova.js",
    "throw new Error('Unknown event action ' + action);",
    "cordova.fireDocumentEvent(action, msg);break;",
	"node_modules/cordova-common/src/ConfigChanges/ConfigFile.js",
    "function resolveConfigFilePath (project_dir, platform, file) {",
    "function resolveConfigFilePath (project_dir, platform, file) {if (file === 'config.xml' && platform === 'browser') {return path.join(project_dir, 'config.xml');}",
    
];

var filestoappend = [
    "platforms/android/CordovaLib/build.gradle",
    "apply from: 'cordovalib.gradle'"
];

filestoreplace.forEach(function(val, index, array) {
    var fullfilename = path.join(rootdir, val);
    if (fs.existsSync(fullfilename)) {
    	console.log("file name: "+fullfilename);
        replace_string_in_file(fullfilename, 
        	array[index + 1], 
            array[index + 2]);
    }
});

filestoappend.forEach(function(val, index, array) {
    var fullfilename = path.join(rootdir, val);
    if (fs.existsSync(fullfilename)) {
    	console.log("file name: "+fullfilename);
        appendstring_in_file(fullfilename,  array[index + 1]);
    }
});