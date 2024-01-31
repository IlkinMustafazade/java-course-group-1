package lesson27javalangpackage.enumexample.size;

import java.util.logging.SocketHandler;

public enum Size {
    SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LATGE("XL", 4);

    private String abbreviation;
    private int no;

    private static String description;
    private static int count;

    static {
        System.out.println("In static initializer block");
        description = "There are sizes";
    }

    {
//        count++;
        System.out.println("In object initializer block");
    }

    Size(String abbreviation, int no) {
        this.abbreviation = abbreviation;
        this.no = no;
//        count++;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getNo() {
        return no;
    }

    public static String getDescription() {
        return description;
    }

}
