package lesson26multithreading.threadexample2.keywordproblem.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListWorker {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public void addElementToList1() {
        for (int i = 0; i < 2000; i++) {
            list1.add(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void addElementToList2() {
        for (int i = 0; i < 2000; i++) {
            list2.add(i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void addElement() {
        addElementToList1();
        addElementToList2();
        System.out.println("List1 Size: " + list1.size() + "   " + "List2 Size: " + list2.size());
    }

}
