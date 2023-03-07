/**
 * @author ZhangHao
 * @date 2019/11/20 15:21
 * @Description： 具体的工厂类2
 */
public class ConcreteFactory2 extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
