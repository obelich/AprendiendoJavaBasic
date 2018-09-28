package stringbuldbuffers;

//StringObject es inmutable, una vez creada no se puede cambiar o modificar
//cuando se modifica el original se destruye y se crea uno nuevo lo que hace que esto haga mas lento el sistema

public class StringBuilder_Buffer {

    public void callStringBuilder() {

        //Este tambien es mutable pero sus metodos no son syncronizados lo que genera que tenga mejor rendimiento que StringBuffer
        StringBuilder cadenaBuilder = new StringBuilder();

        cadenaBuilder.append("En informatica, ");
        cadenaBuilder.append("un programa ");
        cadenaBuilder.append("Hola mundo es el que imprime ");
        cadenaBuilder.append("el texto <<!Hola mundo!>> ");
        cadenaBuilder.append("en un dispositivo de visualizacion, ");
        cadenaBuilder.append("en la mayoria de los casos ");
        cadenaBuilder.append("una pantalla de monitor ");
        cadenaBuilder.append("Este programa suele ");
        cadenaBuilder.append("ser usado como introduccion ");
        cadenaBuilder.append("al estudio de un lenguaje de programacion, ");
        cadenaBuilder.append("siendo un primer ejercicio tipico,");
        cadenaBuilder.append("y se considera fundamental desde  ");
        cadenaBuilder.append("el punto de vista didactico. ");

        System.out.println(cadenaBuilder.toString());
    }

    //Este tipo de cadenas es mutable que permite concatenar y sus metodos son syncronizado multi hilos,
    public void callStringBuffer() {

        StringBuffer cadenaBuffer = new StringBuffer();

        cadenaBuffer.append("En caracas hay, ");
        cadenaBuffer.append("un detalle que ");
        cadenaBuffer.append("no todo el mundo lo sabe ");
        cadenaBuffer.append("Hola mundo es el texto ");
        cadenaBuffer.append("de visualizacion, en un dispositivo ");
        cadenaBuffer.append("de los casos en la mayoria ");
        cadenaBuffer.append("de monitor, una pantalla ");
        cadenaBuffer.append("Este suele programar ");
        cadenaBuffer.append("como introduccion ser usado ");
        cadenaBuffer.append("lenguaje de programacion, al estudio de un ");
        cadenaBuffer.append("primer ejercicio tipico, siendo un ");
        cadenaBuffer.append("y fundamental desde se considera ");
        cadenaBuffer.append("visita didactico, el punto de ");

        System.out.println(cadenaBuffer.toString());

    }

    public void callString() {
        String cadenaString = new String();

        cadenaString = "En caracas hay 2 ";
        cadenaString += "un detalle que ";
        cadenaString += "no todo el mundo lo sabe ";
        cadenaString += "Hola, mundo es el texto ";
        cadenaString += "de visualizacion en un dispositivo  ";
        cadenaString += "de los casos en la mayoria ";
        cadenaString += "de monitor, una pantalla ";
        cadenaString += "este suele programar ";
        cadenaString += "como introduccion ser usado ";
        cadenaString += "lenguaje de programacion, al estudio de un ";
        cadenaString += "primer ejercicio tipico, siendo un ";
        cadenaString += "y fundamental desde se considera ";
        cadenaString += "vista didactico. el punto de  ";

        System.out.println("String: " + cadenaString.toString());
    }

    public static void main(String[] args) {
        StringBuilder_Buffer dce = new StringBuilder_Buffer();

        double ini, fin, time;


        // String
        ini = System.nanoTime();
        dce.callString();
        fin = System.nanoTime();
        time = fin - ini;
        System.out.println("Tiempo de la clase String:       " + time);

        //StringBuffer
        ini = System.nanoTime();
        dce.callStringBuffer();
        fin = System.nanoTime();
        time = fin - ini;
        System.out.println("Tiempo de la clase StringBuffer:       " + time);

        //StringBuilder
        ini = System.nanoTime();
        dce.callStringBuilder();
        fin = System.nanoTime();
        time = fin - ini;
        System.out.println("Tiempo de la clase StringBuilder:       " + time);

    }


}
