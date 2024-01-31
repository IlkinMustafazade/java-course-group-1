package lesson26multithreading.threadexample1.printer;

public class Printer {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name + " is working...");
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "is printing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " finished");
    }
}

