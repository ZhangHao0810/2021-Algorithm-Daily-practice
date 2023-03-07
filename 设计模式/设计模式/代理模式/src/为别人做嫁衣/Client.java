package 为别人做嫁衣;

/**
 * @author ZhangHao
 * @date 2019/11/19 14:49
 * @Description： 客户端
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl yuexiaochao=new SchoolGirl();
        yuexiaochao.setName("岳小超");

        Proxy i = new Proxy(yuexiaochao);

        i.giveChocolate();
        i.giveDolls();
        i.giveFlowers();
    }
}
