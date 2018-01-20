package com.firminapp.formgeneratordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.firminapp.formgenerator.viewmanager.DviewsGeneretFromJsonArray;

import org.json.JSONArray;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {

    private String s="[{\"type\":\"edittext\",\n" +
            "  \"label\":\"entrer un texte ici\",\n" +
            "\"contentType\":\"text\"\n" +
            "\n" +
            "  \n" +
            "},{\n" +
            "  \"type\":\"edittext\",\n" +
            "  \"label\":\"entrer un nombre ici\",\n" +
            "\"contentType\":\"nombre\"\n" +
            "  \n" +
            "},{\n" +
            "  \"type\":\"edittext\",\n" +
            "  \"label\":\"entrer un nemero de téléphone  ici\",\n" +
            "\"contentType\":\"tel\"\n" +
            "  \n" +
            "},{\n" +
            "  \"type\":\"edittext\",\n" +
            "  \"label\":\"entrer un texte ici\",\n" +
            "\"contentType\":\"text\"\n" +
            "  \n" +
            "}]";
    private LinearLayout rootframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JSONArray array=null;
       // setContentView(R.layout.activity_main);
        //rootframe=(LinearLayout)findViewById(R.id.rootfram);
        try {
            array=new JSONArray(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        View v=new DviewsGeneretFromJsonArray(this,array).generate().generate();
        setContentView(v);
        // LinearLayout fl=(LinearLayout) v;
        // rootframe.addView(v);


    }
}
