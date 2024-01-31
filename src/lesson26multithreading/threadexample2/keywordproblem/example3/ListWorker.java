package lesson26multithreading.threadexample2.keywordproblem.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListWorker {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public synchronized void addElementToList1() {
        try {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void addElementToList2() {
        try {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void addElement() {
        for (int i = 0; i < 1000; i++) {
            addElementToList1();
            addElementToList2();
        }
    }

    public void runThis() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                addElement();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                addElement();
            }
        });
        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("List1 Size: " + list1.size() + "   " + "List2 Size: " + list2.size());
        long end = System.currentTimeMillis();
        System.out.println("The passing time: " + (end - start));
    }
}
