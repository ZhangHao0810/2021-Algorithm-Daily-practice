package ChainOfResponsiblityPattern.src.demo1;

public class ConcreteHandler extends Handler
{
    public void handleRequest()
    {
        if (this.getHandler()!= null){
            System.out.println("The request is passed to " + getHandler());
            getHandler().handleRequest();
        }else{
            System.out.println("I am handle,i do request");
        }
    }
}
