package com.firminapp.formgenerator.models;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.firminapp.formgenerator.config.DViewType;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by firmin on 20/01/18.
 */

public class Dcheckbox extends android.support.v7.widget.AppCompatCheckBox {
    private JSONObject jsondescriptor;
    private String kefield;
    private DViewType viewType;
    public Dcheckbox(Context context, JSONObject descriptor) {
        super(context);
        this.viewType=DViewType.Dtextview;
        this.jsondescriptor=descriptor;
        String text= null;
        try {
            text = jsondescriptor.has("label")?this.jsondescriptor.getString("label"):"";
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.setText(text);

    }
    public  Dcheckbox generate(){
        return this;
    }
    public Dcheckbox(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Dcheckbox(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
