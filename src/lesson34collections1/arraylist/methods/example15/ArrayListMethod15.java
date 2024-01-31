package lesson34collections1.arraylist.methods.example15;

import java.util.ArrayList;

public class ArrayListMethod15 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add("Ikram"); //duplicate element

        System.out.println(arrayList.contains("Ikram"));
        System.out.println(arrayList.contains("Mahir"));

    }
}
