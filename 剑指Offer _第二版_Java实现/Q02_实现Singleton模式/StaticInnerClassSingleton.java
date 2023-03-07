package Q02_实现Singleton模式;

/**
 * @author ZhangHao
 * @date 2020/2/16 10:37
 * @Description： 静态内部类形式
 *
 * 这种方式和饿汉式很像,类被装载,不一定被初始化, lazy loading
 *  因为静态内部类SingletonHolder没有被主动的调用
 *      显式调用getInstance方法,
 *
 *
 *  看到的例子中,饿汉模式和静态内部类模式有点区别,就是用的修饰符
 *    static修饰的属性强调它们只有一个，
 *    final修饰的属性表明是一个常数（创建后不能被修改）。
 *    static final修饰的属性表示一旦给值，就不可修改，并且可以通过类名访问。
 *      static final也可以修饰方法，表示该方法不能重写，可以在不new对象的情况下调用。
 * */
public class StaticInnerClassSingleton {

    //    在静态内部类中初始化实例对象.
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static final StaticInnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }

}
