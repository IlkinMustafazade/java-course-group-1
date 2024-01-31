package lesson35collections2.map.hashtable.example2;

import java.util.Hashtable;

public class HashTableExample2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(100022, "Ilkin");
        hashtable.put(300232, "Ikram");
//        hashtable.put(null, "Tahir");
//        hashtable.put(303253, null);
        System.out.println(hashtable);
    }
}
