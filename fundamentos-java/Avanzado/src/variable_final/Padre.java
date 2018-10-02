package variable_final;


//Si una clase  tiene final no se permite usarse como herencia
//public final class Padre {

public class Padre {

    //Un metodo con la palabra final no puede hacerse override
    final void serVivo() {
        System.out.println("Yo soy un ser vivo");
    };
}
