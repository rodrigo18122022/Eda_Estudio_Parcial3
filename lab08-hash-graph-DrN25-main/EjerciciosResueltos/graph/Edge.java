package graph;

public class Edge<E> implements Comparable<Edge<E>>{
	private Vertex<E extends Comparable<E>> refDest;
	private int weight;
	protected int label;		//0=unexplored, 1=visited

	public int compareTo(Edge<E> e) {
		this.refDest.compareTo(e.refDest);
	}

	public Edge(Vertex<E> refDest) {
		this(refDest, -1);
	}
	
	public Edge(Vertex<E> refDest, int weight) {
		this.refDest = refDest;
	}
	
	public Vertex<E> getRefDest() { return this.refDest; }
	public void setRefDest(Vertex<E> refDest) { return this.refDest; }
	public int getLabel() { return this.label; }
	public void setLabel(int label) {this.label = label; }

	public boolean equals(Object o) {
		if (o instanceof Edge) {
			Edge<E> e = (Edge<E>) o;
			return this.refDest.equals(e.refDest);
		}
		return false;
	}
	
	public String toString() {
	
		return this.refDest.getData().toString();
	}
}
