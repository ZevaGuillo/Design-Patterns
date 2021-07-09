package Prototype;

public class App {
    public static void main(String[] args) {
        Carro c1 = new Carro("GBDE2354", "Chevrobl");
        Moto m1 = new Moto("HB32", "misu");

        System.out.println(c1.hashCode());
        System.out.println(m1.hashCode());

        Vehiculo c2 = c1.clonar();
        Vehiculo m2 = m1.clonar();

        System.out.println(c2.hashCode());
        System.out.println(m2.hashCode());


    }
}
