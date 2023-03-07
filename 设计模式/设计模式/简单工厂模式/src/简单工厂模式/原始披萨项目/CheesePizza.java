package 简单工厂模式.原始披萨项目;

/**
 * @author ZhangHao
 * @date 2019/11/11 21:07
 * @Description：
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("CheesePizza");

        System.out.println(name+"preparing");
    }
}
