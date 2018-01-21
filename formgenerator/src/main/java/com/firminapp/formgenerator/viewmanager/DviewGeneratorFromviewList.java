package com.firminapp.formgenerator.viewmanager;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import org.json.JSONArray;

import java.util.ArrayList;

/**
 * Created by firmin on 20/01/18.
 */

public class DviewGeneratorFromviewList extends ArrayList<View> {
    private Context context;

    private String TAG=DviewGeneratorFromviewList.class.getSimpleName();

    public DviewGeneratorFromviewList(Context context){
        super();
        this.context=context;
        //super.addAll(listviews);

    }
    public LinearLayout generate()
    {
        LinearLayout rootview=null;
        if (this.size()<=0)
        {
            Log.e(TAG," nom de vue siw 0"+this.size());
            return rootview;
        }
        else
        {

            rootview=new LinearLayout(context);
            rootview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            rootview.setOrientation(LinearLayout.VERTICAL);
            for (View v:this)
            {
                rootview.addView(v);
            }
        }


        Log.e(TAG," nom de vue"+this.size());
        return rootview;
    }
    public JSONArray collectedData()
    {
        JSONArray array=new JSONArray();

        return array;
    }
    //liste de vi

}
