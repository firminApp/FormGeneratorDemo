package com.firminapp.formgenerator.config;

/**
 * Created by firmin on 20/01/18.
 */

public enum DViewType {
    DeditText("editText"),

    Dtextview ("textView"),

    Dbutton ("button"),

    Dspinner ("spinner"),
    Dmultiselect ("multiselect"),
    Dcheckbox ("checkbox"),
    Drecyclerview ("recyclerview"),
    DimageView ("imageView");


    private String name = "";


    //Constructeur

    DViewType(String name){

        this.name = name;


    }



    public String toString(){

        return name;

    }
}
