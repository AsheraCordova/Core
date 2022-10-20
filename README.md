# Core
Core project which adds native support for cordova project.

The project provides the following functionality
* Basic Widgets and Android Layouts
* Validation support
* Unidirectional Databinding framework
* Cross platform JSON
* Cross platform file system access
* Converters

Ashera support the following platforms:

OS            | Framework
------------- | -------------
Android       | Android
IOS           | J2objc
Windows       | SWT
Mac           | SWT
Linux         | SWT

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
```  

The above snippet adds editText with id "test1" to a form group "loginForm" with mandatory validation added. It display the error message on a label with id "test1Error" and changes style o errorStyle when validation fails. It displays an custom error message "Sample text" when validation fails. 

validationErrorDisplayType can be of 3 types:
* popup - Only supported on android. Uses android setError on EditText.
* label - Display error text in label with id + Error.
* style - Changes the style property when validation fails. Uses style and errorStyle on the widget.

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

**var - E.g let x = . from y->view into session as map**

The above statement stores a intermediate variable x into session as map

* modelPojoToUi - E.g text=abcd from x->view
Set text attribute on widget to abcd attribute from object x stored in scope view.

* modelUiToPojo - e.g abcd=text into x->view
Set abcd attribute on object x stored in scope view to text attribute on widget.

* Event - e.g y=z from z->view
Store y to from object in scope view into event map.

* var store - e.g y->intent as pathmap
Store the object into a variable y on intent with type pathmap.

* var get - e.g z from z->view
Get z attribute from object z in scope view.

* loop var - e.g let x in c from y->view into session as pathmap
Loop over c attribute of type list on object y in scope view. Create loop var x of type pathmap.

### Custom Methods/Attributes

Name                | Description
-------------       | -------------
modelPojoToUi       | Used for synchronizing object to ui.
modelSyncEvents     | Used for synchronizing ui to object.
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
    modelSyncEvents="onKey"
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
