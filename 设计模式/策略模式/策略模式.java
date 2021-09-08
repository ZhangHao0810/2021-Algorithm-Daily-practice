/**
 * @author Super-Zhang
 * @date 2021-09-03 11:24
 *
 * 多个类只是在算法或行为上稍有不同的场景。
 * 算法需要自由切换的场景。
 * 需要屏蔽算法规则的场景
 */
public class 策略模式 {
}

abstract class Strategy {
    public abstract void strategyInterface();
}

// 具体策略
class ConcreteStrategy extends Strategy {
    public void strategyInterface() {
        System.out.println();
    }
}

// 承上启下。用它来调用抽象类的实现类。高层不访问具体策略，而是通过Context来访问。
class Context {
    private Strategy strategy = null;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void contextInterface() {
        this.strategy.strategyInterface();
    }
}