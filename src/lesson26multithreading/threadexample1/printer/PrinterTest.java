package lesson26multithreading.threadexample1.printer;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Printer1");
        Printer printer2 = new Printer("Printer2");

        printer1.print();

        printer2.print();

        System.out.println(Thread.currentThread().getName() + " Thread Is working");

    }
}
