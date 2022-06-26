public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setEdad (50);
        persona.setNombre ("Carlos");
        persona.setTelefono(1263646);
        System.out.println("Edad de la persona es:"+" " + persona.getEdad());
        System.out.println("Nombre de la persona es:"+" " + persona.getNombre());
        System.out.println("Numero de telefono:"+ " "+ persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

        public void setEdad (int edad) {
            this.edad = edad;
        }
        public int getEdad () {
            return edad;
        }
        public void setNombre (String nombre) {
            this.nombre = nombre;
        }
        public String getNombre () {
        return nombre;
        }
        public void setTelefono (int telefono) {
            this.telefono = telefono;
        }
        public int getTelefono () {
            return telefono;
        }

}



