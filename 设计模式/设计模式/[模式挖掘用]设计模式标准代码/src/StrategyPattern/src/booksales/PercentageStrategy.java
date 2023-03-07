package StrategyPattern.src.booksales;

public class PercentageStrategy extends DiscountStrategy
{


    public double calculateDiscount(int price)
    {
		return price*1/2;
    }

}
