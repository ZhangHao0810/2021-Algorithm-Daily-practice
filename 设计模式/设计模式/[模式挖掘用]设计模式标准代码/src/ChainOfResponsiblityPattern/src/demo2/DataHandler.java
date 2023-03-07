package ChainOfResponsiblityPattern.src.demo2;

public class DataHandler extends Handler
{
    public void handleRequest()
    {
        if (this.getHandler()!= null){
            System.out.println("The request is passed to " + getHandler());
            getHandler().handleRequest();
        }else{
            System.out.println("�ҵĹ������ǽ������ݵ�У�飬�����Ѿ�ͨ��");
        }
    }
}
