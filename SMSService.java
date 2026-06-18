/**
 * 
 * Query following interface query: "can you implement that method with a system output that 
 * indicates the notification medium used is an sms." 
 * Used as is. 
 * 
 * This class creates an SMS service to alert a user via text. It implements the NotificationMedium interface. 
 * 
 * @author Paul Ferris
 * @version 1.0.0 
 */

public class SMSService implements NotificationMedium {
    
    /**
     * 
     * This method from the NotificationMedium class takes a string as a parameter and outputs it to
     * the user
     * 
     * @param str - String to be output to the user
     */
    public void send(String str){
        System.out.println("SMS: " + str);
    }

} 
