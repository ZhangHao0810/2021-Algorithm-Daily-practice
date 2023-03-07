package ObserverPattern.src.demo2;

public class ConcreteListener implements Listener
{
    public void update(Event event)
    {
        System.out.println(event.getName());
    }
}
