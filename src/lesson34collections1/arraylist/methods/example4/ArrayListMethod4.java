package lesson34collections1.arraylist.methods.example4;

import java.util.ArrayList;

public class ArrayListMethod4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add(1, "Tural");
        System.out.println(arrayList);
        arrayList.set(1,"Vuqar");
        System.out.println(arrayList);
    }
}
