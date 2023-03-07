package ChainOfResponsiblityPattern.src.demo2;

public class Client
{
    /**
     * @directed
     */
    static private Handler handler1, handler2,handler3,handler4;

    public static void main(String[] args)
    {
    	handler1 = new SaftyHandler();
    	handler2 = new EncodeHandler();
    	handler3 = new DataHandler();
        handler4 = new LogHandler();


        //��ʼ������������˳��
        handler1.addHandler(handler2);
        handler2.addHandler(handler3);
        handler3.addHandler(handler4);

        //��ʼ����
        handler1.handleRequest();
    }
}
