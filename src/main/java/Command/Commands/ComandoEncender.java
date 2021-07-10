package Command.Commands;

import Command.IRobot;
import Command.invoker.IComando;

public class ComandoEncender implements IComando {

    IRobot robot;

    public ComandoEncender(IRobot robot) {
        this.robot = robot;
    }

    @Override
    public void ejecutar() {
        robot.encender();
    }
}
