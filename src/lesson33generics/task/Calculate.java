package lesson33generics.task;

public class Calculate {

    public static <T extends Number> double add(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }
}
