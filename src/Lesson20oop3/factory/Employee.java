package Lesson20oop3.factory;

public class Employee {
    protected int id;
    protected String name;
    protected int year;
    protected String department;
    protected static final int BASE_SALARY = 300;

    public Employee() {

    }

    public Employee(int id, String name, int year, String department) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public double calculateSalary() {
        return year * BASE_SALARY;
    }

}
