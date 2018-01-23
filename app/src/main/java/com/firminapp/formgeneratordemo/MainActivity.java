package com.firminapp.formgeneratordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.firminapp.formgenerator.viewmanager.DviewsGeneretFromJsonArray;

import org.json.JSONArray;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {

    private String s="[\n" +
            "  {\"type\":\"edittext\",\"label\":\"Un edittext pour la saisie\",\"contentType\":\"text\"},\n" +
            "  {\"type\":\"textview\",\"label\":\"Un textView pour afficher les labeles\",\"contentType\":\"text\"}\n" +
            "  ,\n" +
            "  {\"type\":\"checkbox\",\"label\":\"Un checkbox a checker\",\"contentType\":\"text\"}\n" +
            "  ,\n" +
            "  {\"type\":\"multiselect\",\"label\":\"Un multiselect\",\"contentType\":\"text\",\n" +
            "  \"items\":[\n" +
            "    {\n" +
            "      \"label\":\"un item 1\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"label\":\"un autre item 1\"\n" +
            "    }\n" +
            "    ,\n" +
            "    {\n" +
            "      \"label\":\"un autre item 1 le dernier\"\n" +
            "    }]\n" +
            "  }\n" +
            "  ,\n" +
            "  {\"type\":\"spinner\",\"label\":\"entrer un texte ici\",\"contentType\":\"text\",\n" +
            "    \"items\":[\n" +
            "    {\n" +
            "      \"label\":\"un item 1\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"label\":\"un autre item 1\"\n" +
            "    }\n" +
            "    ,\n" +
            "    {\n" +
            "      \"label\":\"un autre item 1 le dernier\"\n" +
            "    }]\n" +
            "  }\n" +
            "  ,\n" +
            "  {\"type\":\"edittext\",\"label\":\"entrer un texte ici\",\"contentType\":\"text\"}]";
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
