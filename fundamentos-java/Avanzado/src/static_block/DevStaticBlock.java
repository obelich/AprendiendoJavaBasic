package static_block;

public class DevStaticBlock {

    static int numero;
    static String cadena;

    static {
        System.out.println("Static Bloque 1");
        numero = 68;
        cadena = "Bloque 1";
    }

    void imprimir() {
        System.out.println("imprimir");
    }


    public static void main(String[] args) {
        DevStaticBlock dce = new DevStaticBlock();
        dce.imprimir();


        //Los bloques estaticos se ejecutan primero que las instancias
        System.out.println("Valor de numero: " + numero);
        System.out.println("Valor de cadena: " + DevStaticBlock.cadena);
    }


}
