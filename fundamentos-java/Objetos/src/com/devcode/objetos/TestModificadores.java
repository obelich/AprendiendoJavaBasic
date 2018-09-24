package com.devcode.objetos;

import com.devcode.modificadoresacceso.Perro;

public class TestModificadores {

    public static void main(String[] args) {
        Perro fido = new Perro();

       // fido.getNombreRaza(); //A esto no se puede acceder por que no esta dentro del mismo paquete TIPO: String
        fido.setNombre("Fido"); //Siendo publico si se puede acceder a este metodo aunque no este en el mismo paquete
    }
}
