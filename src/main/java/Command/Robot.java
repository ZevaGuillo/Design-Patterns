package Command;

public class Robot implements IRobot{

    @Override
    public void mover() {
        System.out.println("Me estoy moviendo...");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando...");
    }
}
