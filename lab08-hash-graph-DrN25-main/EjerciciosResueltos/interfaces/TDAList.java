package interfaces;

public interface TDAList<T> {
	void insert (T x);
	int search(T x);
	void remove(T x);
	boolean isEmpty();
}