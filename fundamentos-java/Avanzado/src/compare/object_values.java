package compare;

public class object_values {

    public static void main(String args[]) {
        String c1 = "Hola";

        String c2 = new String(c1);


        //== compara si estan en el mismo espacio de memoria
        System.out.println(c1 + " == " + c2 + " -> " + (c1 == c2)); //false

        //equals compara los caracteres
        System.out.println(c1 + " equals " + c2 + " -> " + c1.equals(c2)); //true

        String c3 = c1;

        System.out.println(c1 + " == " + c3 + " ->" + (c1 == c3)); //true
    }
}
