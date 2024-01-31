package lesson22oop4part2.interfeacedemo;


public class Employee implements Worker {

    @Override
    public void work() {
        System.out.println("Any");
    }

    @Override
    public double calculate() {
        return 0;
    }
}
