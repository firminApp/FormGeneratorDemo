# FormGeneratorDemo

Welcome to the FormGeneratorDemo wiki!

##interret

ce projet a pour but de faciliter la génération automatique des formulaire dans une application android a partir d'un fichier json descriptif;

##Installation

insserer just la dépendnce nécessaie dans le fichier gradle de votre projet

        dependencies 
        { 
        compile 'com.github.firminApp:dformgenerator:1.0.0' 
        }
Aussi si cela n'a pas déja été fait ajouter jitpak 
        
        allprojects { repositories
         { ... maven 
         { url 'https://jitpack.io' } 
         } 
         }
  ## Principe
  
  Le principe de fonctionnement de ce projet est le suivent:
  Un json définissant la structure du formulaire à générer est est envoyé au constructeur de la classe qui se charge de la générer.
  
 ##Les vues gérées
 
 Dans la version actuelle du projet, les vues  gérées sont:
 
