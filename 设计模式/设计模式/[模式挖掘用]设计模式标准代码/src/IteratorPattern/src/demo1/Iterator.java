package IteratorPattern.src.demo1;

public interface Iterator
{
	void first();
	void next();
	boolean isDone();
	Object currentItem();
}