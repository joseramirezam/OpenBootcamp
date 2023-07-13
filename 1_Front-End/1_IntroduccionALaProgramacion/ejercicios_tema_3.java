public class Main {
    public static void main(String[] args) {
        // Creación del objeto e incremento en la cantidad de puertas.
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.Puertas);
        // Llamada a la función "suma", asignación de tres valores, e impresión de valores.
        int suma = suma(1,2, 3);
        System.out.println(suma);
    }
    // Función "suma" de tres elementos.
    public static int suma (int a, int b, int c) {
        return a + b +c;
    }
}

//Clase "Coche" con número de puertas y método de incremento.
class Coche {
    public int Puertas = 0;
    public void IncrementarPuertas() {
        this.Puertas++;
    }
}