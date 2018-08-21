package paquete;

public class ifelsejava {


    public static void main(String[] args) {
        /**
         * Operadores logicos de comparacion
         * >   Mayor que
         * <   Menor que
         * >=  Mayor o igual
         * <=  Menor o igual
         * ==  igual
         * ||  O
         * &&  and
         * !=  Diferente
         *
         */
        int var = 6;
        int var2 = 10;
        boolean cond;
        cond = true;

        System.out.println("Comparacion igualdad");
        if (var == 6) {
            cond = false;
            System.out.println("var si es 6");
        } else {
            cond = true;
            System.out.println("no es es 6");
        }
        System.out.println("------------------------------");

        System.out.println("Comparacion bolleana");
        if (cond) {
            System.out.println("La variable cond es verdadera");
        } else {
            System.out.println("La variable cond es falso");
        }
        System.out.println("------------------------------");

        System.out.println("Comparacion con dos variables que tienen que ser verdaderas");
        if ((var == 6) && (var2 > 5)) {
            System.out.println("Las dos variables dan verdadero");
        } else {
            System.out.println("Las dos variables dan falso");
        }
        System.out.println("------------------------------");

        System.out.println("Negando una comparacion");
        if (var != 6) {
            System.out.println("var es diferente de 6");
        } else {
            System.out.println("no es es 5");
        }

    }


}
