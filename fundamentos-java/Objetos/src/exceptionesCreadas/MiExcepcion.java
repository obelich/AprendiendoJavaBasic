package exceptionesCreadas;

public class MiExcepcion extends Exception {

    public MiExcepcion(){};

    public String mensajeExcepcion(){
        return "Error provocado.";
    }

    public String mensajeExcepcion2() {
        return "Error provocado 2";
    }
}
