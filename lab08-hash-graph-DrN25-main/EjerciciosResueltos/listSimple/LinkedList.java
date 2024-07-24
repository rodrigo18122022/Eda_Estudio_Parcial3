package listSimple;
import interfaces.*;

public class LinkedList<T extends Comparable<T>> implements TDAList<T> {
    private int count;
	private Node<T> head;
	
    public LinkedList() {
		this.head = null;
		this.count = 0;
    }
	
	public boolean isEmpty() {
		return head == null;
	}

	public int length(){
		return this.count;
	}
	
	protected void destroyList(){
		while(this.head != null) {
			Node<T> aux = this.head.getNext();
			this.head.setNext(null);
			this.head = aux;
		}
		this.count = 0;
	}
	
	public int search(T x) {
		int idx = 0;
		Node<T> aux = this.head;
		while (aux != null && !aux.getData().equals(x))  {
			idx++;
			aux = aux.getNext();
		}
		if (aux != null) 
			return idx;
		else 
			return -1;
	}

	public T searchData(T x) {
		int idx = 0;
		Node<T> aux = this.head;
		while (aux != null && !aux.getData().equals(x))  {
			idx++;
			aux = aux.getNext();
		}
		if (aux != null) 
			return aux.getData();
		else 
			return null;
	}

	public T find(T x) {
		Node<T> aux = this.head;
		while (aux != null && !aux.getData().equals(x))  
			aux = aux.getNext();
		if (aux != null) 
			return aux.getData();
		else 
			return null;
	}
	
	public void insert(T x) {
		if(this.head == null) {
			insertFirst(x);
		} else {
			insertLast(x);
		}
	}
	
    public void insertFirst(T x) {
        this.head = new Node<T>(x, this.head);
		this.count++;
    }
	
    public void insertLast(T x) {
		Node<T> aux = this.head;
		while (aux.getNext() != null) {
		  aux = aux.getNext();
		}
		Node<T> n = new Node<T>(x, null);
		aux.setNext(n);
		this.count++;
	}	

	public void insertKesimo(T x, int p) {
		if(p == 0 || isEmpty()) {
			this.head = new Node<T>(x, this.head);
			this.count++;
		} else {
			Node<T> aux = this.head;
			int pos = 0 + 1;
			while(aux.getNext() != null  && pos < p) {
				aux = aux.getNext();
				pos++;
			}
			//Si se llego aqui es porque pos == p
			aux.setNext(new Node<T>(x, aux.getNext()));
			this.count++;
		}
	}
	
	public void remove( T x ) {
		Node<T> aux = this.head;
		if (isEmpty()) return;
		if (aux.getData().equals(x))  {
			this.head = aux.getNext();
			this.count--;
			return;
		}
		while (aux.getNext() != null )  {
			if (aux.getNext().getData().equals(x)) {
				aux.setNext(aux.getNext().getNext());
				this.count--;
				return;
			}
			aux = aux.getNext(); 
		}
	}

	public T getMin() {
		if(isEmpty()) return null;
		Node<T> aux = this.head;
		T min = aux.getData();
		while(aux != null) {
			if(aux.getData().compareTo(min) < 0)
				min = aux.getData();
			aux = aux.getNext();
		}
		return min;
	}

	public void setHead(Node<T> head) { this.head = head; }

	public void setCount(int count) { this.count = count; }

	public Node<T> getHead() { return this.head; }

	public int getCount() { return this.count; }

  
	public String toString() {
		String str = "";
		Node<T> aux = this.head;
		for (; aux != null; aux = aux.getNext()) {
			str += aux.toString() + ", \n";
		}
		return str;
	}
}