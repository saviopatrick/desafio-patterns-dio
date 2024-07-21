package observer;

public class EmailNotification implements OrderObserver {
    @Override
    public void update(String order) {
        System.out.println("Email enviado: " + order);
    }
}

