package modulo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrimerCaso {

    public static void main(String[] args){

        //Caso 1
//            try{
//                System.out.println(3/0);
//            } catch (Exception e) {
//                //e.getMessage() capturas el mensaje de la excepcion y esto da (/ by zero)
//                System.out.println("Estoy en a excepcion " + e.getMessage());
//            }


        //Caso 2
//        try{
//            int []edades = {3,4,5,6};
//            System.out.println(edades[4]);
//        } catch (Exception e) {
//            //e.getMessage() capturas el mensaje de la excepcion y esto da (/ by zero)
//            System.out.println("Estoy en a excepcion " + e);
//        }


        //Caso 3
        try{
            FileInputStream fis = new FileInputStream("./test.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
