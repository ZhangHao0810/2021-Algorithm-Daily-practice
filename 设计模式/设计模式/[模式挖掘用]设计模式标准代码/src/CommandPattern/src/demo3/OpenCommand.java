package CommandPattern.src.demo3;

public class OpenCommand implements Command
{
     public void execute()
     {
	  System.out.print("System requested for document...");
	  System.out.println("user enters name of document");
      System.out.println("System has opened document. \n");
     }
}

