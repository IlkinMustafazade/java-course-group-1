package lesson33generics.example1;

class Store<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class StoreApp {
    public static void main(String[] args) {
        Store<String> store = new Store<>();
        store.setItem("15");
        String number = store.getItem();
        System.out.println(number);
    }
}
