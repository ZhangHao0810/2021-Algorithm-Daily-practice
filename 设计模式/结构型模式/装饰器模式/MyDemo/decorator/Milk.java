package 结构型模式.装饰器模式.MyDemo.decorator;


import 结构型模式.装饰器模式.MyDemo.component.Drink;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:32
 * @Description： 牛奶调料,扩展自装饰者.
 */
public class Milk extends Decorator {
public Milk(Drink obj) {

        super(obj);
        super.setDescription("牛奶奶");
        super.setPrice(2.0f);
        }
        }
