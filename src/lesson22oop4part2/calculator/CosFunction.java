package lesson22oop4part2.calculator;

public class CosFunction extends AbstractMathFunction {

    public CosFunction() {
        name = "COS";
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}
