public class Main {
    public static void main(String[] args) {

        int numerolf = 0;
        int numeroWhile = 0;
        String estacion = "primavera";
              // Estructura de control if else//
        if (numerolf > 0) {
            System.out.println("Es positivo");

        } else if (numerolf < 0) {
            System.out.println("Es negativo");

        } else if (numerolf == 0)
            System.out.println("Es cero");
              // Estructura de control while  //
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }
             // Estructura de control do while //
        do {
            System.out.println(numeroWhile);
        }
        while (numeroWhile < 3);
             // Estructura de control for //
        for (int numeroFor = 0; numeroFor <= 3;numeroFor++) {
            System.out.println(numeroFor);
        }
            // Estructura de control switch //
        switch (estacion) {
            case "verano" :
            System.out.println("Es verano");
            break;
            case "otoño" :
            System.out.println("Es otoño");
            break;
            case "primavera" :
            System.out.println("Es primavera");
            break;
            case "invierno" :
            System.out.println("Es invierno");
            break;
            default: System.out.println("No hay estaciones");
            break;

        }
    }}