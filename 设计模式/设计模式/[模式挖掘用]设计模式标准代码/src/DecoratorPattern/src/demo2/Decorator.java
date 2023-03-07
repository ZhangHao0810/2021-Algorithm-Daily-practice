package DecoratorPattern.src.demo2;

public class Decorator implements Component
{
	public Decorator(Component component)
    {
        this.component = component;
    }

    public Decorator() {
    }

    public void sampleOperation()
    {
        component.sampleOperation();
    }

    /**
     * @link aggregation
     */
    private Component component;
}
