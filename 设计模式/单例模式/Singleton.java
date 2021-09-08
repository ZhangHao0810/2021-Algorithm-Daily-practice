/**
 * @author Super-Zhang
 * @date 2021-09-03 11:00
 */
public class Singleton {

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