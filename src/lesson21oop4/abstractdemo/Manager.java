package lesson21oop4.abstractdemo;

public  class Manager extends Employee{

    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("Manager is working");
    }
}
