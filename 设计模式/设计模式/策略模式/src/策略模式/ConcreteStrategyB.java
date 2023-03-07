package 策略模式;

/**
 * @author ZhangHao
 * @date 2019/11/17 19:31
 * @Description： 具体算法B
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法B实现");
    }
}
