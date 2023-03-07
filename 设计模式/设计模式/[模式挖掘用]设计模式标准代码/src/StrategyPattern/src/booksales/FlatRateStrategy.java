package StrategyPattern.src.booksales;

public class FlatRateStrategy extends DiscountStrategy
{

    public double calculateDiscount(int price)
    {
		return price-10;
    }
}