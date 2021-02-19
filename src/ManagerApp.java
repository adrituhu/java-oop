class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Jaswan");
        manager.sayHello("Adri");

        var vp = new VicePresident("Adri");
        vp.sayHello("jaswan");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
