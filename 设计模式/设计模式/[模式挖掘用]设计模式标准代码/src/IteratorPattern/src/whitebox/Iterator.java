package IteratorPattern.src.whitebox;

public interface Iterator
{
    void first();

    void next();

    boolean isLast();

    Object currentItem();
}
