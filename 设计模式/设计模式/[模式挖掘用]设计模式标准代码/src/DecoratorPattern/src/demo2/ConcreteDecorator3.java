package DecoratorPattern.src.demo2;

public class ConcreteDecorator3 extends Decorator
{
    public ConcreteDecorator3(Component component)
    {
        super(component);
    }
    public void sampleOperation()
    {
        super.sampleOperation();
        System.out.println("Hi I am ConcreteDecorator 3, I will add function 3");
    }
}
