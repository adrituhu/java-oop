package programmer.masa.kini.data;

public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Membuat Object");
    }

    public LoginRequest (String username) {
        this("Adri", "");
    }

    public LoginRequest(){
        this("", "");
    }

}
