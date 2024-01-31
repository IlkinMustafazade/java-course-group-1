package Lesson20oop3.factory;

public class PolymorphicMethodsDemo {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.work();
//        Manager manager = new Manager();
//        manager.work();
//        manager.manage();
//        Director director = new Director();
//        director.work();
//        director.makesStrategicPlan();

        Employee employee1 = new Employee();
        employee1.work();

        Employee employee2 = new Manager();
        employee2.work();
//        employee2.manage();

        Employee employee3 = new Director();
        employee3.work();
//        employee3.makesStrategicPlan



    }
}
