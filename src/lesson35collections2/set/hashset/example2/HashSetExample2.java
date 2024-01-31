package lesson35collections2.set.hashset.example2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ilkin");
        set.add("Ikram");
        set.add("Tahir");
        set.add("Vuqar");
        System.out.println(set);
        set.remove("Ilkin");
        System.out.println(set);
    }
}
