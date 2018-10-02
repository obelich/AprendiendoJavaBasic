package exceptionesCreadas;

public class Principal {

    public static void main(String[] args) {
        try {
            throw new MiExcepcion();

        } catch (MiExcepcion e) {
            System.out.println(e.mensajeExcepcion());
        }

        finally {
            System.out.println("todo bien");
        }


    }
}
