package paquete;

public class ciclowhile {

    public static void main(String[] args) {

        int x = 0;
        boolean cond = true;
        while (cond) {
            System.out.println("El valir de x es: " + x + " Y cond es: " + cond);
            x = x + 2;

            if (x > 8) {
                cond = false;
                System.out.println("X ya es mayor a 8 y ahora cond es:  " + cond);
            }
        }


    }


}
