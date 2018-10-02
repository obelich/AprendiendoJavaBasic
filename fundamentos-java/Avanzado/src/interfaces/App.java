package interfaces;

public class App {

    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta(2);
        bicicleta.trasladar();

        Carro carro = new Carro(4);
        carro.trasladar();

        Barco barco = new Barco(6);
        barco.funcionar();
        barco.trasladar();
    }
}
