package 结构型模式.装饰器模式.MyDemo.component;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:06
 * @Description： 超类,抽象类,他的实现类分为两个分支 1.咖啡单品(主体) 2. 调料(装饰者)
 *
 * protected 继承的可以访问,其他类不能访问. 与之相对的是 private 继承的也不能访问.都不能访问.
 */
public abstract class Drink {

    /**
     * @Description: 设置默认Drink的描述和价格
    */
    private String description="";
    private float price=0f;

    public String getDescription() {
        return description+"["+this.getPrice()+"$]";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @author Zhanghao
     * @date 2019/11/3 10:11
     * @return float
     * @Description:  花销因为使用的调料不同,价格不同,可能只有一个主体,可以能有多个装饰者装饰的主体.递归调用计算价格.
    */
    public abstract float cost();
}
