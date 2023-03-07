package ObserverPattern.src.javautil;

public class Client {

    public Client() {
    }
    public static void main(String[] args) {
        ConcreteObservable Observable=new ConcreteObservable();
        Observable.addObserver(new ConcreteObserver());
        Observable.setName("ddd");
    }
}