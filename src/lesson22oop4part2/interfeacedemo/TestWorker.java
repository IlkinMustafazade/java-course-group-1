package lesson22oop4part2.interfeacedemo;

public class TestWorker {
    public static void main(String[] args) {
        Worker worker = new  Employee();
        worker.work();
//        worker = new Manager();
        worker.work();
    }
}
