package Command.Commands;

import Command.IRobot;
import Command.invoker.IComando;

public class ComandoApagar implements IComando {
    IRobot robot;

    public ComandoApagar(IRobot robot) {
        this.robot = robot;
    }


    @Override
    public void ejecutar() {
        robot.apagar();
    }
}
