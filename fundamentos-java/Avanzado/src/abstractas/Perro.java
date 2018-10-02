package abstractas;

public class Perro extends Animal {

    public Perro() {
        this.setTipo("Perro");
    }

    public Perro(String  tipo) {
        super(tipo);
    }

    @Override
    public void desplazarse() {
        System.out.println("corro no tan Rapidamente");

    }

    @Override
    public void alimentarse() {
        System.out.println(" ** me alimento de carne ");
    }
}
