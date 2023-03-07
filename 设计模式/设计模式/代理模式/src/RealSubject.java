/**
 * @author ZhangHao
 * @date 2019/11/19 15:00
 * @Description： 定义了Proxy所代表的真实实体
 */
public class RealSubject implements Subject {


    @Override
    public void Request() {
        System.out.println("真实的请求!");
    }
}
