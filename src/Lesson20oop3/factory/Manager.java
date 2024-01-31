package Lesson20oop3.factory;

public class Manager extends Employee {
    protected String managerDepartment;
    protected static final int MANAGER_SALARY = 1000;

    public Manager(){

    }

    public Manager(int id, String name, int year, String department, String managerDepartment) {
        super(id, name, year, department);
        this.managerDepartment = managerDepartment;
    }

    public void work() {
        System.out.println("Manager is working");
    }

    public void manage(){
        System.out.println("Manager manged project");
    }

    public double calculateSalary() {
        return year * BASE_SALARY + MANAGER_SALARY;
    }
}
