package interfaces;

public interface Dictionary<K, V> {
    void insert(K key, V value);
    void remove(K key);
    V search(K key);
    boolean isEmpty();
}