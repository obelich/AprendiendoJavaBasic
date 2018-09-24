package com.devcode.garbaggecollector;

import com.devcode.tiposdedatos.Auto;

public class Collector {

    public static void main(String[] args) {
        //HEAP es el espacio de memoria dinamico
        //GC Garbagge collector que se encarga de trabajar con el HEAP


        Auto miAuto = new Auto();
        Auto miOtroAuto = new Auto();

        miAuto = new Auto();

        System.gc(); //Con esto se sugiere al sistema que ejecute la liberación de memoria

    }

}
