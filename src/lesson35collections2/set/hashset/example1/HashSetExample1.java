package lesson35collections2.set.hashset.example1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ilkin");
        set.add("Ikram");
        set.add("Tahir");
        set.add("Vuqar");
//        set.add("Vuqar");// duplicate Element
//        set.add(null);
//        set.add(null);

        System.out.println(set);
    }
}
