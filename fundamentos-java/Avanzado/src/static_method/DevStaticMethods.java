package static_method;

public class DevStaticMethods {

    static String varStatic;
    String varNoStatic;

    static void llenar() {
        varStatic = "Variable estatica";

        //En un bloque estatico no se pueden acceder a variables no estaticas
        //varNoStatic = "Variable no estatica";
    }

    void llenar02() {
        varStatic = "Variable estatica 2";
        varNoStatic = "Variable no estatica 2";
    }

    public static void main(String[] args) {
        llenar();

//        DevStaticMethods.llenar02();
        DevStaticMethods dce = new DevStaticMethods();
        dce.llenar02();


        System.out.println("varStatic: " + varStatic);
        System.out.println("varNoStatic: " + dce.varNoStatic);
    }
}
