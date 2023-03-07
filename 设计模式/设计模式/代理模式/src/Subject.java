/**
 * @author ZhangHao
 * @date 2019/11/19 14:57
 * @Description： 定义了RealSubject和Proxy的共有接口, 这样就在任何使用RealSubject的地方都可以使用Proxy
 */
public interface Subject {
    void Request();
}
