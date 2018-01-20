package com.firminapp.formgenerator.viewmanager;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by firmin on 20/01/18.
 */

public class DviewsGeneretFromJsonArray {
    private JSONArray jsonArray;
    private Context context;
    public DviewsGeneretFromJsonArray(Context context, JSONArray array)
    {
        this.jsonArray=array;
        this.context=context;
    }
    public DviewGeneratorFromviewList generate(){
        DviewGeneratorFromviewList lv=new DviewGeneratorFromviewList(context);

        if (this.jsonArray==null||jsonArray.length()<=0)
        {
            return lv;
        }
        for (int i=0;i<jsonArray.length();i++)
            try {
                lv.add(new GenerateViewFromJsonObjet(context,jsonArray.getJSONObject(i)).generate());
            } catch (JSONException e) {
                e.printStackTrace();
            }

        return lv;
    }
}
