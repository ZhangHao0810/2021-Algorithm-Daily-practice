package 结构型模式.装饰器模式.MyDemo.coffeebar;

import 结构型模式.装饰器模式.MyDemo.decorator.Chocolate;
import 结构型模式.装饰器模式.MyDemo.decorator.Milk;
import 结构型模式.装饰器模式.MyDemo.coffee.G7;
import 结构型模式.装饰器模式.MyDemo.coffee.Nescafe;
import 结构型模式.装饰器模式.MyDemo.component.Drink;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:35
 * @Description： 装饰者模式具体的事例
 * <p>
 * 其实每一个咖啡单品和装饰者都代表一个Drink,他们都是Drink的实例.
 */
public class CoffeeBar {

    public static void main(String[] args) {
        Drink order;
        order = new G7();
//        下方调用了order的cost方法,其实是G7的cost方法,G7的这个方法继承自Drink的cost方法.
        System.out.println("Order1 Price :" + order.cost());
        System.out.println("Order1 Desc :" + order.getDescription());

        System.out.println("*********************************");

        order = new Nescafe();
//        order = new Milk(new G7());//这里如果向装饰者中传入一个单体对象,返回的就是G7单体的实例.这样order就不再指向雀巢咖啡实例,上面那一行代码无效
//        下面是装饰者的精髓,将含有主体的抽象类对象传入一个装饰者,返回给该抽象类对象,给主体包装一层装饰.调用抽象类对象的时候,得先走一遍装饰者.
        order = new Milk(order);
//        将装饰者引用传入装饰者
        order = new Chocolate(order);
        order = new Chocolate(order);
//        当Drink引用调用Drink方法的时候,开始迭代一个个装饰者,最终到主体,全部return
        System.out.println("order2 Price :" + order.cost());
        System.out.println("order2 Desc :" + order.getDescription());

    }
}
