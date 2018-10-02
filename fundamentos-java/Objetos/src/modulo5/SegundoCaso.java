package modulo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SegundoCaso {
    public static void main(String[] args) {

        SegundoCaso segundoCaso = new SegundoCaso();


        try {
            segundoCaso.disparandoExcepcion();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void disparandoExcepcion() throws IOException {

            FileInputStream fis = new FileInputStream("./text.txt");

    }
}
