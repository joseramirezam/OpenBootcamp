public class ejercicios_tema_4 {
    public static void main(String[] args) {
        // Declaración de las variables a utilizar.
        int numeroIf = 0;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        int numeroFor;
        var estacion = "PRIMAVERA";

        // Condición If.
        System.out.println("");
        System.out.println("Condicional If:");
        if (numeroIf == 0) {
            System.out.println("El número es cero.");
        } else if (numeroIf > 0) {
            System.out.println("El número es mayor a cero.");
        } else {
            System.out.println("El número es menor a cero.");
        }

        // Ciclo While.
        System.out.println("");
        System.out.println("Condicional While:");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        // Ciclo Do While.
        System.out.println("");
        System.out.println("Condicional do While:");
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile++;
        } while (numeroDoWhile < 0);

        // Ciclo For.
        System.out.println("");
        System.out.println("Ciclo For:");
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Switch.
        System.out.println("");
        System.out.println("Switch-Case:");
        switch(estacion) {
            case "PRIMAVERA": System.out.println("Es primavera."); break;
            case "VERANO": System.out.println("Es verano."); break;
            case "OTOÑO": System.out.println("Es otoño."); break;
            case "INVIERNO": System.out.println("Es invierno."); break;
            default: System.out.println("No corresponde a ninguna estación."); break;
        }
    }
}