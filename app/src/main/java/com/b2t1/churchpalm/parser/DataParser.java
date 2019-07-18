package com.b2t1.churchpalm.parser;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.android.gms.maps.model.LatLng;

import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataParser {

    public Map<Integer,List<LatLng>> parse(Context context){

        JSONParser parser = new JSONParser();


        JSONArray jObject = null;
        try {

            AssetManager manager = context.getAssets();
            InputStream file = manager.open("pontosref.json");

            jObject = (JSONArray) parser.parse(new InputStreamReader(file, "UTF-8"));

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<LatLng> l1 = new ArrayList<LatLng>();
        List<LatLng> l2 = new ArrayList<LatLng>();
        List<LatLng> l3 = new ArrayList<LatLng>();



        Map<Integer,List<LatLng>> location = new HashMap<Integer, List<LatLng>>();
//        new LocationsDBController(context).clearAllLocations();


        for(int i= 0; i< jObject.size(); i++){
            JSONObject temp  = (JSONObject) jObject.get(i);
            if(convertDouble( temp.get("categoria")) == 1){
                LatLng latLng = new LatLng((double) temp.get("latitude"), (double)temp.get("longitude"));
                l1.add(latLng);

            } else if((convertDouble( temp.get("categoria")))== 2){
                LatLng latLng = new LatLng((double) temp.get("latitude"), (double)temp.get("longitude"));
                l2.add(latLng);

            } else if(convertDouble( temp.get("categoria")) == 3){
                LatLng latLng = new LatLng((double) temp.get("latitude"), (double)temp.get("longitude"));
                l3.add(latLng);


            }
        }
        location.put(1, l1);
        location.put(2, l2);
        location.put(3, l3);


        return location;

    }
    static double convertDouble(Object longValue){
        double valueTwo = -1; // whatever to state invalid!

        if(longValue instanceof Long)
            valueTwo = ((Long) longValue).doubleValue();

        return valueTwo;
    }


}