package programmer.masa.kini.util;

import programmer.masa.kini.data.LoginRequest;
import programmer.masa.kini.error.BlankException;
import programmer.masa.kini.error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password() == null) {
            throw new ValidationException("Password is null");
        }

    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password() == null) {
            throw new BlankException("Password is null");
        }

    }

    public static void validationReeflection(Object object){

    }
}