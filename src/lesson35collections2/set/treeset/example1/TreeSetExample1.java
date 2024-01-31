package lesson35collections2.set.treeset.example1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(10);
//        treeSet.add(null);
        System.out.println(treeSet);
    }
}
