package lesson34collections1.arraylist.methods.example5;

import java.util.ArrayList;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        System.out.println(arrayList);

        arrayList.set(1,"Vuqar");
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
