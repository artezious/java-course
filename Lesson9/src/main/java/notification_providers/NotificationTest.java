package notification_providers;

/**
 * Created by WEO on 7/19/16.
 */
public class NotificationTest {

    private SendNotificationSpec sendNotificationProvider;

    public static void main(String[] args) {

        NotificationTest test = new NotificationTest();
        SendNotificationSpec sendNotificationProvider = new SMProviderX();
        test.clickSendMessageButton(new SMProviderX());
        test.clickSendMessageButton(new SMProviderY());
        test.clickSendMessageButton(new SMProviderZ());

    }
    public void  clickSendMessageButton (SendNotificationSpec sendNotificationProvider) {

        sendNotificationProvider.sendNotification();

    }

}
