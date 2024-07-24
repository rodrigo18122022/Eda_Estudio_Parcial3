package empresa;
import dictionary.*;
import java.util.ArrayList;

public class Empresa {
    BTreeDiccionary<String, Integer> btree;
    Empleado[] empresa;
    int count;

    public Empresa(int orden) {
        this.btree = new BTreeDiccionary<>(orden);
        this.empresa = new Empleado[10000]; 
        this.count = 0;
    }

    public void insert(Empleado e) {
        int i = 0;
        while(empresa[i] != null) { i++; }
        empresa[i] = e;
        btree.insert(e.getDni(), i);
        this.count++;
    }

    public Empleado search(String dni) {
        return empresa[btree.search(dni)];
    }

    public void remove(String dni) {
        int pos = btree.search(dni);
        empresa[pos] = null;
        btree.remove(dni);
        this.count--;
    }

    public String ordenarPorDni() {
        ArrayList<Integer> inorden = this.btree.inOrden();
        String t = "";
        for(int i : inorden) {
            t += empresa[i] + "\n";
        }
        return t;
    }

    public String mostrarPorSexo(String sexo) {
        String t  = "Arreglo de Empleados por sexo: {" + sexo + "} :\n";
        int i = 0;
        int cont = 0;
        while(cont < this.count){
            if(empresa[i] != null) {
                if(empresa[i].getSexo().equals(sexo))
                    t+= empresa[i].toString() + "\n";
                cont++;
            }
            i++;
        }
        return t;
    }

    public String toString() {
        String t = "Arreglo de Empleados:\n";
        int i = 0;
        int cont = 0;
        while(cont < this.count){
            if(empresa[i] != null) {
                t+= empresa[i].toString() + "\n";
                cont++;
            }
            i++;
        }
        return t;
    }
}