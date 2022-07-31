package 结构型模式.装饰器模式.MyDemo.decorator;


import 结构型模式.装饰器模式.MyDemo.component.Drink;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:21
 * @Description： 装饰者类
 *      装饰者分支的中间层 是装饰者共性的提取.   扩展自 Drink ,
 *    内含Drink对象,因为装饰者对象可以是单品,也可以是被包装过的单品. 所以内含超类的类型.
 */
public class Decorator extends Drink {

    private Drink obj;

//    传进来一个Drink类对象,他可以是一个装饰者或者是单体.
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    /**
     * @author Zhanghao
     * @date 2019/11/3 10:25
     * 
     * @param 	
     * @return float
     * @Description: 实现功能与单品不同,要获得调料的价格 super.getPrice() 和被包装的主体的价格 obj.cost()
     *                      obj 这里的obj可能也是一个装饰者,调用cost 会形成递归,一层一层夹起来,形成最后的价格.
    */
    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , "+obj.getDescription();
    }
}
