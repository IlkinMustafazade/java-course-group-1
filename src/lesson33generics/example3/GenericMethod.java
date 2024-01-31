package lesson33generics.example3;

public class GenericMethod {
    public <E> void showElements(E[] e) {
        for (E x : e) {
            System.out.print(x + " | ");
        }
        System.out.println();
    }
}



