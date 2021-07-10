package Command.Controller;
import Command.Commands.ComandoApagar;
import Command.Commands.ComandoEncender;
import Command.Commands.ComandoMover;
import Command.IRobot;
import Command.invoker.IComando;

public class ControlRemoto {
    private IComando[] comandos = new IComando[3];

    public ControlRemoto(IRobot robot){
        comandos[0] = new ComandoEncender(robot);
        comandos[1] = new ComandoMover(robot);
        comandos[2] = new ComandoApagar(robot);
    }

    public void encender(){
        comandos[0].ejecutar();
    }

    public void mover(){
        comandos[1].ejecutar();
    }

    public void apagar(){
        comandos[2].ejecutar();
    }

}
