package ChainOfResponsiblityPattern.src.demo2;

public class SaftyHandler extends Handler
{
    public void handleRequest()
    {
        System.out.println("�ҵĹ������ǽ���Ȩ�޵�У�飬�����Ѿ�ͨ��");

        //����к����Ĵ�����̣�ת������һ��
        if (this.getHandler()!= null){
            getHandler().handleRequest();
        }
    }
}
