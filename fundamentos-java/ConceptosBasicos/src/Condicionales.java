import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de propinas");
        System.out.println("Ingresa la cantidad a pagar");

        double cantidad = entrada.nextDouble();
        System.out.println("Ingrese el % de propina");
        int porcentaje = entrada.nextInt();


        // If else basico
        /*if (porcentaje < 15) {
            System.out.println("El servicio no fue muy bueno");
        } else {
            System.out.println("El servicio fue bueno");
        }*/

        // if else con mas condicionales
        if (porcentaje < 15) {
            System.out.println("El servicio no fue muy bueno");
        } else if (15 <= porcentaje && porcentaje < 30) {
            System.out.println("El servicio fue bueno");
        } else {
            System.out.println("El servicio fue excelente");
        }



        double total = cantidad + (cantidad * porcentaje / 100);
        System.out.printf("El total es: %.1f :", total);
    }
}
