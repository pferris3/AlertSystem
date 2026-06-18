import java.util.ArrayList;

/**
 * 
 * This class creates an AlertSystem object for different notification mediums to be implemented. 
 * It has a NotificationMedium object as an atrribute and an ArrayList object that stores sent 
 * messages.
 * 
 * @author Paul Ferris
 * @version 1.0.0
 */

public class AlertSystem {
    
    NotificationMedium medium;
    ArrayList<String> messageList = new ArrayList<String>();


    /**
     * 
     * This method takes in a NotificationMedium object as a parameter and assigns it
     * to the medium attribute
     * 
     * @param pMedium - NotificationMedium gets assigned to medium attribute
     */
    public void setMedium(NotificationMedium pMedium){
        medium = pMedium;
    } 

    /**
     * 
     * This method takes in a message string. If the medium attribute is null, the user is 
     * notified that the medium needs to be set. Otherwise, the message is displayed to the 
     * user, and the message is stored in the messageList attribute. 
     * 
     * @param message - String to be displayed to the user
     */
    public void notifyUser(String message){
        
        if (medium != null){
            medium.send(message);
            messageList.add(message);
        } else {
            System.out.println("Please set a notification medium");
        }
    }

    /**
     * 
     * This is the main block used to implement and test the AlertSystem and interwining classes
     * 
     * @param args - Passed from the console, not used
     */
    public static void main(String[] args) {
        
        EmailService email = new EmailService();
        SMSService sms = new SMSService();
        WhatsAppService whatsApp = new WhatsAppService();

        AlertSystem alert = new AlertSystem();



        alert.notifyUser("message1");

        alert.setMedium(sms);
        alert.notifyUser("message2");


        alert.setMedium(email);
        alert.notifyUser("message3");

        alert.setMedium(whatsApp);
        alert.notifyUser("message4");

        System.out.println("");
        System.out.println("Message log:");
        for (String str : alert.messageList) {
            System.out.println(str);
        }
    }

}
