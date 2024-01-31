package lesson35collections2.map.hashmap.example1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100022, "Ilkin");
        map.put(345980, "Ikram");
        map.put(242222, "Tahir");
        map.put(568254, "Vuqar");
        System.out.println(map);

    }
}
