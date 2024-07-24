package empresa;

public class Empleado {
    private String dni;
    private String nombre;
    private String direccion;
    private String sexo;

    public Empleado() { this(null, null,  null, null); }

    public Empleado(String dni, String nombre, String direccion, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.sexo = sexo;
    }

    public String getDni() { return this.dni; }
    public String getNombre() { return this.nombre; }
    public String getDireccion() { return this.direccion; }
    public String getSexo() { return this.sexo; }

    @Override
    public String toString() {
        return "Empleado: " + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", sexo='" + sexo;
    }
}