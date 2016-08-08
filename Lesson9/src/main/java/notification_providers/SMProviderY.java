package notification_providers;

/**
 * Created by WEO on 7/19/16.
 */
public class SMProviderY implements SendNotificationSpec{

    public void sendNotification() {
        System.out.println((getClass().getName() + " :: message "));
    }
}
