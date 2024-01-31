package lesson32lambda;

public class FunctionalTest {
    public static void main(String[] args) {
        MathFunction mathFunction = new MathFunction() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);

            }
        };

        mathFunction.add(5,10);
    }
}
