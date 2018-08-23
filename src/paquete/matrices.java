package paquete;

public class matrices {

    public static void main(String[] args) {

        //Para generar una matriz se tiene que generar un arreglo con dos arreglos
        //Arreglo Bi-Dimencional

        int x[][];
        x = new int[3][3];
        //Asignar valores a cada arreglo
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;

        //Segundo indice
        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;

        //tercer indice
        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;


        //Accediendo a las matrices
        System.out.println("x[0][1] = "+ x[0][1]);
        System.out.println("x[1][0] = "+ x[1][0]);

        //Recorriendo con un for anidado

        for(int i=0; i<x.length;i++) {
            System.out.println("Arreglo en indice: "+i+" es igual a: "+ x[i]);

            for(int j=0; j<x.length;j++) {
                System.out.println("x["+i+"]["+j+"]"+ x[i][j] );
            }

        }


    }


}
