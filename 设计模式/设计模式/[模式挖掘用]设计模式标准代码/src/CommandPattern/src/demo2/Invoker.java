package CommandPattern.src.demo2;
import java.util.*;
public class Invoker
{

    public Invoker(Command command)
    {
        this.command = command;
    }

    public void action()
    {
		command.execute();
        command.unexecute();
        command.reexecute();
    }
    private Command command;
}
