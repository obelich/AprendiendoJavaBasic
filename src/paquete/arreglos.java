package paquete;

public class arreglos {

    public static void main(String[] args) {

        //Primera forma para declarar un arreglo
        int x[];
        x = new int[3]; //Se le asigna cuantas variables podra contener en este caso 10

        //Asignando los datos a un arreglo primera forma
        x[0] = 10;
        x[1] = 5;
        x[2] = 7;


        //Segunda forma de declarar un arreglo
//        int y[] = new int[3];

        //Segunda forma para declarar y  asignacion de los datos al arreglo
        int y[] = {10,5,7};


        //Recorrer el arreglo con for
        for(int i=0; i<x.length;i++) {
            System.out.println("Arreglo en nindice: "+i+" es igual a: "+ x[i]);
        }



    }


}
