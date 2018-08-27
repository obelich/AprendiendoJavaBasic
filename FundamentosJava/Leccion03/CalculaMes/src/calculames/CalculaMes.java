package calculames;

import java.util.Random;

public class CalculaMes {

    public static void main(String[] args) {
        Random rand = new Random();
        int mes = rand.nextInt(12) + 1;
        String estacion;

        if (mes  == 1 || mes == 2 || mes == 12 ) {
            estacion =  "Invierno";
        } else if (mes  == 3 || mes == 4 || mes == 5 ) {
            estacion = "Primavera";
        } else if (mes  == 6 || mes == 7 || mes == 8 ) {
            estacion = "Verano";
        } else if (mes  == 9 || mes == 10 || mes == 11 ) {
            estacion = "Otoño";
        } else {
            estacion = "Ese mes no existe xDD";
        }

        System.out.println("La estacion para el mes " + mes + " es: " + estacion);

    }

}
