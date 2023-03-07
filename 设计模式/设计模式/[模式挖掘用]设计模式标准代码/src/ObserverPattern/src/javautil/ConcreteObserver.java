package ObserverPattern.src.javautil;

import java.util.Observer;
import java.util.Observable;

public class ConcreteObserver implements Observer
{
    private String name=null;
    public void update(Observable obj,Object arg){
        if (arg instanceof String){
            name=(String)arg;
            //��Ʒ���Ƹı�ֵ��name��
            System.out.println("NameObserver :name changet to "+name);
        }
    }
}