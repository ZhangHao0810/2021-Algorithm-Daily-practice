package 简单工厂实现超市收银;

/**
 * @author ZhangHao
 * @date 2019/11/17 17:11
 * @Description： 打折收费类
 */
public class CashRebate implements CashSuper{

    private double moneRebate=1d;

    public CashRebate(double moneRebate) {
        this.moneRebate = moneRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneRebate;
    }
}
