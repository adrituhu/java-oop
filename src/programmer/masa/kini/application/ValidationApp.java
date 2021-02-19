package programmer.masa.kini.application;

import programmer.masa.kini.annotation.Fancy;
import programmer.masa.kini.data.LoginRequest;
import programmer.masa.kini.error.ValidationException;
import programmer.masa.kini.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginrequest = new LoginRequest("Adri", "Superuser");

        try {
            ValidationUtil.validate(loginrequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest("Adri", "Superuser");
        ValidationUtil.validateRuntime(loginRequest2);

    }

}
