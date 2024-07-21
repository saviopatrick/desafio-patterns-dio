import database.DatabaseConnection;
import factory.*;
import observer.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        // Factory Method
        ProductFactory bookFactory = new BookFactory();
        Product book = bookFactory.createProduct();
        System.out.println("Produto criado: " + book.getName());

        ProductFactory electronicFactory = new ElectronicFactory();
        Product electronic = electronicFactory.createProduct();
        System.out.println("Produto criado: " + electronic.getName());

        // Observer
        Order order = new Order();
        order.addObserver(new EmailNotification());
        order.addObserver(new SMSNotification());

        order.createOrder("Pedido #1");
    }
}
