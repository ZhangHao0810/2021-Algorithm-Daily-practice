package IteratorPattern.src.demo1;

public class ShoppingCartBack extends ShoppingCart
{
	public ShoppingCartBack(){}

	public Iterator createIterator()
	{
		return new IteratorBack(this);
	}
}