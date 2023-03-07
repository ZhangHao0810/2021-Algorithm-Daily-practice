package 策略模式;

/**
 * @author ZhangHao
 * @date 2019/11/17 19:34
 * @Description： 客户端   只需要调用Context便可以进行不同的算法.将程序员和算法彻底隔离. 但是比较遗憾的是创建具体算法对象的过程需要在客户端来体现,
 */
public class Client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();


    }
}
