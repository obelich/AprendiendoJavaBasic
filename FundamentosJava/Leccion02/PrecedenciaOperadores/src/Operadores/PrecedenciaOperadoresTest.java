package Operadores;

public class PrecedenciaOperadoresTest {

    public static void main(String[] args) {
        System.out.println("Primer Ejemplo Procedencia Operadores");

        int x = 5;
        int y = 10;
        int z = ++x * y--;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Ejemplo Evaluacion");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println( (4 + 5) * (6 / 3) );

        System.out.println("Otro Ejemplo Evaluacion");
        System.out.println( 1 + 2 - 3 * 4 / 5);
        System.out.println( 1 + 2 - (3 * (4 / 5)));

    }


}
