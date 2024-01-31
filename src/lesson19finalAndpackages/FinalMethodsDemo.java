//
package lesson19finalAndpackages;

public final class FinalMethodsDemo {
    private final int i;
    private final double d;



    public FinalMethodsDemo(int i, double d) {
        this.i = i;
        this.d = d;
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }

    public final void display() {
        System.out.println("FinalMethodsDemo");
    }
}
