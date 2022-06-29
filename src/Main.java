public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.setEdad(45);
        cliente.setNombre("Juan");
        cliente.setTelefono(64861654);
        cliente.setCredito(15_000.52f);
        trabajador.setSalario(2_500.00f);
        System.out.println("Edad:" + " " + cliente.getEdad());
        System.out.println("Nombre:" + " " + cliente.getNombre());
        System.out.println("Telefono:" + " " + cliente.getTelefono());
        System.out.println("Credito:" + " " + cliente.getCredito());
        System.out.println("Salario:" + " " + trabajador.getSalario());
    }
}
// Clase Padre
abstract class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
// Clase hija 1
class Cliente extends Persona {
    private float credito;
    public void setCredito (float credito) {
    this.credito = credito;
        }
    public float getCredito () {
    return credito;
    }
    }
// Clase hija 2
    class Trabajador extends Persona {
    private float salario;

    public void setSalario(float salario) {
    this.salario = salario;
    }
    public float getSalario() {
    return salario;
    }
    }


