package com.firminapp.formgenerator.models;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firminapp.formgenerator.config.DViewType;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by firmin on 20/01/18.
 */

public class Dmultiselect extends LinearLayout {
    private JSONObject jsondescriptor;
    private String kefield;
    private DViewType viewType;
    private ArrayList<Dcheckbox>items;

    public Dmultiselect(Context context, JSONObject descriptor) {
        super(context);
        this.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        this.setOrientation(VERTICAL);
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
        TextView tv=new TextView(context);
        tv.setText(text);
        this.addView(tv);

        //liste des choix
        for(int i=0; i<listems.length();i++)
        {
            JSONObject itemdescriptor=null;
            try {
                itemdescriptor=listems.getJSONObject(i);
                Dcheckbox dc=new Dcheckbox(context,itemdescriptor);
                this.addView(dc);
                items.add(dc);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

    }
    public  Dmultiselect generate(){
        return this;
    }
    public Dmultiselect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Dmultiselect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
