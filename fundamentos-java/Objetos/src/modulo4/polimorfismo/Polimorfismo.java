package modulo4.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {

    public static void main(String[] args) {
        Abogado abogado = new Abogado();
        Ingeniero ingeniero = new Ingeniero();
        Medico medico = new Medico();

        List<EsProfesional> listaProfesionales = new ArrayList<>();

        listaProfesionales.add(abogado);
        listaProfesionales.add(ingeniero);
        listaProfesionales.add(medico);
    }

}
