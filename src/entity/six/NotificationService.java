package entity.six;

public class NotificationService {
    INotificationSender notificationSender;
    public NotificationService(INotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void NotifyUser(String message){
        notificationSender.Send(message);
    }
}
