package ObserverPattern.src.demo1;

import java.util.Vector;
import java.util.Enumeration;

public class ConcreteSubject implements Subject
{
    public void attach(Observer observer)
    {
        observersVector.addElement(observer);
    }

    public void detach(Observer observer)
    {
        observersVector.removeElement(observer);
    }

    public void notifyObservers()
    {
		Enumeration enumeration = observers();
		while (enumeration.hasMoreElements())
        {
			((Observer)enumeration.nextElement()).update();
		}
	}

    public Enumeration observers()
    {
        return ((Vector) observersVector.clone()).elements();
    }
    private Vector observersVector = new Vector();
}
