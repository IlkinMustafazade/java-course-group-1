package lesson33generics.example4;

class A {

}

class B extends A {

}

class C extends A {

}

public class App<T extends A> {
    public static void main(String[] args) {
        App<A> app1 = new App<>();
        App<B> app2 = new App<>();
        App<C> app3 = new App<>();
//      App<Number> app4 = new App(); //Compile Error
    }
}

