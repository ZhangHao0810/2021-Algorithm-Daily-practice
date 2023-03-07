package ObserverPattern.src.demo1;

public class ConcreteObserver implements Observer
{
    public void update()
    {
        System.out.println("I am ConcreteObserver, already updated ");
    }
}
