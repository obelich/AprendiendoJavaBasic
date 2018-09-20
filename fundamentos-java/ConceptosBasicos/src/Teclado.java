import java.util.Scanner;

public class Teclado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es tu nombre");
        String nombre = entrada.nextLine(); //Con esto se captura lo que envia el usuario

        System.out.println("Cual es tu edad");
        int edad = entrada.nextInt();

        System.out.println("Muchas gracias " +   nombre);
        System.out.println("Tu edad  " +   edad + " quedo registrada");
    }
}
