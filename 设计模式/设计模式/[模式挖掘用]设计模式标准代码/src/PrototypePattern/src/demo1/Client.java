package PrototypePattern.src.demo1;

public class Client
{

        public static void main(String[] args) {
            Prototype p = new ConcretePrototype();
            Prototype p1 = (Prototype)p.clone();
    }

}
