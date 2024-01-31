package lesson35collections2.map.hashtable.example1;

import java.util.Hashtable;

public class HashTableExample1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(100022, "Ilkin");
        hashtable.put(300232, "Ikram");
        hashtable.put(925632, "Tahir");
        hashtable.put(303253, "Vuqar");
        System.out.println(hashtable);
    }
}
