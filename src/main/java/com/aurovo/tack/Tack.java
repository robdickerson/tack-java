package com.aurovo.tack;

import org.bson.types.ObjectId;

public class Tack {

    private String url;
    
    private TackHttp tackHttp;
    
    /**
     * Constructor takes the URL of the API
     * @param url 
     */
    public Tack(String url) {        
        this.url = url;
        
        //Define the API URL
        tackHttp = new TackHttp("http://localhost:8084/tack-api/");
    }

    /**
     * Get a message from the database
     * @param msg
     * @return 
     */
    public Message fetch(Message msg) {
        
        Message respmsg = null;
        
        //TODO: Execute GET API call
        try {
            
            respmsg = tackHttp.get(msg.getId().toString());
            
        } catch (Exception e) {
            //TODO: Handle exceptions
        }
        
        
        return respmsg;
    }
    
    /**
     * Save a message to the database
     * @param msg
     * @return 
     */
    public Message save(Message msg) {
        
        
        return new Message();
    }
    
    /**
     * Update the message in the database
     * @param msg
     * @return 
     */
    public Message update(Message msg) {
    
        
        
        return new Message();
    }
    
    /**
     * Delete the message in the database
     * @param msg
     * @return 
     */
    public Message delete(Message msg) {
        
        
        return new Message();
    }
    
}
