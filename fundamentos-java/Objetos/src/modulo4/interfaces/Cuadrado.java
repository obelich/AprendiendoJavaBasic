package modulo4.interfaces;

///Las interfaces se pueden implementar varias a la vez
public class Cuadrado implements Figura, Figura2 {


    @Override
    public void calcularArea() {
        System.out.println("PIxRxR");
        System.out.println(PI); //Usar la constante de la interfaz
        System.out.println(Figura.PI); //Tambien puedesa acceder a las variables usando la la interfaz Figura.variable
    }
}
