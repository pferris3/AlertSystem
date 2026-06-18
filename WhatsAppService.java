/**
 * 
 * I passed the code from the EmailService class to ChatGPT and entered the following query: 
 * "Change the class from "EmailService" to "WhatsAppService" and the system output of the send method to 
 * "'[WhatsApp] Sending message: ' + str "". 
 * 
 * Used as is. 
 * 
 * This class creates an WhatsApp service to alert a user via WhatsApp. It implements the NotificationMedium interface. 
 * 
 * @author Paul Ferris
 * @version 1.0.0
 */ 

public class WhatsAppService implements NotificationMedium {

    /**
     * This method from the NotificationMedium class takes a string as a parameter
     * and outputs it to the user.
     *
     * @param str String to be output to the user
     */
    @Override
    public void send(String str) {
        System.out.println("[WhatsApp] Sending message: " + str);
    }

}