package com.devcode.constructores;

public class ConstructoresSobrecarga {


    public static void main(String[] args) {
        ConstructoresSobrecarga constructoresSobrecarga = new ConstructoresSobrecarga(1,2);


    }




    public ConstructoresSobrecarga() {

        System.out.println("Constructor sin parametros");
    }


    public ConstructoresSobrecarga(int parametro) {

        System.out.println("Constructor sobrecarga con 1 parametro");
    }


    public ConstructoresSobrecarga(int parametro1, int parametro2) {
        System.out.println("Constructor sobrecarga con 2 parametros");

    }



}
