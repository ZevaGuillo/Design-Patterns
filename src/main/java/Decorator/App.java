package Decorator;

public class App {
    public static void main(String[] args) {

        System.out.println("Tres leches: " + new TresLeches().costo());
        System.out.println("Tiramisu: " + new Tiramisu().costo());

        Pastel pastel1 = new Chocolate(new TresLeches());

        Pastel pastel2 = new Chicle(new Tiramisu());

        System.out.println(pastel1.descripcion()+": "+pastel1.costo());
        System.out.println(pastel2.descripcion()+": "+pastel2.costo());

    }
}
