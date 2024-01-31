package lesson33generics.example2;

class HashTable<K, V> {
    private K key;
    private V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" + "key=" + key + ", value=" + value + '}';
    }
}

public class App {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>("Hello", 23);
        System.out.println(hashTable);
    }
}

