package com.devcode.tiposdedatos;

public class Auto {

    //las declaraciones de tipos de datos primitivos si no estan inicializados
    //a nivel de clase siempre tienen 0
    //Las variables a nivel de clase no requieren ser inicializadas de tipo primitivo
    byte cantidadPuertas;
    short cantidadCilindros;
    int cantidadCaballos;
    long numeroCircuitos= 0L;
    float cilindrajeMotor= 0.0f;
    double volumenTanque= 0.0d;
    char tipoMotor= '\u0000';
    boolean tieneSunroof= false;


    //Variables en tipo Wrapper estos tipos ya se consideran objetos
    Byte cantidadPuertasWrapper;
    Short cantidadCilindrosWrapper;
    Integer cantidadCaballosWrapper;
    Long numeroCircuitosWrapper= 0L;
    Float cilindrajeMotorWrapper= 0.0f;
    Double volumenTanqueWrapper= 0.0d;
    Character tipoMotorWrapper= '\u0000';
    Boolean tieneSunroofWrapper= false;

    public static void main(String[] args) {

        Auto miAuto = new Auto();

        System.out.println(miAuto.cantidadPuertas); //Esto no te da opcion ya que solo es una variable de tipo primitivo
        System.out.println(miAuto.cantidadPuertasWrapper); //esta opcion si tiene atributos y metodos si pones miAuto.cantidadPuertasWrapper. como equals o toString

        //Las variables a nivel de metodos si tienen que ser inicilizadas
        int cantidadCaballosEnMetodo = 0;

        System.out.println(cantidadCaballosEnMetodo);

    }
}
