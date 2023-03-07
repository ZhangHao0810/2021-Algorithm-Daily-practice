package BridgePattern.src.demo1;

public class client {

    public client() {
    }
    public static void main(String[] args) {
        Abstraction client1 = new RefinedAbstraction();
        client1.operation();
    }
}