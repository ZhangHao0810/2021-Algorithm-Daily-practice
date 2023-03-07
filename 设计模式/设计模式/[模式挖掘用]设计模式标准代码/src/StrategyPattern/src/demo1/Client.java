package StrategyPattern.src.demo1;

public class Client {

    public Client() {
    }
    public static void main(String[] args) {

        ConcreteStrategy1 strategy1=new ConcreteStrategy1();

        Context context=new Context(strategy1);
        context.contextInterface();
    }
}