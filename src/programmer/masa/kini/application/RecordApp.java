package programmer.masa.kini.application;

import programmer.masa.kini.data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Adri", "Superuser");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Adri"));
        System.out.println(new LoginRequest("Adri", "Superuser"));

    }

}
