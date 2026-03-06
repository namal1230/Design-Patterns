package org.example.singleton;

public class Database {

    private static Database database;

    private Database(){

    }

    public static synchronized Database getInstance(){
        if (database == null) {
            database = new Database();
        }
        return database;
    }
}
