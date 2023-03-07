package ObserverPattern.src.demo1;

public class Test {

   
    public static void main(String[] args) {
        Subject subject =new ConcreteSubject();

        subject.attach((Observer)new ConcreteObserver());
        subject.notifyObservers();
    }
}