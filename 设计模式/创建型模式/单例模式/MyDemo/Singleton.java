package 创建型模式.单例模式.MyDemo;

/**
 * @author ZhangHao
 * @date 2019/11/7 9:22
 * @Description： 经典的单例模式(懒汉式）. 构造函数私有,杜绝了外界构造本类函数.
 */
public class Singleton {

    private static Singleton uniqeInstance=null;

    private Singleton(){

    }

    /** 2019/11/7 9:26
     * 保证Singleton类只有一个对象
     */
    public static Singleton getInstance(){
        if (uniqeInstance == null) {
            uniqeInstance=new Singleton();
        }
        return uniqeInstance;
    }

}

/**
 * =================线程不安全的：====================
 */

//类一加载就饥渴地new好。
class Singleton_饿汉式{

    private static  Singleton_饿汉式 instance = new Singleton_饿汉式();

    //构造方法私有！
    private Singleton_饿汉式(){}

    //开放属性getter
    public static Singleton_饿汉式 getInstance(){
        return instance;
    }
}

//懒得去new，用到了再new
class Singleton_懒汉式{

    private static Singleton_懒汉式 instance = null;

    private Singleton_懒汉式(){}

    public static Singleton_懒汉式 getInstance(){
        if (instance==null){
            instance=new Singleton_懒汉式();
        }
        return instance;
    }

}

/**
 * ====================线程安全的==========================
 **/

//最好记的就是 在懒汉的基础上，方法加 synchronized
class Singleton_懒汉安全型{
    private static Singleton_懒汉安全型 instance = null;

    private Singleton_懒汉安全型(){}

    synchronized public static Singleton_懒汉安全型 getInstance(){
        if (instance==null){
            instance = new Singleton_懒汉安全型();
        }
        return instance;
    }
}

class Singleton_双重校验加锁法{
    private volatile static Singleton_双重校验加锁法 instance =null;

    private Singleton_双重校验加锁法(){}

    public static Singleton_双重校验加锁法 getInstance(){
        if (instance == null) {
            synchronized (Singleton_双重校验加锁法.class){
                instance = new Singleton_双重校验加锁法();
            }
        }
        return instance;
    }
}