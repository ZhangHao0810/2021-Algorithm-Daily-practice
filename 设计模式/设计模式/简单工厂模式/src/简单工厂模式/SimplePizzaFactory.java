package 简单工厂模式;

import 简单工厂模式.原始披萨项目.CheesePizza;
import 简单工厂模式.原始披萨项目.PepperPizza;
import 简单工厂模式.原始披萨项目.Pizza;

/**
 * @author ZhangHao
 * @date 2019/11/11 21:14
 * @Description： 简单工厂模式:定义了一个创建对象的类,由这个类来封装'创建对象'的行为.
 */
public class SimplePizzaFactory {
    public Pizza CreatrPizza(String ordertype){
        Pizza pizza=null;

        if (ordertype.equals("cheese")) {
            pizza=new CheesePizza();
        }else if (ordertype.equals("pepper")){
            pizza=new PepperPizza();
        }
        return pizza;
    }
}
