# Core
Core project which adds native support for cordova project.

The project provides the following functionality
* Basic Widgets and Android Layouts
* Validation support
* Unidirectional Databinding framework
* Cross platform JSON
* Cross platform file system access
* Converters
* Enable features
* Drag & Drop
* Resizing Images
* Method expression

Ashera support the following platforms:

OS            | Framework
------------- | -------------
Android       | Android
IOS           | J2objc
Windows       | SWT
Mac           | SWT
Linux         | SWT
Browser	      | Teavm

## Layouts
* View
* FrameLayout
* LinearLayout
* RelativeLayout
* ListView
* ListView
* HorizontalScrollView
* ScrollView
* TableLayout
* TableRow



## Widgets
* Button
* CheckBox
* Chronometer
* EditText
* ImageButton
* ImageView
* ProgressBar
* RadioButton
* RadioGroup
* Spinner
* Switch
* TextView
* ToggleButton

## Validation support

Ashera provides support for validations by extending the view to add (v_*) attributes. 

An example of adding validation to an edit text is shown below:
```
<EditText android:layout_width="match_parent"
	android:layout_height="wrap_content"
	formGroupId="loginForm"
	v_required=""
	android:id="@+id/test1"
  	validationErrorDisplayType="label|style"
	customErrorMessageKeys="required"
	customErrorMessageValues="@string/sample_text"	
	style="@style/normalStyle"
	errorStyle="@style/errorStyle" />
<TextView android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:id="@+id/test1Error"/>
<Button
    android:id="@+id/submit"
    onClick="validateForm"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/register_now"></TextView>
```

```
export default class Login extends Fragment {
    @Inject({ id: "@+id/submit" })
    private validateButton!: Button;
    constructor() {
        super();
    }

    async validateForm(obj: any) {
        if (await this.validateForm("loginForm", this.validateButton)) {
		// go to next screen
        }
    }
}
```

The above snippet adds editText with id **test1** to a form group **loginForm** with mandatory validation added. It display the error message on a label with id **test1Error** and changes style to errorStyle when validation fails. It displays an custom error message **Sample text** when validation fails. 

validationErrorDisplayType can be of 3 types:
* popup - Only supported on android. Uses android setError on EditText.
* label - Display error text in label with id + Error.
* style - Changes the style property when validation fails. Uses style and errorStyle on the widget.

The validation is trigerred in javascript by invoking method **validateForm**.

The following table lists the custom attribute on View to support validation:

Name                	| Description
-------------       	| -------------
customErrorMessageKeys  | Comma separated value of the validation for which custom message will be specified.
customErrorMessageValues| Comma separated custom messages for the message keys specified. This has to be used with customErrorMessageKeys attribute. For e.g. customErrorMessageKeys="required,min" customErrorMessageValues="Test, Test1"
formGroupId		| When a form is validated using validateForm method in javascript, groupId is passed as one of the parameters. This id is used to group widgets to form a form. This is a comma separated string. Hence a widget can belong to multiple forms.
validateForm		| Method used to validate a group of widgets.
validationErrorDisplayType | See above section.
validation		| Validation on the configured on widget using (v_*) attributed or using the validation attribute. This is comma separated string. e.g. validation="required,date(dd/mm/YYYY)"

The following table lists the validators available:
Name                	| Description
-------------       	| -------------
alphabet  		| Text matching regex [a-zA-Z]*
alphanumeric  		| Text matching regex [0-9a-zA-Z]*
date  			| Text matching format passed in as argument. See https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html. e.g. date(dd/mm/yyyy).
inrange  		| Validates whether the text is with the range passed in as arguments. e.g. inrange(0,10)
email  			| Validates whether the text is a valid email.
mobilenumber  		| Validates whether the text is a valid 10 digit mobile number.		
number  		| Text matching regex [0-9]*
pin  			| Text matching regex \d{6}
length  		| Validates whether the text is within the length passed in as argument. e.g. length(10)
required  		| Validates whether the text is not empty.
time			| Validates whether time in 24 hours format
pattern			| Validates whether text is as per the regex passed in as argument e.g. pattern(a-z)
minlength		| Validates whether the text is having minimum length passed in as argumnet. e.g. minlength(10)
maxlength		| Validates whether the text is having maximum length passed in as argumnet. e.g. maxlength(10)
minvalue		| Validates whether the text is having minimum value passed in as argumnet. e.g. minvalue(10)
maxvalue		| Validates whether the text is having maximum value passed in as argumnet. e.g. maxvalue(10)
url			| Validates whether the text is a valid url.
strongpassword		| Password should be atleast 8 characters with uppercase letter, numbers and having atleast on special character as specified <code>(.*[,~,!,@,#,$,%,^,&,\*,(,),-,_,=,+,[,{,],},\|,;,:,<,>,/,?].*$)</code>

## Unidirectional Databinding framework

Object to UI and UI to Object is the provided as part of the core framework. It is achieved using storing objects in certain scope of the application and the ui synchronizing it whenever an event happens. This provides easy but powerful way to achieve synchronizing ui to objects and vice versa by configuring few attributes on widgets.

### Scope
Scope where an object is stored can be one of the following:
* view - It is stored on the fragment which is the root for all views. When a fragment is destroyed, the object is also removed along with the fragment.
* session - It is stored on the application object. As long as the application is alive, the object is available.
* loopvar - Whenever we loop on object, a loopvar is created and stored on the widget on which we are looping.

### Type
Objects can be stored in scope as:
* map - Simple map containing key value pair.
* list - list of objects.
* plainmap - hierarchical map. This simplifies querying map for inner objects.
* bool - boolean
* int - integer
* number - floating point number
* string - String

### Expression Statement
Expression statement is written to identity, move, store objects from ui to object and vice versa.

**var - e.g let x = . from y->view into session as map**

The above statement stores a intermediate variable x into session as map
Name                	| Description
-------------       	| -------------
modelPojoToUi | e.g text=abcd from x->view Set text attribute on widget to abcd attribute from object x stored in scope view. 
modelUiToPojo | e.g abcd=text into x->view Set abcd attribute on object x stored in scope view to text attribute on widget. 
Event | e.g y=z from z->view Store y to from object in scope view into event map. 
var store | e.g y->intent as pathmap. Store the object into a variable y on intent with type pathmap. 
var get | e.g z from z->view Get z attribute from object z in scope view. 
loop var | e.g let x in c from y->view into session as pathmap. Loop over c attribute of type list on object y in scope view. Create loop var x of type pathmap.- 

### Custom Methods/Attributes

Name                | Description
-------------       | -------------
modelPojoToUi       | Used for synchronizing object to ui.
modelPojoToUiParams | Method expression params. 
modelUiToPojo       | Used for synchronizing ui to object.
modelUiToPojoEventIds| List of widget ids to be refreshed using refreshUiFromModel after an event occurs.
modelSyncEvents     | Used for synchronizing ui to object.
refreshUiFromModel  | Used for refreshing the ui from the path configured using modelUiToPojo.
modelParam          | Store intermediate variables to scope.
updateModelData     | Used to update object data in certain scope.
modelFor            | Used to loop on list to create multiple user interface elements.
modelIdPath         | Identifier property path in the object.
addModel            | Append object to list stored in scope and update the user interface element.
removeModelAtIndex  | Remove object to list at index stored in scope and update the user interface element.
removeModelById     | Remove object to list by id stored in scope and update the user interface element.


### Usage
The following is general flow of application and this depicts where the methods and expression has to be used:

* Navigate to Page

Javascript data objects are born in the ts fragment files and finally stored in scope in native code. When we redirect to native screen, data is passed into method and this data is stored in certain scope as defined by the statement expression.
```
await this.navController.reset().navigate(recyclerview_1000_items, 
	  "testObj->view as pathmap", 
	  {looptest: {textlayout: data}}).executeCommand();
```

The example above uses **var store** expression to store data specified into key **testObj** with scope view.

* Sync of data displayed

The data stored in scope is synched back and from the ui to object using modelPojoToUi, modelUiToPojo and modelSyncEvents.

```
  <EditText 
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    modelPojoToUi="text = emailIntent from testObj->session"
    modelUiToPojo="emailIntent = text into testObj->session"
    modelSyncEvents="onTextChange"
    onTextChange=""/>
```	

The above example shows that testObj is present in session scope. The property text of the EditText is always kept in sync with the emailIntent of testObj in session scope. The sync from UI to Object only happens when text change event is triggered.

* Get Modified data

The object stored in scope are modified in step 2. When event occurs, we can request the modified data such as click of a button.

```
  <Button android:layout_width="wrap_content"
	  android:layout_height="wrap_content" 
    android:text="Get Data"
    android:onClick="getData(model=. from items->view)" />
```	  

The above example requests an object stored with key **items** with scope view on event **onClick** of button.
	
* Sync dependent widget
```
  <EditText 
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    modelPojoToUi="text = emailIntent from testObj->session"
    modelUiToPojo="emailIntent = text into testObj->session"
    modelSyncEvents="onTextChange"
    modelUiToPojoEventIds="label"	    
    onTextChange=""/>
<TextView 
    android:id="@+id/label"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    modelPojoToUi="text = emailIntent from testObj->session"
/>
```
The above example changes syncs emailIntent on object testObj when onTextChange event occurs. Also after the event has finished, the TextView with id **label** is refreshed with the latest value of emailIntent.
	
## Enable features
This is custom attribute on the view. This attribute can take | separated string e.g. decorator|hscroll|vscroll. This attribute has been used to enable features on the widget only if needed.

```
<ImageView android:visibility="visible"
	widget-override="ImageView" 
	android:id="@+id/cropToPadding0"
	android:layout_width="match_parent"
	android:layout_height="wrap_content" 
	android:padding="10dp"
	android:scaleType="fitStart"  
	enableFeatures="decorator"
	iosClipsToBounds="true" 
	android:src="@drawable/paris"
	android:cropToPadding="true"></ImageView>    
```

ios natively does not support fitStart scaleType. To enable this feature, we need a wrapper view surrounding the ImageView and the imageview is positioned and clipped with clipBounds attribute. This way ios can support all the scaleType attributes.

## Drag & Drop

The drag and drop can be achieved by configuring few attributes as shown below:

```
<View
	widget-override="View"
	android:id="@+id/onDrag0"
	asDragSource="emailIntent=testObj.emailIntent from testObj->view"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:layout_margin="10dp"
	android:minHeight="50dp"
	android:background="#ff0"/>
<View
	onDrag="onDrag"
	android:id="@+id/onDrag1"
	android:background="@drawable/drag_hovered_selector"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:layout_margin="10dp"
	android:minHeight="50dp"/>
```

asDragSource marks View with id **onDrag0** as draggable and associated transfer object **emailIntent**. onDrag marks the View with id **onDrag1** as droppable and associates onDrag listener with it. When a drop happens on **onDrag1** View, transfer object "emailIntent" is transferred to this View.

## Custom Attributes

The following table lists the custom attributes used in widgets:
### View
Name                	| Description
-------------       	| -------------
enableFeatures      	| Used for enabling dynamic feature on widgets. By default the feature is disabled. 
invalidateOnFrameChange | When this flag is set, the widget is invalidated on frame change during a measure pass.
systemAndroidAttrStyle 	| The theming of widget is usally done in system_style.xml. Hence any advanced theming for android can only be done in system_system.xml. To override the look and feel for only one widget, this attribute can be used. E.g. android:attr/progressBarStyleHorizontal
systemStyle   		| Any style defined in system_style.xml can be referenced using this attribute and is only applied to android widget.
swtStyle   		| References the style attribute passed to the constructor. e.g. Control(Composite parent, **int style**)
swtResizeOptions 	| SWT image is resized to fit the view. SWT image can resized using GC or use awt BufferedImage. Resize options is simple css expression which provides control over on how to resize an image to get the desired quality. See section **Resizing Image**

## Resizing Image
Image can be set using src attribute on ImageView, ImageButton or on background attribute on View in android. To simulate the scaling of images on other platforms, custom attributes has been introduced to give more control over image resizing.

* SWT

SWT provides low level method for resizing images using GC. Though the quality is acceptable in most cases, the image might not look good after resizing. In such cases when quality of image is not within the acceptable standards, we can use BufferedImage for resizing. It might be noted that the GC is very fast when compared to BufferedImage resizing and has been configured as the default option.

#### Custom Attributes
swtResizeOptions - Simple CSS expression 

```
    <string name="profile_img_expr">src: @string/userBufferedImageExpression</string>
    <string name="userBufferedImageExpression">useBufferedImage: true;useBackgroundHint : false</string>
```
The above code snippet configures image resizing to use BufferedImage for the src attribute of an ImageView.
The following resize option are available:

Name                	| Type 			|Description
-------------       	| -------------		|-------------	
useBufferedImage      	| true or false		| When set to true, BufferedImage is used for resizing. Default is GC
useParentBackground	| true or false		| When set to true, the transparent pixels of the image are replaced with the background of the parent view. This is important attribute as the SWT does not support transparency.
useBackgroundHint	| true or false		| When set to true, the transparent pixels of the image are replaced with the backgroundHint attribute.
backgroundHint		| color			| The transparent pixels of the image are replaced with the color specified. Only works if useBackgroundHint is set to true.
retainGCTransparency	| true or false		| When image is resized in SWT, image looses transparency. When this flag is set to true, transparent pixels are retained by using the first pixel value of the image. For this option to work, the first pixel of the image must be transparent. 
colorSmoothenGcFilter	| expression		| e.g r > 100 && g > 100 && b > 100. Only works if retainGCTransparency is set to true. The above expression is used on the image to replace all pixels matching the above expression with the first pixel of the image.
bufferedImageScalingMethod | enum		| Scalr is used for resizing BufferedImage. Scalr provides various methods of resizing. See [https://github.com/rkalla/imgscalr]. Only works if useBufferedImage is set to true.


