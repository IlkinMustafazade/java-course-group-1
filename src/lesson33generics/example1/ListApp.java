package lesson33generics.example1;

public class ListApp<T> {
    T[] words = (T[]) new Object[3];

    public static void main(String[] args) {
        ListApp<String> listApp = new ListApp<>();


        listApp.words[0] = "Hello";
        listApp.words[1] = "Bye";
//        listApp.words[2] = 10;

        String str;
        for (int i = 0; i < listApp.words.length; i++) {
            str = listApp.words[i];
            System.out.println(str);
        }

    }
}
