package programmer.masa.kini.application;

import programmer.masa.kini.annotation.Fancy;
import programmer.masa.kini.data.Animal;
import programmer.masa.kini.data.Cat;

@Fancy(name = "Animal App", tags = {"java", "application"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Kribo";
        animal.run();
    }
}
