package com.aurovo.tack;

/**
 * Basic message collection 
 */
public class Message extends BaseCollection {
    
    //Declares the state
    public enum STATE {
        CREATED,
        STARTED,
        PROCESSING,
        DONE
    }
    
    //State of the message
    private STATE state;
    
    //0 to 100
    private int percentage;
    
    //Message
    private String body;

    //Default constructor
    public Message() {
        this.state = STATE.CREATED;
        this.percentage = 0;
        this.body = "";        
    }
    
    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
}
