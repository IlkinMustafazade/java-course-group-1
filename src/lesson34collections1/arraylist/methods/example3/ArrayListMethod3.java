package lesson34collections1.arraylist.methods.example3;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add(1, "Tural");
        System.out.println(arrayList.get(2));
        System.out.println();

        for (int i = 0; i< arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println();
    }
}
