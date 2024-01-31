package lesson18oop2.factory;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Ilkin",3,"Employee");
        employee.work();
        Manager manager = new Manager(2,"Cavidan",3,"Manager","manager");
        manager.work();
    }

}
