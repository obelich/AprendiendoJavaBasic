public class Variables {

    public static void main(String[] args) {
        int pizzaes =  6;
        int personas = 3;
        int pizzarsPorPersona = pizzaes / personas;

        System.out.printf("Si hay %d  pizzas y %d personas, a cada una le tocan %d pizzas \n", pizzaes, personas, pizzarsPorPersona);

        String auto = "Ferrari";
        double velocidad = 90.3;
        System.out.printf("el auto %s se desplaza a %g km/h \n", auto, velocidad);

        // Sumar valores de distinto tipo

        int precioLeche = 14;
        double precioJamon = 35.6;
        int precioHuevo = 23;

        double precioTotal = precioLeche + precioJamon +  precioHuevo;
        System.out.printf("El precio total es: %f \n", precioTotal);
    }
}
