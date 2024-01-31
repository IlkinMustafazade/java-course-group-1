package lesson18oop2.factory;

public class Employee {
    protected int no;
    protected String name;
    protected int year;
    protected String department;

//    public  Employee(){
//
//    }

    public Employee() {

    }


    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public static final int BASE_SALARY = 300;

    protected void work() {
        System.out.println("Employee working");
    }

    public int calculateSalary() {
        return year * getBaseSalary();
    }

    public static int getBaseSalary() {
        return BASE_SALARY;
    }


    public void printInfo() {
        System.out.println("NO: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + no);
    }
}
