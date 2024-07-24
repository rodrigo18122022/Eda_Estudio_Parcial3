package test;
import btree.*;

public class Test {
    public static void main(String[] args) {
        /*PRUEBAS DE INSERCION
        System.out.println("BTree: ARBOL A");
        BTree<Integer> a = new BTree<>(3);
        a.insert(1);
        System.out.println("BTree: " + a.toString());
        a.insert(2);
        System.out.println("BTree: " + a.toString());
        a.insert(3);
        System.out.println("BTree: " + a.toString());
        a.insert(4);
        System.out.println("BTree: " + a.toString());
        a.insert(5);
        System.out.println("BTree: " + a.toString());

        System.out.println("BTree: ARBOL B");
        BTree<Integer> b = new BTree<>(4);
        b.insert(10);
        System.out.println("BTree: " + b.toString());
        b.insert(20);
        System.out.println("BTree: " + b.toString());
        b.insert(5);
        System.out.println("BTree: " + b.toString());
        b.insert(6);
        System.out.println("BTree: " + b.toString());
        b.insert(12);
        System.out.println("BTree: " + b.toString());
        b.insert(30);
        System.out.println("BTree: " + b.toString());
        b.insert(7);
        System.out.println("BTree: " + b.toString());
        b.insert(17);
        System.out.println("BTree: " + b.toString());
        */
        System.out.println("BTree: ARBOL C");
        BTree<Integer> c = new BTree<>(5);
        c.insert(10);
        System.out.println("BTree: " + c.toString());
        c.insert(20);
        System.out.println("BTree: " + c.toString());
        c.insert(5);
        System.out.println("BTree: " + c.toString());
        c.insert(9);
        System.out.println("BTree: " + c.toString());
        c.insert(12);
        System.out.println("BTree: " + c.toString());
        c.insert(18);
        System.out.println("BTree: " + c.toString());
        c.insert(25);
        System.out.println("BTree: " + c.toString());
        c.insert(65);
        System.out.println("BTree: " + c.toString());
        c.insert(92);
        System.out.println("BTree: " + c.toString());
        c.insert(99);
        System.out.println("BTree: " + c.toString());
        //Caso 2 de remove
        c.remove(92);
        System.out.println("BTree: " + c.toString());
        //c.insert(19);
        System.out.println("BTree: " + c.toString());
        c.remove(18);
        System.out.println("BTree: " + c.toString());
        //Fin de caso 2 de remove
        
        c.insert(100);
        System.out.println("BTree: " + c.toString());
        c.insert(80);
        System.out.println("BTree: " + c.toString());
        c.insert(90);
        System.out.println("BTree: " + c.toString());
        c.remove(12);
        System.out.println("BTree: " + c.toString());
        
        /*
        //Caso 4 de remove
        c.insert(100);
        System.out.println("BTree: " + c.toString());
        c.insert(80);
        System.out.println("BTree: " + c.toString());
        c.insert(90);
        System.out.println("BTree: " + c.toString());
        c.remove(9);
        System.out.println("BTree: " + c.toString());
        */
        //PRUEBAS DE REMOVE DE LA PRACTICA:
        System.out.println("BTree: EJEMPLO 1");
        BTree<Integer> a1 = new BTree<>(5);
        a1.insert(5);
        a1.insert(9);
        a1.insert(10);
        a1.insert(12);
        a1.insert(18);
        a1.insert(20);
        a1.insert(25);
        a1.insert(65);
        a1.insert(92);
        a1.insert(99);
        System.out.println("BTree: " + a1.toString());
        a1.remove(65);
        System.out.println("BTree remove(65): " + a1.toString());
        
        System.out.println("BTree: EJEMPLO 2");
        BTree<Integer> a2 = new BTree<>(5);
        a2.insert(5);
        a2.insert(9);
        a2.insert(10);
        a2.insert(12);
        a2.insert(19);
        a2.insert(20);
        a2.insert(25);
        a2.insert(65);
        a2.insert(92);
        a2.insert(99);
        System.out.println("BTree: " + a2.toString());
        a2.remove(20);
        System.out.println("BTree remove(20): " + a2.toString());
        
        System.out.println("BTree: EJEMPLO 3");
        BTree<Integer> a3 = new BTree<>(5);
        a3.insert(5);
        a3.insert(9);
        a3.insert(10);
        a3.insert(12);
        a3.insert(18);
        a3.insert(20);
        a3.insert(25);
        a3.insert(65);
        a3.insert(92);
        a3.insert(99);
        System.out.println("BTree: " + a3.toString());
        a3.remove(12);
        System.out.println("BTree remove(12): " + a3.toString());

        System.out.println("BTree: EJEMPLO 4");
        BTree<Integer> a4 = new BTree<>(5);
        a4.insert(5);
        a4.insert(9);
        a4.insert(10);
        a4.insert(12);
        a4.insert(18);
        a4.insert(20);
        a4.insert(25);
        a4.insert(65);
        a4.insert(92);
        a4.insert(99);
        System.out.println("BTree: " + a4.toString());
        a4.remove(5);
        System.out.println("BTree remove(5): " + a4.toString());
        
        System.out.println("BTree: EJEMPLO 5");
        BTree<Integer> a5 = new BTree<>(5);
        a5.insert(5);
        a5.insert(9);
        a5.insert(10);
        a5.insert(12);
        a5.insert(18);
        a5.insert(20);
        a5.insert(25);
        a5.insert(52);
        a5.insert(65);
        a5.insert(67);
        a5.insert(68);
        a5.insert(69);
        a5.insert(70);
        a5.insert(72);
        a5.insert(73);
        a5.insert(92);
        a5.insert(99);
        System.out.println("BTree: " + a5.toString());
        a5.remove(65);
        System.out.println("BTree remove(65): " + a5.toString());

        System.out.println("BTree: ARBOL DEL 1 AL 100");
        BTree<Integer> x = new BTree<>(7);
        for(int i = 0; i < 100; i++)
            x.insert(i);
        System.out.println("BTree: " + x.toString());
        x.remove(65);
        System.out.println("BTree remove(65): " + x.toString());
        x.remove(12);
        System.out.println("BTree remove(12): " + x.toString());
        x.remove(4);
        System.out.println("BTree remove(4): " + x.toString());
        x.remove(22);
        System.out.println("BTree remove(22): " + x.toString());
    }
}