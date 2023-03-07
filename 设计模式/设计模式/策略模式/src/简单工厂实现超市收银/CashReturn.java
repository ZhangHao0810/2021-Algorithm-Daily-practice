package 简单工厂实现超市收银;

/**
 * @author ZhangHao
 * @date 2019/11/17 17:20
 * @Description： 返利收费类   商品价格满返利条件减返利值.
 */
public class CashReturn implements CashSuper {

//    返利条件
    private  double moneyCondition=0.0d;
//    返利值
    private  double moneyReturn=0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result=money;

//        若大于返利条件,则需要减去返利值.
//        math.floor(x)返回小于参数x的最大整数,即对浮点数向下取整。x[]的取值。
        if(money>=moneyCondition){
            result=money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
