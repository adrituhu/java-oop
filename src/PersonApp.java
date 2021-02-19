public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Adri", "Makassar");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Jaswan");

        Person  person2 = new Person("Ghotti");
        person2.sayHello("Rehmalem");

        Person person3 = new Person();
        person3.name = "Yudha";
        person3.sayHello("Andri");
    }
}
