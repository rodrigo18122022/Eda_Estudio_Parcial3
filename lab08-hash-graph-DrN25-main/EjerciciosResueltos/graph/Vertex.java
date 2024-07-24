package graph;

import listSimple.*;

public class Vertex<E extends Comparable<E>> implements Comparable<Vertex<E>>{
	private E data;
	protected LinkedList<Edge<E>> listAdj;
	protected int label;		//0=unexplored, 1=visited
	
	public int getLabel() { return this.label; }
	public void setLabel(int label) {this.label = label; }

	public E getData() { return this.data; }
	public void setData(E data) { this.data = data; }

	public Vertex(E data) {
		this.data = data;
		this.listAdj = new LinkedList<Edge<E>> ();
	}

	public int compareTo(Vertex<E> o) {
		return this.data.compareTo(o.data);
	}

	public boolean equals(Object o) {
		if (o instanceof Vertex) {
			Vertex<E> v = (Vertex<E>) o;
			return this.data.equals(v.data);
		}
		return false;
	}
	
	public String toString() {
		return this.data + " --> " + this.listAdj.toString() + "\n";
	}
}
