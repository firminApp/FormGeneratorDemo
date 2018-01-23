package com.firminapp.formgenerator.viewmanager.interfaces;

import android.view.View;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by firmin on 22/01/18.
 */

public interface ViewModelClicklistener extends View.OnClickListener {
    void onCollectData(String keyfield);

}
