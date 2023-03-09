package Q02_实现Singleton模式;

/**
 * @author ZhangHao
 * @date 2020/2/16 11:08
 * @Description： 懒汉模式----对象真正被使用的时候才会实例化的单例模式
 *
 *  和静态内部类相似.
 *      静态内部类形式是将 new 的过程写在内部类中.
 *      懒汉式把 new 放在公开的getInstance()里,用 if 判断是否已存在.
 *
 *  但是这个存在线程安全问题, 可能有两个线程进入if语句.
 */
public class LazyManSingleton {

    //定义 静态的(保证唯一),私有(保证隐藏) 的实例.
    private static LazyManSingleton instance;

    //私有构造
    private LazyManSingleton() {
    }

    //公开的获取实例的静态方法.
    public static LazyManSingleton getInstance() {
        //在对象被使用的时候才实例化
        if (instance == null) {
            instance = new LazyManSingleton();
        }
        return instance;
    }
}
