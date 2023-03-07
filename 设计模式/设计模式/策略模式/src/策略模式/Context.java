package 策略模式;

/**
 * @author ZhangHao
 * @date 2019/11/17 19:32
 * @Description： 用一个ConcreteStrategy(Strategy的子类)来创建Context对象, 维护对Strategy对象的引用
 */
public class Context {
    Strategy strategy;

    /** 2019/11/17 19:34
     * 初始化时传入具体的策略对象.
    */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    /** 2019/11/17 19:33
     * 上下文接口,根据具体的策略对象,调用其算法的方法.
    */
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
