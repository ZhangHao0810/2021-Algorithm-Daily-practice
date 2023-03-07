package CommandPattern.src.demo4;

public class OffCommand implements Command
{
	private Tv myTv;

	public OffCommand (Tv tv)
    {
		myTv  =  tv;
	}
	public void execute()
    {
		myTv.turnOff();
	}
}
