package helpers;

public class Service {
    private final Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean query(String query) {
        return database.isAvailable();
    }

    @Override
    public String toString() {
        return "Используется база данных с ID:" + database.getUniqueId();
    }
}