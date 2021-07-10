package Command;

import Command.Controller.ControlRemoto;

public class App {
    public static void main(String[] args) {
        IRobot robot = new Robot();
        ControlRemoto controlRemoto = new ControlRemoto(robot);

        controlRemoto.encender();
        controlRemoto.mover();
        controlRemoto.apagar();

    }
}
