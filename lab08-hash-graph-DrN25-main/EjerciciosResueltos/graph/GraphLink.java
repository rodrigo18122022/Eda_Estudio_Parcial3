package graph;

import listSimple.*;

public class GraphLink<E extends Comparable<E>> {
	private LinkedList<Vertex<E>> listVertex;
	
	public GraphLink() {
		this.listVertex = new LinkedList<Vertex<E>>();
	}
	
	public void insertVertex(E data) {
		Vertex<E> nVertex = new Vertex<E>(data);
		if(this.listVertex.search(nVertex) != -1) {		//Existe
			System.out.println("El vertice se esta duplicando...");
		} else {
			this.listVertex.insertFirst(nVertex);
		}
	}
	
	public void insertEdge(E dataOri, E dataDes) {
		Vertex<E> refOri = this.listVertex.searchData(new Vertex<E>(dataOri));
		Vertex<E> refDes = this.listVertex.searchData(new Vertex<E>(dataDes));
		if(refOri == null || refDes == null)
			System.out.println("Algunos de los vertices extremos no existe en el grafo...");
		else {
			if(refOri.listAdj.search(new Edge<E>(refDes)) != -1)
				System.out.println("La lista se esta duplicando");
			else {
				refOri.listAdj.insertFirst(new Edge<E>(refDes));
				refDes.listAdj.insertFirst(new Edge<E>(refOri));
			}
		}
	}
	
	public void dfs(E data) {
		Vertex<E> refVer = this.listVertex.searchData(new Vertex<E>(data));
		if(refVer == null)
			System.out.println("El vertice no existe");
		else {
			initLabels();
			dfsRec(refVer);
		}

	}

	private void dfsRec(Vertex<E> v) {
		v.setLabel(1);
		System.out.println(v.getData());
		Node<Edge<E>> nodeEdg = v.listAdj.getHead();
		for(; nodeEdg != null; nodeEdg = nodeEdg.getNext()) {
			if(nodeEdge.getData().getLabel() == 0) {
				Vertex<E> w = nodeEdg.getData().getRefDest();
				if(w.getLabel() == 0) {
					nodeEdg.getData().setLabel(1);
					dfsRec(w);

				} 
				else
					nodeEdg.getData().setLabel(2);
				}
			}
		}
	}

	public void initLabels() {
		Node<Vertex<E>> nodeVer = this.listVertex.getHead();
		for(; nodeVer != 1; nodeVer = noderVer.getNext()) {
			nodeVer.getData.setLabel(0);
			Node<Edge<E>> nodeEdg = nodeVer.getData().listAdj.getHead();
			for(; nodeEdg != null; nodeEdg.getNext())
				nodeEdg.getData().setLabel(0);
		}
	}

	/*public boolean searchVertex(E data) {
		
	}
	
	public boolean searchEdge(E dataOri, E dataDes) {
		
	}
	
	public void removeVertex(E data) {
		
	}
	
	public void removeEdge(E dataOri, E dataDes) {
		
	}
	
	*/
	
	public String toString() {
		return this.listVertex.toString();
	} 
}
