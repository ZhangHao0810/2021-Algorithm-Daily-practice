package 策略与简单工厂结合;

import java.util.Scanner;

/**
 * @author ZhangHao
 * @date 2019/11/17 21:00
 * @Description： 客户端代码
 *  通过结合策略模式和简单工厂模式(即Context除了整合了算法,还承接了创建对象的任务.),
 *  客户端实例化的是CashContext对象,调用的是CashContext的GetResult方法,
 *  使得具体的收费算法彻底与客户端分离.连算法的父类CashSuper都不认识了.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("请输入折扣方式:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        CashContext csuper = new CashContext(str);

        System.out.println("输入单价:");
        double price=scanner.nextDouble();
        System.out.println("输入数量:");
        double num=scanner.nextDouble();

        double totalPrice = csuper.GetResult(price * num);

        System.out.println("单价:" + price + "  数量:" + num + "  折扣方式:"+str+"  最终价格:" + totalPrice);

    }

}
