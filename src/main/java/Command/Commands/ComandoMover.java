package Command.Commands;

import Command.IRobot;
import Command.invoker.IComando;

public class ComandoMover implements IComando {

    IRobot robot;

    public ComandoMover(IRobot robot) {
        this.robot = robot;
    }


    @Override
    public void ejecutar() {
        robot.mover();
    }
}
