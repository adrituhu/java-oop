package programmer.masa.kini.data;

public class Application {

    public static final int PROCESSORS;


    static {
        System.out.println("mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}
