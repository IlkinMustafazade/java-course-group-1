package lesson34collections1.iterator.example2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add("Mahir");
        arrayList.add("Vuqar");
        arrayList.add("Samir");
        arrayList.add("Gunay");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
          iterator.next();
          iterator.remove();
        }

        System.out.println(arrayList);
    }
}
