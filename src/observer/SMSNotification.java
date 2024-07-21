package observer;

public class SMSNotification implements OrderObserver {
    @Override
    public void update(String order) {
        System.out.println("SMS enviado: " + order);
    }
}
