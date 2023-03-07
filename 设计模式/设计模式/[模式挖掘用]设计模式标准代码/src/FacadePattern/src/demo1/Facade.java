package FacadePattern.src.demo1;

public class Facade
{

	public Facade()
	{
	}

	public void ProcessTitle()
	{

		StringOutput str = new StringOutput();
		LineOutput line = new LineOutput();
		SignalOutput sig = new SignalOutput();

		line.doubleLine();
		sig.sigRectangle();
		str.StringOut("something here");

	}
}


