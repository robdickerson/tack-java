package com.aurovo.tack;

import org.bson.types.ObjectId;

public class Tack {

    private String url;
    
    /**
     * Constructor takes the URL of the API
     * @param url 
     */
    public Tack(String url) {        
        this.url = url;
    }

    /**
     * Get a message from the database
     * @param msg
     * @return 
     */
    public Message fetch(Message msg) {
        
        //TODO: Execute GET API call
        // /messages/:id
        
        return new Message();
    }
    
    /**
     * Save a message to the database
     * @param msg
     * @return 
     */
    public ObjectId save(Message msg) {
        
        
        return new ObjectId();
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
