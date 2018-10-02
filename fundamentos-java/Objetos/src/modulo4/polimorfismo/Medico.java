package modulo4.polimorfismo;

public class Medico implements EsProfesional {
    @Override
    public void mostrarProfesion() {
        System.out.println("Cuidar la sallud");
    }
}
