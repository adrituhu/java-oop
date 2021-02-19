package programmer.masa.kini.application;

import programmer.masa.kini.data.Avanza;
import programmer.masa.kini.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());

        car.drive();
    }
}
