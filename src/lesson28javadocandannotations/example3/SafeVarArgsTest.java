package lesson28javadocandannotations.example3;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsTest {

    @SafeVarargs
    private void displayList(List<String>... lists) {
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        SafeVarArgsTest obj = new SafeVarArgsTest();

        List<String> universityList = Arrays.asList("BDU University", "NDU University");
        obj.displayList(universityList);

        List<String> programmingLanguages = Arrays.asList("Java", "C");
        obj.displayList(universityList, programmingLanguages);
    }
}
