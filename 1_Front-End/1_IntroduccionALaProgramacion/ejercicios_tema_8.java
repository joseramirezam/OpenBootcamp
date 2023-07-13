public class Main {
    public static void main(String[] args) {
        // Creación del objeto.
        Persona persona1 = new Persona();
        //Llamada a los métodos set.
        persona1.setEdad(22);
        persona1.setNombre("Jose");
        persona1.setTelefono(1112223334);
        // Llamaa a los métodos get.
        int Edad = persona1.getEdad();
        String Nombre = persona1.getNombre();
        int Telefono = persona1.getTelefono();
        // Impresiones en consola.
        System.out.println(Edad);
        System.out.println(Nombre);
        System.out.println(Telefono);
    }
}
class Persona {
    // Elementos de información de la edad.
    private int Edad;
    public void setEdad(int Edad) { this.Edad = Edad; }
    public int getEdad() { return this.Edad; }
    // Elementos de información del nombre.
    private String Nombre;
    public void setNombre(String Nombre) { this.Nombre = Nombre; }
    public String getNombre() { return this.Nombre; }
    // Elementos de información del teléfono.
    private int Telefono;
    public void setTelefono(int Telefono) { this.Telefono = Telefono; }
    public int getTelefono() { return this.Telefono; }
}