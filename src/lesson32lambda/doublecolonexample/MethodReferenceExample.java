package lesson32lambda.doublecolonexample;


class Test {
    public void fun1() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Child Thread");
        }
    }
}


public class MethodReferenceExample {

    public static void main(String[] args) {
        Test test = new Test();
        Runnable runnable = test::fun1;
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main Thread");
        }

    }
}
