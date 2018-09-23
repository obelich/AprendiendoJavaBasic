package com.devcode.modificadoresacceso;

public class Perro {

    private int id;
    private String nombre;
    private String raza;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Del tipo protected pueden acceder o del mismo paquete o clases hijas
    protected String getNombre() { //Este tipo de modificador no permite que sea usada fuera del mismo paquete
        return this.nombre;
    }

    String getNombreRaza() { //Este tiene el modificador de tipo por defecto que solo deja acceder si pertenece al mismo paquete.
        return this.nombre + " " +this.raza;
    }

    private int getId() { //Este tipo solo puede ser accedido en la misma clase
        return this.id;
    }


}
