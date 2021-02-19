public class PolymorphismeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Jaswan");
        employee.sayHello("Adri");

        employee = new Manager("Jaswan");
        employee.sayHello("Adri");

        employee = new VicePresident("Adri");
        employee.sayHello("Jaswan");

        sayHello(new Employee("Andri"));
        sayHello(new Manager("Jaswan"));
        sayHello(new VicePresident("Adri"));

    }

//    static void sayHello(Employee employee){
//        System.out.println("Hello " + employee.name + employee);
//    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }

    }
}
