package PrototypePattern.src.demo1;

public class ConcretePrototype implements Prototype
{
    public ConcretePrototype(){

    }
    public Object clone()
    {
        try
        {
	        return super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            //write your code here
            return null;
        }
    }
}
