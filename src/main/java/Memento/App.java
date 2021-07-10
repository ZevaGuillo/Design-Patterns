package Memento;

public class App {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Originador originador = new Originador();

        originador.setEstado("Primero");

        careTaker.push(originador.crearMemento());

        originador.setEstado("Segundo");

        originador.restaurar(careTaker.pop());

        System.out.println(originador.getEstado());

    }
}
