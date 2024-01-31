package lesson22oop4part2.calculator;

import java.util.Objects;

public class CalculatorOne implements Calculator {
    private int currentCount;

    private final MathFunction[] functions;

    public CalculatorOne(int functionCount) {
        functions = new MathFunction[functionCount];
    }

    @Override
    public void addFunction(MathFunction mathFunction) {
        functions[currentCount] = mathFunction;
        currentCount++;

    }

    @Override
    public void listMathFunction() {
        System.out.println("Available functions");
        for (MathFunction mathFunction : functions) {
            if (Objects.nonNull(mathFunction)) {
                System.out.println(mathFunction.getName());
            }
        }

    }

    @Override
    public double doCalculate(String name, double arg) {
        double result = 0;
        boolean isFunctionFound = false;
        for (MathFunction mathFunction : functions) {
            if (Objects.nonNull(mathFunction)) {
                result = mathFunction.calculate(arg);
                isFunctionFound = true;
            }
        }
        if (!isFunctionFound) {
            System.out.println("No such function found!");
        }
        return result;
    }
}
