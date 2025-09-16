package entity.six;

public class SmsSender implements INotificationSender{

    @Override
    public void Send(String message) {
        System.out.println("Sms sent : "+message);
    }
}
