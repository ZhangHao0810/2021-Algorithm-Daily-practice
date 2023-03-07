package StrategyPattern.src.booksales;

public class Context {

    public void contextDisCount(int price)
    {
        strategy.calculateDiscount(price);
    }
    public void setStrategy(DiscountStrategy strategy)
    {
        this.strategy =strategy;
    }
    private DiscountStrategy strategy;

    public  Context (DiscountStrategy strategy){
        this.strategy =strategy;
    }
}