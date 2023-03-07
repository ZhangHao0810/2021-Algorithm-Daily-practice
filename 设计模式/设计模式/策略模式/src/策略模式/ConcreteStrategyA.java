package 策略模式;

/**
 * @author ZhangHao
 * @date 2019/11/17 17:53
 * @Description： 封装了具体的算法或行为, 继承于Strategy
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}


