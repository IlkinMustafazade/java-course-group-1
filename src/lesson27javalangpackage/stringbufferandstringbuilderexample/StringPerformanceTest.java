package lesson27javalangpackage.stringbufferandstringbuilderexample;

public class StringPerformanceTest {
    public static void main(String[] args) {
//        buildStringWithPlus("Java", 100_000);
        buildStringWithStringBuilder("Java", 100_000);
    }

    public static void buildStringWithPlus(String string, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            string = string + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("buildStringWithPlus: Time build String is =>  " + (end - start) + " ms.");
        System.out.println("String length: " + string.length());
    }

    public static void buildStringWithStringBuilder(String string, int count) {
        StringBuilder stringBuilder = new StringBuilder(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("buildStringWithPlus: Time build String is =>  " + (end - start) + " ms.");
        System.out.println("String length: " + stringBuilder.toString().length());
    }
}
