package lesson34collections1.stack.example1;

public class StackExample1 {
    public static void fun1(){
        System.out.println("Fun1 starts");
        System.out.println("Fun1 ends");
    }
    public static void fun2(){
        System.out.println("Fun2 starts");
        fun1();
        System.out.println("Fun2 ends");
    }
    public static void fun3(){
        System.out.println("Fun3 starts");
        fun2();
        System.out.println("Fun3 ends");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        fun3();
        System.out.println("Main ends");
    }
}
