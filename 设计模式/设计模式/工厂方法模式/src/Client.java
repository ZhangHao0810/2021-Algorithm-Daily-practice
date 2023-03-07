/**
 * @author ZhangHao
 * @date 2019/11/20 14:54
 * @Description： 调用
 *      把对象的创建过程封装起来了,让工厂类来帮我创建对象,与简单工厂的区别是 工厂不再只是一个类,而是进一步抽象 有工厂接口,客户端调用工厂子类来产生客户想产生的 对象.
 */
public class Client {

    public static void main(String[] args) {
        //    抽象出来的工厂子类,完成一个具体的功能.传给工厂接口.
        Factory factory=new ConcreteFactory1();

//        接口中有方法,返回产品抽象类型的对象引用.赋值给产品接口.
        Product product = factory.createProduct();
        product.method1();
        product.method2();

    }


}
