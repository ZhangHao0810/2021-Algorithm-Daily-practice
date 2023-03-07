/**
 * @author ZhangHao
 * @date 2019/11/20 14:52
 * @Description： 具体的工厂类
 */
public class ConcreteFactory1 extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
