package ProxyPattern.src.demo1;

public class Client
{
  	private static Subject subject;

    static public void main(String[] args)
	{
		subject = new ProxySubject();
		subject.request();
	}
}
