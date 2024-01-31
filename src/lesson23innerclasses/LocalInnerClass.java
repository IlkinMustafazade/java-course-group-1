package lesson23innerclasses;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display(30);

    }
}

class Outer {
    int x = 10;
    static int y = 20;

    public void display(int i) {
//        i++;
        class LocalInner {
            public void display() {
                System.out.println("Non static member of the Outer class: " + x);
                System.out.println("Static member of the Outer class: " + y);
                System.out.println("Local member of the method Outer class: " + i);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.display();
    }
}
