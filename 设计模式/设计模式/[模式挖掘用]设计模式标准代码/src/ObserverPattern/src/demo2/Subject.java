package ObserverPattern.src.demo2;

public interface Subject
{
	
    public void attach(Listener observer);

    public void detach(Listener observer);

    void notifyObservers(Event event);
}
