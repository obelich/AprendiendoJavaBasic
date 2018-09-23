package com.devcode.constructores;

public class ConstructoresPadre {

    public static void main(String[] args) {
        ConstructoresHijo constructoresHijo = new ConstructoresHijo();

    }

    public ConstructoresPadre() {
        System.out.println("Hola, soy el constructor padre");

    }

}


//Aqui se usaron dos clases en un solo archivo solo para ejemplificar
class ConstructoresHijo extends ConstructoresPadre {



    public ConstructoresHijo() {
        //La palabra super(); se genera en el constructor implicitamente aunque nosotros no la pongamos
        //Si en el padre se requieren parametros, en el hijo se tienen que pasar atravez de la palabra super(param1);
        System.out.println("Hola, soy el constructor hijo");

    }

}
