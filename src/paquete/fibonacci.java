package paquete;

public class fibonacci {

    public static void main(String[] args) {

        // Fibonnacci
        int x = 1;
        int anterior = 0;
        int temp;

        while (true) {
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;

            if (x > 100) {
                break;
            }
        }

    }


}
