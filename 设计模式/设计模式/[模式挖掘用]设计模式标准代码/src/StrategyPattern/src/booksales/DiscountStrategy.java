package StrategyPattern.src.booksales;

abstract public class DiscountStrategy
{
    abstract public double calculateDiscount(int price);
}
