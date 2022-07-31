package 结构型模式.装饰器模式.MyDemo.coffee;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:19
 * @Description： 雀巢咖啡单品
 */
public class Nescafe extends Coffee {
    public Nescafe(){
        super.setDescription("雀巢咖啡");
        super.setPrice(23.8f);
    }
}