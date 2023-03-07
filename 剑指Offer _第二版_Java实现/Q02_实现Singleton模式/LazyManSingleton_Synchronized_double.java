package Q02_实现Singleton模式;

/**
 * @author ZhangHao
 * @date 2020/2/16 11:31
 * @Description： 加了 双重校验锁 的 懒汉模式 不完美.
 *
 *  使用synchronized 关键字的 双重校验锁.
 *
 *  优点: 缩小了同步代码块的范围.检验了两次 singleton对象是否创建.
 *
 *  缺点: 因为JVM的缘故, 会造成严重的危害,并难以重现异常.
 *  解决: 在 1.5 之后,使用Volatile
 */
public class LazyManSingleton_Synchronized_double {

    private static LazyManSingleton_Synchronized_double singleton;

    private LazyManSingleton_Synchronized_double(){
    }

    public static LazyManSingleton_Synchronized_double getSingleton(){
//        第一次检查实例是否已创建. 不加锁,提高效率.
        if (singleton == null){
//            将该类加锁
            synchronized (LazyManSingleton_Synchronized_double.class){
//                在锁中 第二次检查实例是否已被创建.
                if (singleton == null){
                    singleton = new LazyManSingleton_Synchronized_double();
                }
            }
        }
        return singleton;
    }
}
