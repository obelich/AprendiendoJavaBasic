package variable_final;

public class DevCodeFinalVariable {
    //FINAL si se inicializa ya no podra ser modificado ni en el constructor
    final int MAX_VALUE=99;


    public static void main(String[] args) {
        DevCodeFinalVariable obj = new DevCodeFinalVariable();
        obj.myMethod();
    }


    //Si la variable con FINAL no ha sido inicializada solo asi se podria inicializar en el constructor
    //y es la unica forma ya que una variable con final no se puede cambiar
//    void DevCodeFinalVariable() {
//        MAX_VALUE = 101;
//    }


    void myMethod() {
//        MAX_VALUE = 101;
        System.out.println(MAX_VALUE);
    }
}
