package ChainOfResponsiblityPattern.src.demo1;

public class Client
{
    /**
     * @directed
     */
    static private Handler handler1, handler2,handler3;

    public static void main(String[] args)
    {
    	handler1 = new ConcreteHandler();
    	handler2 = new ConcreteHandler();
    	handler3 = new ConcreteHandler();

        //��ʼ������������˳��
        handler1.addHandler(handler2);
        handler2.addHandler(handler3);

        //��ʼ����
        handler1.handleRequest();
    }
}
