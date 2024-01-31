package lesson26multithreading.threadexample2.keywordproblem.example1;

import lesson26multithreading.threadexample2.keywordproblem.example1.ListWorker;

public class ListWorkerTest {
    public static void main(String[] args) {
        ListWorker worker = new ListWorker();
        long start = System.currentTimeMillis();
        worker.addElement();
        long end = System.currentTimeMillis();

        System.out.println("The passing time: " + (end - start));
    }
}
