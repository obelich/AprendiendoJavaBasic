package abstractas;

public class Gato extends Animal {

    public Gato() {
        this.setTipo("Gato");
    }

    public Gato(String  tipo) {
        super(tipo);
    }

    @Override
    public void desplazarse() {
        System.out.println("corro Rapidamente en corta distancia");

    }

    @Override
    public void alimentarse() {
        System.out.println(" ** me alimento de ratones ");
    }
}
