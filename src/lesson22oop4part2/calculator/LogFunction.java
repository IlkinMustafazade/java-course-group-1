package lesson22oop4part2.calculator;

public class LogFunction extends AbstractMathFunction {
    public LogFunction() {
        name = "LOG";
    }

    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }
}
