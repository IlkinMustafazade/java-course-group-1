package lesson34collections1.arraylist.methods.example13;

import java.util.ArrayList;

public class ArrayListMethod13 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add("Ikram"); //duplicate element
        System.out.println(arrayList);
        System.out.println(arrayList.size());

    }
}
