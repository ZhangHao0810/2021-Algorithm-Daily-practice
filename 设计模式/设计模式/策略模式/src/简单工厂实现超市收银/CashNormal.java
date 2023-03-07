package 简单工厂实现超市收银;

/**
 * @author ZhangHao
 * @date 2019/11/17 17:10
 * @Description： 正常收费类(只实现了接口中的方法,现实中可以自己再定义别的方法,这样不同的算法类便有了不同的算法功能.将算法从客户端解耦.)
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
