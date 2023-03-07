package 策略模式实现的超市收银;

import 简单工厂实现超市收银.CashSuper;

/**
 * @author ZhangHao
 * @date 2019/11/17 20:43
 * @Description： 用来管理Strategy引用的类  用一个ConcreteStrategy来配置, 维护对Strategy对象的引用
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double GetResult(double money) {
        return cs.acceptCash(money);
    }
}
