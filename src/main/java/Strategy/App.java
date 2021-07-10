package Strategy;

public class App {
    public static void main(String[] args) {

        Navigator navigator = new Navigator(new DrivingStrategy());

        navigator.generateRoute("Origen", "Destino");

        navigator = new Navigator(new PublicTransport());

        navigator.generateRoute("Origen", "Destino");

        navigator = new Navigator(new WalkingStrategy());

        navigator.generateRoute("Origen", "Destino");


    }
}
