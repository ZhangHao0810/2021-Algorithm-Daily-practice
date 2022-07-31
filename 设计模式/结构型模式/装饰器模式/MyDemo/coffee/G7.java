package 结构型模式.装饰器模式.MyDemo.coffee;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:16
 * @Description： G7 咖啡单品
 * 这里的两个Setter 是继承自Drink抽象类的. G7的实例也是Drink的实例.
 */
public class G7 extends Coffee {
    public G7(){
//        设置G7这个Drink的描述和价格.
        super.setDescription("G7");
        super.setPrice(39.9f);
    }
}
