package lesson26multithreading.threadexample4;

import java.util.Scanner;

public class WaitNotify {
    Object lock = new Object();

    public void funThread1() {
        synchronized (lock) {
            System.out.println("Thread 1 is working...");
            System.out.println("Thread 1 is waiting for Thread2 to wake itself...");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 wakes up and continues...");
        }
    }


    public void funThread2() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock){
            System.out.println("Thread 2 is working...");
            System.out.println("Press any key to continue");
            scanner.nextLine();
            lock.notify();
            System.out.println("I woke up bro. I'm leaving... wait 2 seconds");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
