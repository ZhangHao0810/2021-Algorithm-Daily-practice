package 简单工厂实现超市收银.Factory;

import 简单工厂实现超市收银.CashNormal;
import 简单工厂实现超市收银.CashRebate;
import 简单工厂实现超市收银.CashReturn;
import 简单工厂实现超市收银.CashSuper;

/**
 * @author ZhangHao
 * @date 2019/11/17 17:26
 * @Description： 现金收费工厂类
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cash = null;
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
        return cash;
    }
}
