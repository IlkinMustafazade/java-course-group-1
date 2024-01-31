package lesson26multithreading.threadexample3.threadpoolexecutorservice1;

import lesson26multithreading.threadexample3.threadpoolexecutorservice.Worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WorkerTest {
    public static void main(String[] args) {
        Worker worker = new Worker("1",1);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        System.out.println("All work delivered....");

        for (int i = 1; i <= 5; i++) {
            executor.submit(new Worker(String.valueOf(i), i));
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("all work done....");
    }
}
