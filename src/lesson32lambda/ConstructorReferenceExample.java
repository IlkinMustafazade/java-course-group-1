package lesson32lambda;

class Example {

    Example() {
        System.out.println("Constructor executed...");
    }
}

interface MyInterface {
    Example get();
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        MyInterface myInterface = Example::new;
        myInterface.get();
    }
}

