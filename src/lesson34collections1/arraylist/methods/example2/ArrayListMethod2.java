package lesson34collections1.arraylist.methods.example2;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        System.out.println(arrayList);
        arrayList.add(1, "Tural");
//        arrayList.add(6, "Tural"); // IndexOutOfBoundsException
        for (String name : arrayList) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }
}
