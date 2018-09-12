package ciclos;

import java.util.Scanner;

public class CicloWhileV2 {

    public static void main(String[] args) {
        System.out.println("Por favor introduce el numero de elementos a iterar: ");
        int maxElementos;

        Scanner entradaEscaner = new Scanner(System.in);
        maxElementos = entradaEscaner.nextInt();
        int contador = 0;

        while (contador < maxElementos) {
            System.out.println("Contador = " + contador);
            contador++;
        }
    }


}
