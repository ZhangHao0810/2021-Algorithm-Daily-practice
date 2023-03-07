package 简单工厂模式.原始披萨项目;

/**
 * @author ZhangHao
 * @date 2019/11/11 20:53
 * @Description：
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("PepperPizza");

        System.out.println(name+"preparing");
    }
}
