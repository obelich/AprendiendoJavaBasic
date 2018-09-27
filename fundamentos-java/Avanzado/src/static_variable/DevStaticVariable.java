package static_variable;

public class DevStaticVariable {

    //Las variables estaticas comparten solo una direccion de memoria para todos los objetos
    static String varStatic;
    String varNoStatic;

    public static void main(String[] args) {

        DevStaticVariable dce1 = new DevStaticVariable();
        DevStaticVariable dce2 = new DevStaticVariable();

        dce1.varNoStatic = "Variable no estatica 1";
        dce1.varStatic = "Variable estatica 1";

        dce2.varNoStatic = "Variable no estatica 2";
        dce2.varStatic = "Variable estatica 2";

        System.out.println("dce1.varStatic: " + dce1.varStatic);
        System.out.println("dce1.varNoStatic: " + dce1.varNoStatic);

        System.out.println("dce2.varStatic: " + dce2.varStatic);
        System.out.println("dce2.varNoStatic: " + dce2.varNoStatic);


    }
}
