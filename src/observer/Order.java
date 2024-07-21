package observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void createOrder(String order) {
        System.out.println("Pedido criado: " + order);
        notifyObservers(order);
    }

    private void notifyObservers(String order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
}
