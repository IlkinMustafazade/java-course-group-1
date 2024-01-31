package lesson35collections2.map.hashmap.example4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100022, "Ilkin Mustafazada");
        map.put(345980, "Ikram Isgandarov");
        map.put(242222, "Tahir Asgerov");
        map.put(568254, "Vuqar Mammadov");
        map.putIfAbsent(100022,"Resul Ahmadov");
        System.out.println(map);
        System.out.println(map.get(100022));
//        System.out.println(map.get(100021));
    }
}
