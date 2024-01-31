package lesson34collections1.stack.example2;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ilkin");
        stack.push("Ikram");
        stack.push("Tahir");
        stack.push("Vugar");
        System.out.println(stack);

//        System.out.println(stack.pop());
//        System.out.println(stack);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
