package component;

/**
 * @author ZhangHao
 * @date 2019/11/4 8:43
 * @Description： 组合模式中的抽象类或者接口,
 */
public abstract class Organization {
    /**
     * 2019/11/4 8:47
     * 名字
     */
    private String name;
    /**
     * 2019/11/4 8:47
     * 描述
     */
    private String des;

    /** 2019/11/4 8:56
     * 构造器
    */
    public Organization(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public void add(Organization organization) {
//        默认实现,抛出一个不支持操作的异常,(因为有叶子结点,不必须重写这个add方法)
        throw new UnsupportedOperationException();
    }

    public void remove(Organization organization) {
//        默认实现
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /** 2019/11/4 8:49
     * 提供给子类实现的方法.
    */
    public abstract void print();
}
