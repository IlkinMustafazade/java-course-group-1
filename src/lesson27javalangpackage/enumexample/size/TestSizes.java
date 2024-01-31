package lesson27javalangpackage.enumexample.size;

public class TestSizes {
    public static void main(String[] args) {
        Size size1 = Size.MEDIUM;
        String name = size1.name();
        System.out.println("Enum: " + name + " - " + size1);
        System.out.println("Ordinal: " + size1.ordinal());
        System.out.println("Abbreviation: " + size1.getAbbreviation());
        System.out.println("No: " + size1.getNo());
        System.out.println();
        System.out.println("Description: " + Size.getDescription());
    }
}
