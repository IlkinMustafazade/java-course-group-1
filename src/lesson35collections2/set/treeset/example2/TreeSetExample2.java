package lesson35collections2.set.treeset.example2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(10);
        System.out.println(treeSet);
        treeSet.remove(1);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(5));
    }
}
