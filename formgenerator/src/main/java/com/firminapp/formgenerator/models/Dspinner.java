package com.firminapp.formgenerator.models;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.firminapp.formgenerator.R;
import com.firminapp.formgenerator.config.DViewType;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by firmin on 20/01/18.
 */

public class Dspinner extends android.support.v7.widget.AppCompatSpinner {
    private JSONObject jsondescriptor;
    private String kefield;
    private DViewType viewType;
    private ArrayList<String>items;

    public Dspinner(Context context, JSONObject descriptor) {
        super(context);
        items=new ArrayList<>();
        this.viewType=DViewType.Dtextview;
        this.jsondescriptor=descriptor;
        String text= null;
        JSONArray listems=null;
        try {
            text = jsondescriptor.has("label")?this.jsondescriptor.getString("label"):"";
            listems=jsondescriptor.has("items")?jsondescriptor.getJSONArray("items"):null;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //le titre de la liste des choix
        //TextView tv=new TextView(context);
       // tv.setText(text);
        //this.addView(tv);

        //liste des choix

        for(int i=0; i<listems.length();i++)
        {
           String item=null;

            try {
                //les items sont des objets pour etre facilement manipulable
                item=jsondescriptor.getJSONArray("items").getJSONObject(i).getString("label");
                items.add(item);

                //items.add(dc);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        ArrayAdapter<String> spadapter=new ArrayAdapter(context, R.layout.support_simple_spinner_dropdown_item,items);
        this.setAdapter(spadapter);
    }

    public Dspinner(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Dspinner(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public  Dspinner generate(){
        return this;
    }

}
