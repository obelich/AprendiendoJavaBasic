package com.devcode.constructores;

public class ConstructoresDefecto {

    public static void main(String[] args) {
        ConstructoresDefecto constructoresDefecto = new ConstructoresDefecto(); // todas las clases tienen su constructor
        //aunque no se tengan declaradas en la clase y esta es sun parametros

        ConstructoresDefecto constructoresDefectoParametro = new ConstructoresDefecto(1);

    }
    //Cuando se agrega constructor a la clase automaticamente se sobrescribe el constructor por defecto


    //Los constructores no tienen que tener la palabra void
    //Creando constructor vacio
    public ConstructoresDefecto() { //Los constructores llevan el mismo nombre que la clase
        //Si al constructor se le agrega la palabra reservada void el constructor se combierte en un metodo
        System.out.println("hola");

    }

    //Puede existir sobrecarga de constructores agregando dos constructores una
    public ConstructoresDefecto(int parameter1) {
        System.out.println("hola " + parameter1);

    }

}
