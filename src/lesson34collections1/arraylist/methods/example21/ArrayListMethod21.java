package lesson34collections1.arraylist.methods.example21;

import java.util.ArrayList;

public class ArrayListMethod21 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add("Mahir");
        arrayList.add("Vuqar");
        arrayList.add("Samir");
        arrayList.add("Gunay");
        Object[] objects = arrayList.toArray();

        String[] names = arrayList.toArray(new String[7]);
        for (String name: names){
            System.out.println(name);
        }

    }
}
