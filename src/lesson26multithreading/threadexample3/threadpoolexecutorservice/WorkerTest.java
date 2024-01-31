package lesson26multithreading.threadexample3.threadpoolexecutorservice;

public class WorkerTest {
    public static void main(String[] args)  {
        Thread thread1 = new Thread(new Worker("1",1));
        Thread thread2 = new Thread(new Worker("2",2));
        Thread thread3 = new Thread(new Worker("3",3));
        Thread thread4 = new Thread(new Worker("4",4));
        Thread thread5 = new Thread(new Worker("5",5));
        System.out.println("All jobs delivered....");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread5.start();
        try {
            thread5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("all work done....");
    }
}
