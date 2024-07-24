package hash;
import java.util.ArrayList;

public class HashC<E extends Comparable<E>> {

	protected class Element{
		int mark;
		Register<E> reg;
		public Element(int mark, Register<E> reg){
			this.mark = mark;
			this.reg = reg;
		}
	}
	protected ArrayList<Element> table;
	protected int m;		//Tamaño de la tabla
	
	public HashC(int n){
		//Crear metodo para hallar el primo mas cercano a n: n = primoCerc(n)
		this.m = n; 		//calcular el primo cercano a n y asignarlo a m
		this.table = new ArrayList<Element>(this.m);
		for(int i=0; i<this.m; i++){
			this.table.add(new Element(0,null));
		}
	}
	private int functionHash(int key){
		return key % this.m;
	}
	private int linearProbing(int dressHash, int key){
		int pos = dressHash;
		do{
			Element e= this.table.get(dressHash);
			if(e.mark == 1 && e.reg.key == key) {
				return -2;		//Clave esta duplicandose - no se puede insertar
			} else if(e.mark == 1) {	//
				dressHash = (dressHash + 1) % this.m;
			} else if(e.mark == 0 || e.mark == 2) {	//
				return dressHash;
			}
		} while(pos != dressHash);
		return -1;		//Tabla llena
	}
	public void insert(int key, E reg){
		int dressHash = functionHash(key);
		dressHash = linearProbing(dressHash, key);
		if(dressHash == -1)
			System.out.println("Factor de carga en 100%...");
		else if(dressHash == -2)
			System.out.println("Clave" + key + " esta duplicada...");
		else 
			this.table.set(dressHash, new Element(1, new Register<E>(key, reg)));
	}
	
	public E search(int key){
		// implementar
		return null;
	}
	
	public void remove(int key){
		// implementar

	}
	public String toString(){
		String s= "D.Real\tD.Hash\tRegister\n";
		int i=0;
		for (Element item : this.table){
			s+= (i++) + " -->\t";
			if (item.mark == 1)
				s += functionHash(item.reg.getKey()) + "\t" +item.reg.toString()+"\n";
			else
				s += "empty\n";
		}
		return s;
	}
}

