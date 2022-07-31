package 结构型模式.装饰器模式.MyDemo.coffee;


import 结构型模式.装饰器模式.MyDemo.component.Drink;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:13
 * @Description： 表示咖啡单品类, 是Drink 咖啡单品分支的中间层,提取了Coffee类共有的特征. 获得价格调用Drink的cost方法.
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
