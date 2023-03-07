package DecoratorPattern.src.demo2;

public class ConcreteDecorator2 extends Decorator
{
    public ConcreteDecorator2(Component component)
    {
        super(component);
    }
    public void sampleOperation()
    {
        super.sampleOperation();
        System.out.println("Hi I am ConcreteDecorator 2, I will add function 2");
    }
}
