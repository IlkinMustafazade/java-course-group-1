package lesson35collections2.set.hashset.example3;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ilkin");
        set.add("Ikram");
        set.add("Tahir");
        set.add("Vuqar");
        set.remove("Ilkin");
        System.out.println(set);
//        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
