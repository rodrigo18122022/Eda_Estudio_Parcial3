package dictionary;
import interfaces.*;
import btree.*;
import java.util.ArrayList;

public class BTreeDiccionary<K extends Comparable<K>,V> implements Dictionary<K,V> {
    private BTree<EntryDic<K,V>> dict;
    
    public BTreeDiccionary(int orden) {
        this.dict = new BTree<EntryDic<K,V>>(orden);
    }
    @Override
    public void insert(K key, V value) {
        this.dict.insert(new EntryDic<K,V>(key, value));  
    }
    @Override
    public V search(K key) {
        return this.dict.find(new EntryDic<K,V>(key)).getValue();  
    }
    @Override
    public void remove(K key) {
        V pos = this.search(key);
        this.dict.remove(new EntryDic<K,V>(key));
    }
    @Override
    public boolean isEmpty() {
        return this.dict.isEmpty();
    }

    public ArrayList<V> inOrden() {
        ArrayList<EntryDic<K,V>> inorden = this.dict.inOrden();
        ArrayList<V> indices = new ArrayList<>();
        for(EntryDic<K,V >en : inorden) {
            indices.add(en.getValue());
        }
        return indices;
    }
}