package ObserverPattern.src.demo2;

import java.util.Vector;
import java.util.Enumeration;

public class ConcreteSubject implements Subject
{
    private Vector observersVector = new Vector();

    public void attach(Listener observer)
    {
        observersVector.addElement(observer);
    }

    public void detach(Listener observer)
    {
        observersVector.removeElement(observer);
    }

    public void notifyObservers(Event event)
    {
		Enumeration enumeration = observers();
		while (enumeration.hasMoreElements())
        {
			((Listener)enumeration.nextElement()).update(event);
		}
	}

    public Enumeration observers()
    {
        return ((Vector) observersVector.clone()).elements();
    }

}
