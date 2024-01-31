package lesson23innerclasses.anonymous;

public class Document implements Printable{
    @Override
    public void scan() {
        System.out.println("Document scanned");

    }

    @Override
    public void print() {
        System.out.println("Scanned document is being printed");
    }
}
