/**
 * @author ZhangHao
 * @date 2019/11/19 15:01
 * @Description： 保存一个引用, 使得代理可以访问实体, 并提供一个与Subject的接口相同的接口, 这样代理就可以用来代替实体.
 */
public class Proxy implements Subject {

    RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject=new RealSubject();
        }
        realSubject.Request();
    }
}
