package programmer.masa.kini.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Adri";
        first = first + " Tuhu";

        String second = "Adri";
        second = second + " Tuhu";

        System.out.println(first.equals(second));

        String third = "Jaswan";
        third = third + " Tuhu";

        System.out.println(third.equals(second));

    }



}
