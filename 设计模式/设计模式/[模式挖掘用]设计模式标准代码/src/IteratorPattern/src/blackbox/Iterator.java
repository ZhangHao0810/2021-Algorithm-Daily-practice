package IteratorPattern.src.blackbox;

public interface Iterator
{
    void first();

    void next();

    boolean isLast();

    Object currentItem();
}
