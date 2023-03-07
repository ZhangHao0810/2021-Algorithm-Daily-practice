package StrategyPattern.src.demo1;

public class Context
{
    public void contextInterface()
    {
        strategy.strategyInterface();
    }
    private Strategy strategy;

    public  Context (Strategy strategy){
        this.strategy =strategy;
    }
}
