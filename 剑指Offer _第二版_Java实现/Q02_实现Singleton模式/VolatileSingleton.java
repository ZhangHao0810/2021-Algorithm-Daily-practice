package Q02_实现Singleton模式;

/**
 * @author ZhangHao
 * @date 2020/2/16 11:53
 * @Description： 双重校验锁. 这种方式最好,用的最广..
 *
 *     用 volatile关键字 修饰对象.
 *
 *  也可能出现问题,就是遇到序列化的时候. 序列化可以破坏单例.
 *
 *  解决方式: 在Singleton类中定义 readResolve .
 */
public class VolatileSingleton {
    private static volatile VolatileSingleton singleton;

    private VolatileSingleton(){
    }

    public static VolatileSingleton getSingleton(){
        if (singleton == null){
            synchronized (VolatileSingleton.class){
                if (singleton ==null){
                    singleton = new VolatileSingleton();
                }
            }
        }
        return singleton;
    }
}
