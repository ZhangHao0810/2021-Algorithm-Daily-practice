package 策略与简单工厂结合;

import 简单工厂实现超市收银.CashNormal;
import 简单工厂实现超市收银.CashRebate;
import 简单工厂实现超市收银.CashReturn;
import 简单工厂实现超市收银.CashSuper;

/**
 * @author ZhangHao
 * @date 2019/11/17 20:57
 * @Description： 改造后的CashContext  创建CashContext对象的同时,创建算法对象,将创建对象的过程从客户端解耦.
 */
public class CashContext {
    CashSuper cash;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cash = new CashNormal();
                break;
            case "满300返100":
                cash = new CashReturn(300, 100);
                break;
            case "打8折":
                cash = new CashRebate(0.8);
                break;
            default:
                cash = new CashNormal();
                break;
        }
    }

    public double GetResult(double money) {
        return cash.acceptCash(money);
    }
}
