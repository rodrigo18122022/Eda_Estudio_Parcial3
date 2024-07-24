package test;
import hash.*;
import graph.*;

public class Test {
    public static void main(String[] args) {
        /*
        HashC<String> hash = new HashC<Register>(11);
        hash.insert(34, "carlos");     //1
        hash.insert(3, "jose");     //3
        hash.insert(7, "juan");     //7
        hash.insert(30, "enrique");     //8
        hash.insert(11, "mark");    //0
        hash.insert(8, "lau");  //Colision -> 9
        hash.insert(7, "ben");  //Colision -> 10
        hash.insert(23, "sebas");   //Colision -> 2
        hash.insert(41, "jorge"); //Colision -> 10
        hash.insert(16, "raul");   //5
        hash.insert(64, "jesus");   //Colision -> 4

        System.out.println(hash);
        */
        GraphLink<String> g = new GraphLink<>();
        g.insertVertex("Arequipa");
        g.insertVertex("Lima");
        g.insertVertex("Cusco");
        g.insertVertex("Piura");
        g.insertVertex("Iquitos");
        g.insertVertex("Tacna");
        g.insertVertex("Moquegua");
        g.insertVertex("Puno");
        g.insertVertex("Arequipa");
        System.out.println("g");
        g.insertEdge("Arequipa", "Lima");
        g.insertEdge("Cusco", "Lima");
        g.insertEdge("Iquitos", "Piura");
        g.insertEdge("Puno", "Tacna");
        g.insertEdge("Moquegua", "Arequipa");
        g.insertEdge("Lima", "Arequipa");
        g.insertEdge("Cusco", "Arequipa");
        g.insertEdge("Arequipa", "Tacna");
        g.insertEdge("Piura", "Puno");

        g.dfs("Moquegua");
    }
}