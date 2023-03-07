package ObserverPattern.src.demo1;

public interface Subject{
    public void attach(Observer observer);
    public void detach(Observer observer);
    void notifyObservers();
}
