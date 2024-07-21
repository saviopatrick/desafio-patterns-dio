package database;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Construtor privado para impedir instâncias externas


    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado ao banco de dados.");
    }
}
