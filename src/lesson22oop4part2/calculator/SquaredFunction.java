package lesson22oop4part2.calculator;

public class SquaredFunction extends AbstractMathFunction {

    public SquaredFunction() {
        name = "SQRT";
    }

    @Override
    public double calculate(double arg) {
        return Math.sqrt(arg);
    }
}
