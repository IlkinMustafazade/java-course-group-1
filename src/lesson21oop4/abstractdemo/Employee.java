package lesson21oop4.abstractdemo;

public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public abstract void work();

    public static void main(String[] args) {
        System.out.println("Hello eyyub");
    }
}
