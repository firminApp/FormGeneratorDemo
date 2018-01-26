package com.firminapp.formgenerator.viewmanager;

import android.content.Context;
import android.view.View;

import org.json.JSONArray;

/**
 * Created by firmin on 23/01/18.
 */

public class DVgenerator {
    private JSONArray views;
    private Context context;

    public DVgenerator(JSONArray views, Context context) {
        this.views = views;
        this.context = context;
    }
    public View generate()
    {
        return new DviewsGeneretFromJsonArray(context,views).generate().generate();
    }
}
