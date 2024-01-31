package lesson22oop4part2.calculator;

public class SinFunction extends AbstractMathFunction {

    public SinFunction() {
        name = "SIN";
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
