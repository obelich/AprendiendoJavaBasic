package com.anncode.holamundo;

public class HolaMundo { //Las clases siempre seran Upper camel case

    public static void main(String[] args) {

        System.out.println("Hola mundo con Java, Platzi usando un paquete");

        //Tipos primitivos

        //Enteros

        byte edad = 127;
        short year = -32768;
        int id_user = 1001;
        long id_twitter = 12345678923112L;

        //Punto flotante
        float diametro = 34.25F;
        double precio = 12345.1231231465465465; //Cosas de dinero van con este tipo

        //Texto
        char genero = 'M'; // el tipo char solo puede ser con comillas simples 2 bytes

        //Logicos
        boolean isVisible = true; ;// Este solo acepta false o true y usa 2 bytes
        boolean funciona = false;

        //Variables

        int variable = 2; //Java es case sensirive osea que reconoce entre mayusculas y minusculas
        int _variable = 3; //Una variable puede iniciar con _ O $
        int $variable = 4; //Las variables no pueden comenzar con numero

        //Las constantes se escriben con mayusculas

        int VALOR = 0; //Las constantes son inmutables, no pueden ser modificada
        int VALOR_MAXIMO = 1;

        //Lower camel case es para metodos y variables
        int minValor = 4;

        //Upper camel case
        int MinValor = 6; //Esto es incorrecto ya que las variables no tienen que iniciar con mayusculas

        //Casteo
        byte b = 6;
        short s = b; //Casteo implicito


        b = (byte) s; // Casteo explicito

        int i = 1;
        double d = 2.5;

        i = (int) d;

        System.out.println(i);

        //Casteo a char
        int codigo = 97;
        char codigoASCII = (char) codigo;

        System.out.println(codigoASCII);

        short numero = 300;
        byte numeroByte = (byte) numero; //Investigar que pasa si el numero es mayor al tipo donde se castea
        System.out.println(numeroByte);

        //Arrays
        //Declaracion de array

        //Para declarar un array se declara el tipo de dato y se le agrega [] Ejemplo int[]  String[]
        int[] arregloInt = new int[3]; //Si se declara que es tipo int el contenido tiene que ser tipo int no se podria agregar en el arreglo un char o float etc...
        double arreglodouble[];

        System.out.println("Arrays");
        //Array de 2 dimeciones
        int[][] array2D = new int[2][3]; //A este arreglo le caben 6 objetos

        //Array en 3 dimenciones
        int[][][] array3D = new int[3][3][2]; //caben 18 objetos

            //Otra forma de declarar arrays
            char[][] days = { {'L', 'M', 'M'}, {'J', 'V', 'S'} }; //Dos dimenciones
            char[][][] days3D = { { {'a', 'b'}, {'c', 'd'}, {'e','f','g'} }, { {'h', 'i'}, {'j', 'k'}, {'l', 'm'} }  };

            char[] names = new char[4];
            names[0] = 'h';
            names[1] = 'o';
            names[2] = 'l';
            names[3] = 'a';
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        char[][][][] monkey = new char [2][3][2][2];
        monkey[1][0][0][1] = 'm';
        System.out.println(monkey[1][0][0][1]);

        System.out.println("Operadores aritmeticos");
        //Operadores Aritmeticos

        int a = 1;
        int aa = a+a;

        System.out.println("El valor de aa es: " + aa);

        double x = 2.56;
        int y = 9;

        float w = (float) x + y;
        System.out.println(w);

        System.out.println(w*2); //multiplicar

        double k = 4/0.00002; //Division
        System.out.println(k);

        System.out.println(7%2); //modulus

        int f = 2;
        int g = 3;
        //Un modo de sumar
//        f = f + g;
        //Seungdo modo de sumar
        f += g;
        System.out.println(f);

        System.out.println("Operador de incremento y decremento");
        //Operadores incremento y decremento.


        int l = 3;
//        l++;
//        ++l;
//        System.out.println(l);

        //++l
        //1.- Incrementa el valor l+1
        //2,- Asignar el valor a l
//        System.out.println(++l);

        //l++
        //1.- Asigna el valor a l  l = l
        //2.- Incrementa el valor l+1
        System.out.println(l++); //Aqui imrpime el valor de l
        System.out.println(l); //Aqui ya imprime el valor de l incrementado

        System.out.println("Operadores relacionales");

        int q = 5;
        int p = 4;

        System.out.println( q == p );
        System.out.println( q != p );

        //Operadores relacionales
        System.out.println("q > p  -> " + (q > p));
        System.out.println("q < p  -> " + (q < p));

        System.out.println("q >= p  -> " + (q >= p));
        System.out.println("q <= p  -> " + (q <= p));

        System.out.println("Operadores Logicos");

        boolean n = false;
        boolean m = true;

        System.out.println("n && m ->" + (n && m) );
        System.out.println("n || m ->" + (n || m) );
        System.out.println("!n ->" + (!n) );
        System.out.println("!m ->" + (!m) );


        System.out.println("Control de flujo");
        //iF/Else

        if (q > p) {
            System.out.println("q es mayor que p");
        } else if (q == p) {
            System.out.println("p es igual a q");
        } else {
            System.out.println("p es mayor que q");
        }

        //Switch
        int mes = 8;

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("mes incorrecto");
                break;
        }
        System.out.println("");

        //Los ciclos
        //Ciclo While
        System.out.println("Ciclo While");
        int e = 1;
        while (e <= 5) {
            System.out.println("e es menor o igual que 5 y vale:  " + e);
            e++;
        }

        //Bucle for

        System.out.println("");
        System.out.println("Ciclo for");
        for (int c = 0; c <= 5; c++ ) {
            System.out.println("c es menor o igual que 5 y vale:  " + c);
        }

        System.out.println("");
        System.out.println("Recorriendo arreglos con el ciclo for");
        int[] numeros = new int[5];
        for (int c = 0; c < 5; c++ ) {
            numeros[c] = c;
            System.out.println("el array numeros["+ c +"]: " + numeros[c]);
        }

        System.out.println("");
        //Ciclo Foreach
        for (int j: numeros) {
            System.out.println(j);
        }



    }

    //los metodos son con Lower camel case


}
