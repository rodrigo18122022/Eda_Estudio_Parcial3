package listSimple;
import listDouble.*;

public class TestList {
	public static void main (String args[]) {
		/*
		System.out.println("LinkedList");
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.insert(10);
		System.out.println(l1 + "Length: " + l1.length());
		l1.insert(2);
		System.out.println(l1 + "Length: " + l1.length());
		l1.insert(4);
		System.out.println(l1 + "Length: " + l1.length());
		l1.insert(9);
		System.out.println(l1 + "Length: " + l1.length());
		l1.insert(3);
		System.out.println(l1 + "Length: " + l1.length());
		l1.insert(5);
		System.out.println(l1 + "Length: " + l1.length());

		System.out.println("10?: " + l1.search(10));
		System.out.println("5?: " + l1.search(5));
		System.out.println("122?: " + l1.search(122));



		l1.remove(5);
		System.out.println(l1 + "Length: " + l1.length());
		l1.remove(9);
		System.out.println(l1 + "Length: " + l1.length());
		
		l1.insertKesimo(3, 2);
		System.out.println("insertKesimo 3,2: " + l1 + "Length: " + l1.length());
		l1.insertKesimo(5, 10);
		System.out.println("insertKesimo 5,10: " + l1 + "Length: " + l1.length());
		l1.destroyList();
		System.out.println("destroyList()");
		l1.insertKesimo(11, 6);
		System.out.println("insertKesimo 11,6: " + l1 + "Length: " + l1.length());
		*/
		/*
		System.out.println("OrderLinkedList");
		LinkedList<Integer> o1 = new OrderLinkedList<Integer>();
		o1.insert(10);
		System.out.println(o1 + "Length: " + o1.length());
		o1.insert(2);
		System.out.println(o1 + "Length: " + o1.length());
		o1.insert(11);
		System.out.println(o1 + "Length: " + o1.length());
		o1.insert(9);
		System.out.println(o1 + "Length: " + o1.length());
		o1.remove(11);
		System.out.println(o1 + "Length: " + o1.length());
		o1.insert(-1);
		System.out.println(o1 + "Length: " + o1.length());
		o1.insert(5);
		System.out.println(o1 + "Length: " + o1.length());
		o1.remove(-1);
		System.out.println(o1 + "Length: " + o1.length());

		System.out.println("10?: " + o1.search(10));
		System.out.println("5?: " + o1.search(5));
		System.out.println("122?: " + o1.search(122));
		*/

		System.out.println("LinkedDoubleList");
		LinkedDoubleList<Integer> d1 = new LinkedDoubleList<Integer>();
		d1.insert(10);
		System.out.println(d1 + "Length: " + d1.length());
		d1.insert(2);
		System.out.println(d1 + "Length: " + d1.length());
		d1.insert(11);
		System.out.println(d1 + "Length: " + d1.length());
		d1.insert(9);
		System.out.println(d1 + "Length: " + d1.length());
		d1.remove(10);
		System.out.println(d1 + "Length: " + d1.length());
		d1.insert(0);
		System.out.println(d1 + "Length: " + d1.length());
		d1.insert(-2);
		System.out.println(d1 + "Length: " + d1.length());
		d1.remove(11);
		System.out.println(d1 + "Length: " + d1.length());

		System.out.println("2?: " + d1.search(2));
		System.out.println("-2?: " + d1.search(-2));
		System.out.println("122?: " + d1.search(122));
	}
}