package programmer.masa.kini.application;

import programmer.masa.kini.error.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {
        connectDatabase("Adri", "Tuhu");
        System.out.println("Success");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Can not connect to database");
        }

    }
}

