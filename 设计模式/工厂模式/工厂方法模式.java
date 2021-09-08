/**
 * @author Super-Zhang
 * @date 2021-09-03 11:14
 */
public class 工厂方法模式 {
}

interface Reader{
    void read();
}

class Reader1 implements Reader{
    @Override
    public void read() {
        System.out.println(1);
    }
}

class Reader2 implements Reader{
    @Override
    public void read() {
        System.out.println(2);
    }
}

class Reader3 implements Reader{
    @Override
    public void read() {
        System.out.println(3);
    }
}

/**
 * 从这里开始，就是工厂方法区别于简单工厂的开始。
 * 简单工厂只有一个统一的工厂类，而工厂方法是针对每个要创建的对象都会提供一个工厂类，这些工厂类都实现了一个工厂基类。
 */
interface ReaderFactory{
    Reader getReader();
}

class Reader1Factory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return  new Reader1();
    }
}

class Reader2Factory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return  new Reader2();
    }
}

class Reader3Factory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return  new Reader2();
    }
}