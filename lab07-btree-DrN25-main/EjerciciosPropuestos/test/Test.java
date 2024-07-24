package test;
import empresa.*;

public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(8);
        for(int i = 0; i < 10; i++) {
            String sexo = "m";
            if(i % 2 == 0) { sexo = "f"; }
            Empleado e = new Empleado("" + (10000000 + i), "E" + i, "Calle " + i, sexo);
            empresa.insert(e);
        }
        System.out.println("Empleados: \n" + empresa);

        System.out.println("Buscando el dni 10000009: " + empresa.search("10000009"));
        System.out.println("Buscando el dni 10000001: " + empresa.search("10000001"));
        System.out.println("Eliminando el dni 10000008");
        empresa.remove("10000008");
        System.out.println("Eliminando el dni 10000002");
        empresa.remove("10000002");
        System.out.println("Insertando el dni 10000010");
        empresa.insert(new Empleado("10000010", "E10", "Calle 10", "f"));

        System.out.println("Empleados: \n" + empresa);

        System.out.println("Empleados Ordenados por DNI: \n" + empresa.ordenarPorDni());

        System.out.println("Empleados Filtrados por Sexo f: \n" + empresa.mostrarPorSexo("f"));
        System.out.println("Empleados Filtrados por Sexo m: \n" + empresa.mostrarPorSexo("m"));
    }
}