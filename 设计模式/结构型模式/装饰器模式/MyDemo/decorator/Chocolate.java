package 结构型模式.装饰器模式.MyDemo.decorator;


import 结构型模式.装饰器模式.MyDemo.component.Drink;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:31
 * @Description： 巧克力调料,扩展自装饰者.
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("巧克力");
        super.setPrice(3.0f);
    }
}
