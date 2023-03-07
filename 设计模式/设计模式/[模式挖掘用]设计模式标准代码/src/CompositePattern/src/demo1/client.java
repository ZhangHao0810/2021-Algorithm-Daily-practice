package CompositePattern.src.demo1;

public class client {

    public client() {
    }
    public static void main(String[] args) {
        Leaf leaf1=new Leaf();
        Leaf leaf2=new Leaf();
        Leaf leaf3=new Leaf();

        Composite composite=new Composite();
        composite.add(leaf1);

        Composite composite1=new Composite();
        composite1.add(leaf2);

        composite.add(composite1);

        Composite composite2=new Composite();
        composite2.add(leaf3);

        composite1.add(composite2);

        composite.sampleOperation();
        client client1 = new client();
    }
}