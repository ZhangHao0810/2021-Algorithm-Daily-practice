package Q02_实现Singleton模式;

import java.io.Serializable;

/**
 * @author ZhangHao
 * @date 2020/2/16 12:03
 * @Description： 最安全的 双重校验锁, 适合在 序列化的时候使用.
 *  在 volatile的双重校验锁的基础上,
 *  实现 Serializable 实现序列化,然后 定义一个   private  Object readResolve(). 即可实现在 序列化 时的单例模式.
 *
 *  序列化可以破坏单例。
 *  要想防止序列化对单例的破坏，只要在Singleton类中定义readResolve就可以解决该问题：
 */
public class VolatileSingleton_Serializable implements Serializable {
    private volatile static VolatileSingleton_Serializable singleton;
    private VolatileSingleton_Serializable(){}
    public static VolatileSingleton_Serializable getSingleton(){
        if (singleton == null){
            synchronized (VolatileSingleton_Serializable.class){
                if (singleton == null){
                    singleton = new VolatileSingleton_Serializable();
                }
            }
        }
        return singleton;
    }

    private  Object readResolve(){
        return singleton;
    }


}
