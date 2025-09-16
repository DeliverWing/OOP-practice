package entity.six;

public class EmailSender implements INotificationSender{

    @Override
    public void Send(String message) {
        System.out.println("email send :" + message);
    }
}
