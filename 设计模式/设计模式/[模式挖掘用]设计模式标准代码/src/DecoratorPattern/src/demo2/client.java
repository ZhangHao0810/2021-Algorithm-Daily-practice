package DecoratorPattern.src.demo2;

public class client {

    public client() {
    }
    public static void main(String[] args) {
        ConcreteComponent cCom=new ConcreteComponent();
        Component com=new ConcreteDecorator3( new ConcreteDecorator2(new ConcreteDecorator1(cCom)));
        com.sampleOperation();

        Component com1=new ConcreteDecorator1( new ConcreteDecorator2(new ConcreteDecorator3(cCom)));
        com1.sampleOperation();

    }
}