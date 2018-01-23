package com.firminapp.formgenerator.models;

import android.content.Context;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;


import com.firminapp.formgenerator.config.DViewType;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by firmin on 20/01/18.
 */

public class DediteText extends android.support.v7.widget.AppCompatEditText {
    private JSONObject jsondescriptor;
    private String kefield;
    private DViewType viewType;
    public DediteText(Context context, JSONObject descriptor) {
        super(context);
        this.viewType= DViewType.DeditText;
        this.jsondescriptor=descriptor;
        this.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

       this.setVisibility(VISIBLE);
        String hint="";
        //type d'entrées: text, nombre,tel..
        String contentType="";
        try {
           hint= jsondescriptor.has("label")?jsondescriptor.getString("label"):"";
           this.kefield=descriptor.has("keyfield")?descriptor.getString("keyfield"):"";
           contentType= jsondescriptor.has("contentType")?jsondescriptor.getString("contentType"):"";
            switch (contentType){
                case "text":
                   this.setInputType(InputType.TYPE_CLASS_TEXT);// thes default inputType will be use here
                    break;
                case "nombre":
                    this.setInputType(InputType.TYPE_CLASS_NUMBER);
                        break;
                case "tel":
                    this.setInputType(InputType.TYPE_CLASS_PHONE);
                    break;
            }
           this.setHint(hint);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public  DediteText generate(){
        return this;
    }

    public DediteText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DediteText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public JSONObject getJsondescriptor() {
        return jsondescriptor;
    }

    public void setJsondescriptor(JSONObject jsondescriptor) {
        this.jsondescriptor = jsondescriptor;
    }

    public String getKefield() {
        return kefield;
    }

    public void setKefield(String kefield) {
        this.kefield = kefield;
    }

    public DViewType getViewType() {
        return viewType;
    }

    public void setViewType(DViewType viewType) {
        this.viewType = viewType;
    }
}
