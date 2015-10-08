package com.aurovo.tack;

import org.bson.types.ObjectId;

public class TackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create the message API
        Tack tack = new Tack("http://localhost:8084/tack-api");
        
        //TODO: Implement a test that demonstrates the four functions
        //fetch, save, update, delete
        
        //Create a new message
        //TODO: Implement message builder
        Message msg = new Message();
        msg.setState(Message.STATE.PROCESSING);
        
        //Save the message
        Message saveMsg = tack.save(new Message());
        
        //Fetch the message
        Message fetchmsg = new Message();
        fetchmsg.setId(saveMsg.getId());
        
        msg = tack.fetch(fetchmsg);
                
        //Update the message
        tack.update(fetchmsg);
        
        //Delete
        tack.delete(fetchmsg);
        
        
    }
    
}
