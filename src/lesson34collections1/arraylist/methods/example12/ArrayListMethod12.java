package lesson34collections1.arraylist.methods.example12;

import java.util.ArrayList;

public class ArrayListMethod12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add("Ikram"); //duplicate element
        System.out.println(arrayList);

        System.out.println(arrayList.lastIndexOf("Ikram"));
        System.out.println(arrayList.lastIndexOf("Mahir"));
    }
}
