package lesson35collections2.map.hashmap.example6;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100022, "Ilkin Mustafazada");
        map.put(345980, "Ikram Isgandarov");
        map.put(242222, "Tahir Asgerov");
        map.put(568254, "Vuqar Mammadov");
        System.out.println(map.containsValue("Tahir Asgerov"));
        System.out.println(map.containsValue("Tahir asgerov"));
    }
}
