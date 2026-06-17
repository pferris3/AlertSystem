public class EmailService implements NotificationMedium {
    
    public void send(String str){
        System.out.println("Email: " + str);
    }

}