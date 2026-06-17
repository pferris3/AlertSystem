public class SMSService implements NotificationMedium {
    
    public void send(String str){
        System.out.println("SMS: " + str);
    }

}
