/**
 * 
 * Query: "create a public java interface with a public method called "send" that takes 
 * a string as a parameter and returns nothing." 
 * Used as is. 
 * 
 * This interface lays the framework for notification systems including a method to send a message.
 * 
 * @author Paul Ferris
 * @version 1.0.0 
 */

public interface NotificationMedium {

    /**
     * 
     * This method takes in a string and outputs it to the user.
     * 
     * @param message - String to be output to the user
     */
    public void send(String message);

}