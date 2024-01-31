package lesson22oop4part2.calculator;

public interface Calculator {
    void addFunction(MathFunction mathFunction);

    void listMathFunction();

    double doCalculate(String name, double arg);
}
