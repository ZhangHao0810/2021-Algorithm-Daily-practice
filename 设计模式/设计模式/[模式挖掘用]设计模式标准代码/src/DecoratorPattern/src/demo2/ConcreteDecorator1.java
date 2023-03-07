package DecoratorPattern.src.demo2;

public class ConcreteDecorator1 extends Decorator
{
    public ConcreteDecorator1(Component component)
    {
        super(component);
    }
    public void sampleOperation()
    {
        super.sampleOperation();
        System.out.println("Hi I am ConcreteDecorator 1, I will add function 1");
    }
}
