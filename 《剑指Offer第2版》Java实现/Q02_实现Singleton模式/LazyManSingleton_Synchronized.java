package Q02_实现Singleton模式;

/**
 * @author ZhangHao
 * @date 2020/2/16 11:18
 * @Description： 线程安全的 懒汉模式
 *  即 在懒汉式的基础上, 把对外公开的 getInstance()方法 添加上 synchronized 关键字.
 *
 *  缺点: 对整个方法加锁, 效率很低, 因为大多数情况下不需要同步.
 *      如果不是第一次创建对象, 是直接获取对象的,不会进入if语句..
 */
public class LazyManSingleton_Synchronized {

    private static LazyManSingleton_Synchronized instance;

    private LazyManSingleton_Synchronized(){}

    public static synchronized LazyManSingleton_Synchronized getInstance(){
        if (instance == null){
            instance = new LazyManSingleton_Synchronized();
        }
        return instance;
    }


}
