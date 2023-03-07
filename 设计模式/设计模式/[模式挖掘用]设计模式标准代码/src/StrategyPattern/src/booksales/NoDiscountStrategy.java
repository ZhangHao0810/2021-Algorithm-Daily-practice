package StrategyPattern.src.booksales;

public class NoDiscountStrategy extends DiscountStrategy
{
    public double calculateDiscount(int price)
    {
		return price*0.5;
    }
}
