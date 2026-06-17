public class AlertSystem {
    
    NotificationMedium medium;

    public void setMedium(NotificationMedium pMedium){
        medium = pMedium;
    }

    public void notifyUser(String message){
        
        if (medium != null){
            medium.send(message);
        } else {
            System.out.println("Please set a notification medium");
        }
    }

    public static void main(String[] args) {
        
        EmailService email = new EmailService();
        SMSService sms = new SMSService();

        AlertSystem alert = new AlertSystem();

        alert.notifyUser("message");

        alert.setMedium(sms);
        alert.notifyUser("message");


        alert.setMedium(email);
        alert.notifyUser("message");

    }

}
