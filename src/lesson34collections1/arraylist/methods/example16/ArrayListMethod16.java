package lesson34collections1.arraylist.methods.example16;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethod16 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] sbList  = {sb1, sb2, sb3, sb4};

        List<StringBuilder> stringBuilders = Arrays.asList(sbList);
        System.out.println(stringBuilders);

        sbList[0].append("ZZZZ");
        System.out.println(stringBuilders);

        sbList[0] = new StringBuilder("F");
        System.out.println(stringBuilders);
    }
}
