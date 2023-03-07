package CommandPattern.src.demo2;

public class ConcreteCommand implements Command
{
    public ConcreteCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }

    public void execute()
    {
        receiver.action();
        System.out.println("execute");
    }

    public void reexecute(){
        receiver.action();
        System.out.println("reexecute");
    }

    public void unexecute(){
        receiver.action();
        System.out.println("unexecute");
    }

    /**
     * @directed
     * @clientRole receiver
     */
    private Receiver receiver;
}
