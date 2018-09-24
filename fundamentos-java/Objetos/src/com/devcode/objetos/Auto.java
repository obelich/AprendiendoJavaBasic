package com.devcode.objetos;

public class Auto {

    private int numeroPuertas;
    private  double largo;
    private double ancho;
    private String nroPlaca;

    public static void main(String args[]) {

        Auto auto = new Auto();

        auto.setNumeroPuertas(5);
        auto.setAncho(1.5);
        auto.setLargo(4.2);
        auto.setNroPlaca("AHA-D432");

        System.out.println(auto.toString());
    }


    @Override
    public String toString() {
        return "Auto{" +
                "numeroPuertas=" + numeroPuertas +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", nroPlaca='" + nroPlaca + '\'' +
                '}';
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(String nroPlaca) {
        this.nroPlaca = nroPlaca;
    }
}
