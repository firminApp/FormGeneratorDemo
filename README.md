# FormGeneratorDemo



#interret

Ce projet a pour but de faciliter la génération automatique des formulaire dans une application android a 
partir d'un fichier json descriptif. l'idée est de pouvoir permettre aux développeurs android de 
de gérer plus facillement la génération dynamique des formulaire.

#Installation

insserer just la dépendance nécessaie dans le fichier gradle de votre projet

    dependencies {
     compile 'com.github.firminApp:dformgenerator:1.0.0'
      } 
Aussi si cela n'a pas déja été fait ajouter jitpak allprojects 
  
    { 
    repositories { 
                 ... 
                 maven {
                    url 'https://jitpack.io' 
                        } 
                    }
    }
 ## Principe
      
  Le principe de fonctionnement de ce projet est le suivent:
  Un json définissant la structure du formulaire à générer est est envoyé au constructeur de la classe qui se charge de la générer.
  
#version
Cette toute première version de la librairie ne supporte que la création de quelques vues à savoir:

**EditText (DeditText)**

**TextView (DtextView)**

**Spinner (Dspinner)**

**CheckBox (DcheckBox)**

**MultiSelect (Dmultiselect)**


D'autres vont être ajoutées très prochainement dans les mises à jours à venir par les contriuteurs du projet
##Notes aux contributeurs du projet
N'importe quel développeur android maitrisant le git peut participer 
à ce projet. Télécharger la version actuelle du projet dans votre IDE,
apporter vos modifications, et faites le push. Vous serai contactez 
si nous avons besoin des informations complementaires concernant votre code avant le merge.
Le projet n'ai qu'a ces début. Nous limitterons bientot le nombre de participants actives. Si 
vous avez envi de contribuer, n'attendez donc pas ledernier moment.
###Fonctionalitées à développer:

1. Génération de RecyclerView
2. Génération des ImageView
3. Gestion des personnalisations des vues créées
4. Gestion de l'envoi des données saisies
5. Controle de saisie dans les vues
6. proposition d'une bonne achitecture du projet
7. ... et toutes vos autres inspirations allant de le sens du projet.
##NB
Si vous penssez à une fonctionalitée aue vous ne pouvez pas dévellopper,
 proposez là tout de meme.


