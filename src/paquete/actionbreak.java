package paquete;

public class actionbreak {

    public static void main(String[] args) {

        int contador_final = 0;
        for (int contador = 0; contador <= 10; contador++) {

            System.out.println("Aun estas en el ciclo");
            //break Salir de un ciclo
            //continue; Continuar el codigo
            System.out.println("El contador vale: " + contador);

            if (contador < 8 ) {
                System.out.println("El ciclo continua y se salta mostrar en consola");
                continue; //Con continue si ubiera algo despues del else lo ignora y continua el ciclo
            } else {
                contador_final = contador;
                break;
            }

        }

        System.out.println("Has salido del ciclo for: " + contador_final);

    }


}
