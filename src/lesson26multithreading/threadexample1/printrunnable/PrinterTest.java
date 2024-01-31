package lesson26multithreading.threadexample1.printrunnable;


public class PrinterTest {
    public static void main(String[] args) {
        Thread printer1 = new Thread(new Printer("Printer1"));
        Thread printer2 = new Thread(new Printer("Printer2"));

        printer1.start();
        printer2.start();

        System.out.println(Thread.currentThread().getName() + " Thread Is working");
    }
}
