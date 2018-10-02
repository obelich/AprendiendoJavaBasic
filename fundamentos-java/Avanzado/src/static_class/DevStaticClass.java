package static_class;

public class DevStaticClass {

    static String cadena01 = "Mi cadena 01";
    String cadena02= "Mi cadena 02";


    //Una clase solo puede ser estatica si es anidada
    static class ClaseAnidada {
        //Una clase estatica no puede acceder a elementos no estaticoos
        void imprimirValor() {
            System.out.println("cadena01" + cadena01);
        }
    }


    public static void main(String[] args[]) {
        DevStaticClass.ClaseAnidada objCa = new DevStaticClass.ClaseAnidada();
        objCa.imprimirValor();

        DevStaticClass objDce = new DevStaticClass();
        System.out.println("objetoDce.cadena02: " + objDce.cadena02);

    }

}
