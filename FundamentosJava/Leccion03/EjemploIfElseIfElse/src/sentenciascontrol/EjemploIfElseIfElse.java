package sentenciascontrol;
import java.util.Random;

public class EjemploIfElseIfElse {

    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(30) + 1;

        if (x  == 10) {
            System.out.println("X igual a 10 ");
        } else if (x  == 20) {
            System.out.println("X mayor que 20 \n");
        } else if (x == 30) {
            System.out.println("X mayor que 30 \n");
        } else {
            System.out.println("X no es igual ni a 10, ni 20 o 30 \n");
        }

        System.out.println("x vale: " + x);

    }

}
