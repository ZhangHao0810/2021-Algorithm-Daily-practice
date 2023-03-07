package CommandPattern.src.demo3;
public class PasteCommand implements Command
{

     public void execute()
     {
          System.out.println("Selected document has been pasted. \n");
     }
}

