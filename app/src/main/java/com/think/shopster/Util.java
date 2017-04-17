package com.think.shopster;

import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by anand on 17/04/17.
 */

public class Util {

    public static ArrayList<ProductData> getDataFromServer(String urlString) throws IOException {
        URL url= new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            return readStream(in);
        }
        catch(Exception e){
            return null;
        }
        finally {
            urlConnection.disconnect();
        }
    }

    private static ArrayList<ProductData> readStream(InputStream in) {

    }

}
