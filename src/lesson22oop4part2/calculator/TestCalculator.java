package lesson22oop4part2.calculator;

import java.util.Scanner;

import static java.lang.System.*;

public class TestCalculator {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        CalculatorOne calculatorOne = new CalculatorOne(4);
        calculatorOne.addFunction(new SinFunction());
        calculatorOne.addFunction(new CosFunction());
        calculatorOne.addFunction(new LogFunction());
        calculatorOne.addFunction(new SquaredFunction());

        startCalculator(calculatorOne);

    }


    private static void startCalculator(CalculatorOne calculatorOne) {
        calculatorOne.listMathFunction();
        out.println("Please enter the name of the function");
        String functionName = in.next();
        if (functionName.equalsIgnoreCase("end")) {
            System.exit(0);
        }
        out.println("Please enter the argument of the function:");
        double argument = in.nextDouble();
        double result = calculatorOne.doCalculate(functionName, argument);
        out.println(functionName + " of " + argument + " is " + result);

        startCalculator(calculatorOne);
    }
}
