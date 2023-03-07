package 策略模式实现的超市收银;

import 简单工厂实现超市收银.CashNormal;
import 简单工厂实现超市收银.CashRebate;
import 简单工厂实现超市收银.CashReturn;

import java.util.Scanner;

/**
 * @author ZhangHao
 * @date 2019/11/17 20:45
 * @Description： 纯策略模式的客户端
 *                  通过一个中间类 CashContext 解耦了算法.只需要操作一个CashContext便可以操作全部的算法.每个算法都有自己的类.相比简单工厂,客户端没有了算法的任何对象.由Context对象来代替.
 *                   但是创建不同算法对象的过程还是要在客户端体现.
 *                   需要在客户端去判断用哪一个算法.
 *                   不是很完美.
 */
public class Client {

    public static void main(String[] args) {
        CashContext cc = null;

        System.out.println("请输入折扣方式:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        switch (str) {
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "满300返100":
                cc = new CashContext(new CashReturn(300, 100));
                break;
            case "打8折":
                cc = new CashContext(new CashRebate(0.8));
                break;
            default:
                cc = new CashContext(new CashNormal());
                break;
        }

        System.out.println("输入单价:");
        double price = scanner.nextDouble();
        System.out.println("输入数量:");
        double num = scanner.nextDouble();

        double totalPrice = cc.GetResult(price * num);

        System.out.println("单价:" + price + "  数量:" + num + "  折扣方式:" + str + "  最终价格:" + totalPrice);

    }

}
