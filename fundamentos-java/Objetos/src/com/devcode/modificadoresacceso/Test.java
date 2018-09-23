package com.devcode.modificadoresacceso;

public class Test {

    public static void main(String[] args) {
        Perro fido = new Perro();

        fido.setNombre("Fido"); //Accediendo al metodo setNombre en el cual no tenemos ningun problema TIPO: public
        fido.getNombre(); //Accediendo a getNombre tambien sin ningun problema TIPO: protected
        fido.getNombreRaza(); //Accediendo a getNombreRaza en el cual tampoco tenemos ningun problema siendo del mismo paquete. TIPO: String
        //fido.getId(); en este caso no se puede obtener el id por que es un TIPO: private

    }
}
