package CompositePattern.src.demo1;

import java.util.Vector;
import java.util.Enumeration;

public class Composite implements Component
{
     public void sampleOperation()
    {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements())
        {
            ((Component)enumeration.nextElement()).sampleOperation();
        }
    }

    public void add(Component component)
    {
        componentVector.addElement(component);
    }

    public void remove(Component component)
    {
        componentVector.removeElement(component);
    }

    public Enumeration components()
    {
        return componentVector.elements();
    }

    /**
     * @associates <{Component}>
     * @link aggregation
     * @supplierCardinality 0..*
     */
    private Vector componentVector = new Vector();
}
