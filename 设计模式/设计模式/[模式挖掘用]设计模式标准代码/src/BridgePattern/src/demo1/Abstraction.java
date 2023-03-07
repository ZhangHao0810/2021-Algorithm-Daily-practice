package BridgePattern.src.demo1;

abstract public class Abstraction
{
    public void operation()
    {
    	imp.operationImp();
    }

    /**
     * @link aggregation
     * @directed
     * @supplierRole impl*/
    private Implementor imp;

    /**
     * ����һ��ʹ�ù���ģʽ��ȡ��һ��ʵ�ֵ�ʵ��
     */
    public Abstraction(){
        imp= new ConcreteImplementorA();
    }
}
