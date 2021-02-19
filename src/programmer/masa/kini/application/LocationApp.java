package programmer.masa.kini.application;

import programmer.masa.kini.data.*;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); //Error
        var city = new City();
        city.name = "Makassar";

        System.out.println(city.name);
    }

    public static class ProductApp {
        public static void main(String[] args) {
            Product product = new Product("Mac Book Pro", 30000000);
            System.out.println(product.name);
            System.out.println(product.price);
        }
    }
}
