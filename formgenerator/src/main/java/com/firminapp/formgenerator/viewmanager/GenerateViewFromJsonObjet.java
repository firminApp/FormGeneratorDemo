package com.firminapp.formgenerator.viewmanager;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.firminapp.formgenerator.models.Dcheckbox;
import com.firminapp.formgenerator.models.DediteText;
import com.firminapp.formgenerator.models.Dmultiselect;
import com.firminapp.formgenerator.models.Dspinner;
import com.firminapp.formgenerator.models.DtextView;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by firmin on 20/01/18.
 */

public class GenerateViewFromJsonObjet {
    //type de la vue a gerer
   // private DViewType type;
    private String TAG=GenerateViewFromJsonObjet.class.getSimpleName();
    private Context context;
    private JSONObject descriptor;
    public GenerateViewFromJsonObjet(Context context,JSONObject jsonObject){
        this.context=context;
        this.descriptor=jsonObject;
       // this.type=type;
    }
    public View generate(){
        View view=new View(context);
        String type="";
        Log.e(TAG,descriptor.toString());
        if (descriptor!=null)
        {
            try {
                type=descriptor.has("type")?descriptor.getString("type"):"";
                switch (type){
                    case "edittext":
                        view= (EditText)new DediteText(context,descriptor).generate();
                        break;
                    case "textview":
                        view=(DtextView)new DtextView(context,descriptor).generate();
                       // view= new DtextView(context,descriptor).generate();
                        break;
                    case "spinner":
                        view=(Dspinner)new Dspinner(context,descriptor).generate();
                        //view= new Dspinner(context,descriptor).generate();
                        break;
                    case "checkbox":

                        view= new Dcheckbox(context,descriptor).generate();
                        break;
                    case "multiselect":
                        view= new Dmultiselect(context,descriptor).generate();
                        break;


                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }



        return view;
    }
}
