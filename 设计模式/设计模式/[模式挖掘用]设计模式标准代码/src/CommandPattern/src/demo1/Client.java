package CommandPattern.src.demo1;

public class Client
{
    public static void main(String[] args)
    {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker( command );

        invoker.action();
    }
}
