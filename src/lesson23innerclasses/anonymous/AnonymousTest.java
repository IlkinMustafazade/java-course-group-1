package lesson23innerclasses.anonymous;

public class AnonymousTest {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void scan() {
                System.out.println("Document scanned");
            }

            @Override
            public void print() {
                System.out.println("Scanned document is being printed");
            }
        };

        printable.scan();
        printable.print();
    }
}
