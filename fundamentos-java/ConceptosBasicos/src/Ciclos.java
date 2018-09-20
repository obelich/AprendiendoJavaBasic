import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres procesar");
        int cantidad = entrada.nextInt();

        //Ciclo for
        System.out.printf("Ingresa 5% datos \n", cantidad); //Intell souf si queremos que sea ln es  sout

//        for (int i = 1; i <= cantidad; i++) {
//            System.out.printf("Dato %d: \n", i);
//            int num = entrada.nextInt();
//            int resultado = num * 2;
//            System.out.printf("datos %d procesado: %d \n", i, resultado  );
//        }

        //Ciclo While

        int c = 1;
        while(c <= cantidad) {
            System.out.printf("Dato %d: \n", c);
            int num = entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("datos %d procesado: %d \n", c, resultado  );
            c++;
        }

    }

}
