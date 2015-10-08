package com.aurovo.tack;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import org.json.JSONObject;

/**
 * Implements the HTTP connection to make REST calls
 */
public class TackHttp {

    private String url;
    private OkHttpClient client;
    
    /**
     * Takes the API base URL
     * @param baseurl 
     */
    public TackHttp(String baseurl) {
        this.url = baseurl;
    }
    
    //TODO: Change to a template
    public Message get(String id) throws IOException {
        
        Request request = new Request.Builder()
                .url(url)
                .url("/messages/"+id)
                .build();
        
        Response response = client.newCall(request).execute();
        
        //Validate response
        if(!response.isSuccessful()) {
            throw new IOException("Unexcected code "+response);
        }
        
        //JSON to object
        Gson gson = new Gson();        
        return gson.fromJson(response.body().charStream(), Message.class);
        
    }
            
    
    //TODO: Using okHTTP implement methods for
    //GET, POST, PUT and DELETE that will call the appropriate APIs
    //and use GSON to format the JSON message back into the Message 
    //class.
 
    
}
