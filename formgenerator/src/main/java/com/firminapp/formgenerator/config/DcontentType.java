package com.firminapp.formgenerator.config;

import android.text.InputType;

/**
 * Created by firmin on 20/01/18.
 */

public enum DcontentType {
    Nombre("nombre", InputType.TYPE_CLASS_NUMBER),

    Text ("text",InputType.TYPE_CLASS_TEXT),

    tel ("tel",InputType.TYPE_CLASS_PHONE),
;


    private String name = "";
private int type;

    //Constructeur

    DcontentType(String name, int type){

        this.name = name;
        this.type=type;


    }



    public String toString(){

        return name;

    }
}
