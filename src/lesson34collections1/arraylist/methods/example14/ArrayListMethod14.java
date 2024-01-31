package lesson34collections1.arraylist.methods.example14;

import java.util.ArrayList;

public class ArrayListMethod14 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add("Ikram"); //duplicate element
        arrayList.clear();
        System.out.println(arrayList.isEmpty());

    }
}
