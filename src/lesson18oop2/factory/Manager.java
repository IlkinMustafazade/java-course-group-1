package lesson18oop2.factory;

public class Manager extends Employee {
    protected String name;
    protected String departmentManaged;

    public static final int MANAGER_SALARY = 1000;

    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    public void printName() {
        System.out.println(name);

    }

    @Override
    public void work() {
        System.out.println("Manager working");
    }


}
