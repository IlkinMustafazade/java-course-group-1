package lesson26multithreading.threadexample3.threadpoolexecutorservice;

public class Worker implements Runnable{
    private String name;
    private int taskId;

    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker " + name + " " + taskId + " started working...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker " + name + " " + taskId + " finished working...");
    }
}
