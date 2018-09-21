import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;



    public void jugar() {

        System.out.println("Cual es tu nombre");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar \n", nombreJugador);


        while(juegoActivo) {
            int intentos = 0;
            int min = 0 ;
            int max = 100;

            int numeroJuego = (int) (Math.random() * ((max - min) +1));

            System.out.printf("%s, he escogido un numero entre %d y %d, adivinalo ", nombreJugador, min, max);
            int numeroJugador;

            do {

                System.out.println("Escoge un numero");
                numeroJugador = entrada.nextInt();

                if (numeroJuego < numeroJugador) {
                    System.out.println("Muy alto, adivina otra vez \n");
                } else if (numeroJuego > numeroJugador) {
                    System.out.println("Muy bajo, adivina otra vez \n");
                }
                intentos++;
            } while(numeroJuego != numeroJugador);

            System.out.printf("Felicidades adivinaste con %d intentos \n", intentos);

            juegoActivo = false;

        }

    }


}
