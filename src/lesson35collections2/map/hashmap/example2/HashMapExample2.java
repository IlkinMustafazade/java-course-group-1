package lesson35collections2.map.hashmap.example2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100022, "Ilkin Mustafazada");
        map.put(345980, "Ikram Isgandarov");
        map.put(242222, "Tahir Asgerov");
        map.put(568254, "Vuqar Mammadov");
        map.put(998525, "Ikram Isgandarov");//duplicate value
//        map.put(100022, "Rasul Ahmadov");//duplicate key
//        map.put(null,"Tural Mammadov");
//        map.put(null,"Sadiq Mammadov");
//        map.put(2322546, null);
//        map.put(2322547, null);
//        map.put(2322548, null);
//        map.put(2322549, null);
        System.out.println(map);
    }
}
