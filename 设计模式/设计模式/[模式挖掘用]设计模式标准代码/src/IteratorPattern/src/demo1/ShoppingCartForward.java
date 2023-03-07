
package IteratorPattern.src.demo1;

public class ShoppingCartForward extends ShoppingCart
{

	public ShoppingCartForward(){}

	public Iterator createIterator()
	{
		return new IteratorForward(this);
	}
}