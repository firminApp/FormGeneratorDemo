FormGeneratorDemo
#Puspose
This project helps you automatically generate forms in an android app from a json file. We aim to give android developers an easy way to handle dynamic forms.
#Installation
Just add this dependency to your project.
dependencies {
 compile 'com.github.firminApp:dformgenerator:1.0.0'
  } 
And make sure you got jitpack added to the project. 
{ 
repositories { 
   ... 
   maven {
      url 'https://jitpack.io' 
    } 
  }
}
How it works
The project works like this:  A json describing the form structure have to be created and sent as parameter to the constructor of the class with then generate the form.
#In this version the library can just help you generate the following views:
EditText (DeditText)
TextView (DtextView)
Spinner (Dspinner)
CheckBox (DcheckBox)
MultiSelect (Dmultiselect)

##Some other views will be added very soon by our contributors. Any Android developper can actually contribute to this project just have a basic git knowledge clone the project add your modifications make a commit and push your code. We will contact you as soon as we need further informations about the feature you added before the merge. Hurry up if you want to contribute cause we might need to limit the number of contributors. 
###Features to be added soon:
1. RecyclerView generation
2. ImageView generation
3. Customization of the created views
4. Handling the data reception from the form.
5. Adding validation to the data input on the views.
6. Proposition of a good project architecture
7. If you think about something else feel free to code it and add a commit.
