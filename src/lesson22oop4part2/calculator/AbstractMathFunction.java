package lesson22oop4part2.calculator;

public abstract class AbstractMathFunction implements MathFunction {

    protected String name;

    @Override
    public String getName(){
        return name;
    }

}
