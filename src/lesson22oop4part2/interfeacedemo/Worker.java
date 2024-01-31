package lesson22oop4part2.interfeacedemo;

public interface Worker {

    void work();

    double calculate();

    default void newMethod(){
        System.out.println("I am default Method after SE");
    }

}
