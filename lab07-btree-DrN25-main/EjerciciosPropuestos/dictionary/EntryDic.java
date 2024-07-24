package dictionary;

public class EntryDic<K extends Comparable<K>, V> implements Comparable<EntryDic<K,V>> {
    private K key;
    private V value;

    public EntryDic(K key) { this(key, null); }

    public EntryDic(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return this.key; }
    public V getValue() { return this.value; }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EntryDic<?, ?> entryDic = (EntryDic<?, ?>) obj;
        return key.equals(entryDic.key);
    }
    @Override
    public int compareTo(EntryDic<K, V> x) {
        return this.key.compareTo(x.key);
    }
    @Override
    public String toString() {
        return "[" + this.key + "=>" + this.value + "]";
    }
}