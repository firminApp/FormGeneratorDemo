# FormGeneratorDemo

Welcome to the FormGeneratorDemo wiki!

#interret

ce projet a pour but de faciliter la génération automatique des formulaire dans une application android a partir d'un fichier json descriptif;

#Installation

insserer just la dépendnce nécessaie dans le fichier gradle de votre projet

    dependencies {
     compile 'com.github.firminApp:dformgenerator:-SNAPSHOT'
      } 
Aussi si cela n'a pas déja été fait ajouter jitpak allprojects 
  
   `{ 
    repositories { 
                 ... 
                 maven {
                    url 'https://jitpack.io' 
                        } 
                    }
    }`
#version
Cette toute première version de la librairie ne supporte que la création de quelques vues à savoir:
**EditText (DeditText)**
**TextView (DtextView)**
**Spinner (Dspinner)**
**CheckBox (DcheckBox)**
**MultiSelect (Dmultiselect)**
D'autres vont être ajoutées très prochainement dans les mises à jours à venir
