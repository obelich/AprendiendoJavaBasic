package paquete;

public class caseswitch {

    public static void main(String[] args) {

        int x;
        x = 0;
       switch (x) {

           case 0:  //Si coincide entra y se ejecuta el codigo correspondiente
           {
               System.out.println("Esta es la opcion 0");
               break;
           }
           case 1:
           {
               System.out.println("Esta es la opcion 1");
               break;
           }
           default:
           {
               System.out.println("Si no coincide con ninguno se ejecuta este codigo");
           }
       }

    }



}
