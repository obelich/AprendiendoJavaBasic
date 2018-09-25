package modulo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SegundoCaso {
    public static void main(String[] args) {
        SegundoCaso segundoCaso = new SegundoCaso();
        segundoCaso.disparandoExcepcion();

    }

    private void disparandoExcepcion() {
        try {
            FileInputStream fis = new FileInputStream("./text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
    }
}
