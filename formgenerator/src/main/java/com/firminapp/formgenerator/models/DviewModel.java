package com.firminapp.formgenerator.models;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.firminapp.formgenerator.config.DViewType;

import org.json.JSONObject;

/**
 * Created by firmin on 22/01/18.
 */

public class DviewModel extends View {
    private JSONObject jsondescriptor;
    //private String kefield;
   // private String label;

    private DViewType viewType;
    public DviewModel(Context context, JSONObject descriptor) {
        super(context);
        this.jsondescriptor=descriptor;
    }

    public DviewModel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DviewModel(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public View getView (){
        return  null;
    }

    public  DviewModel generate(){
        return this;
    }
}
