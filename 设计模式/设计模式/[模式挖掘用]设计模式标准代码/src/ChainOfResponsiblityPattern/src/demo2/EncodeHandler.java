package ChainOfResponsiblityPattern.src.demo2;

public class EncodeHandler extends Handler
{
    public void handleRequest()
    {
        if (this.getHandler()!= null){
            System.out.println("The request is passed to " + getHandler());
            getHandler().handleRequest();
        }else{
            System.out.println("�ҵĹ������ǽ������ݵı��룬�����Ѿ�ͨ��");
        }
    }
}
