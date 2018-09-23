package com.devcode.objetos;

import java.util.Date;

public class Perro {

    private String nombre;
    private String raza;
    private Date fechaNacimiento;

    public static void main(String args[]) {

        Perro fido = new Perro();
        Perro firulais = new Perro("firulais");

    }

    public  Perro() { // Se puede tener una clase con dos constructures
        System.out.println("Hola mundo, soy un perro");
    }

    public  Perro(String nombre) {
        System.out.println("Hola mundo, soy un perro " + nombre);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
