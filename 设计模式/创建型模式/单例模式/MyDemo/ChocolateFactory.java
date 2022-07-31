package 创建型模式.单例模式.MyDemo;

/**
 * @author ZhangHao
 * @date 2019/11/7 9:27
 * @Description： 巧克力工厂实例
 * <p>
 * 一个巧克力工厂,只能有一个巧克力工厂对象.
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;

//    private static ChocolateFactory uniqeInstance = null;
    /** 2019/11/11 20:07
     * '急切' 创建对象. 一开始运行就直接创建对象.
     * 这种方式会浪费内存资源,因为可能这里new的对象在项目中都不会使用到.
     */
//    private static ChocolateFactory uniqeInstance = new ChocolateFactory();

    /**
     * 2019/11/11 20:13
     * 双重检查加锁法要用到 volatile 这个是对编译器的一个东西,用于多线程安全.
     */
    private static volatile ChocolateFactory uniqeInstance = null;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    /** 2019/11/11 20:12
     * 普通加锁法
     */
//    public static synchronized ChocolateFactory getInstance() {
//        if (uniqeInstance == null) {
//            uniqeInstance = new ChocolateFactory();
//        }
//        return uniqeInstance;
//    }

    /**
     * 2019/11/11 20:12
     * 双重检查加锁法,给创建对象的那个if语句进行加锁.保证了不创建无用对象,也不过多因为synchronized浪费资源.
     */
    public static synchronized ChocolateFactory getInstance() {
        if (uniqeInstance == null) {
            synchronized (ChocolateFactory.class) {
                if (uniqeInstance == null) {
                    uniqeInstance = new ChocolateFactory();
                }
            }
        }
        return uniqeInstance;
    }

    /**
     * 2019/11/7 9:28
     * 往锅炉里面加东西 添加原材料.
     */
    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
        }
    }

    /**
     * 2019/11/11 19:56
     * 加热.
     */
    public void boil() {
        if ((!empty) && (!boiled)) {
            boiled = true;
        }
    }

    /**
     * 2019/11/11 19:56
     * 倾倒
     */
    public void drain() {
        if ((!empty) && boiled) {
            empty = true;
        }
    }

}
