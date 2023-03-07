package 简单工厂实现超市收银;

import 简单工厂实现超市收银.Factory.CashFactory;

import java.util.Scanner;

/**
 * @author ZhangHao
 * @date 2019/11/17 17:32
 * @Description： 客户端 (自编)
 *      输入单价,数量,折扣的方式(格式定义在工厂类中.) 得到最终的价格.
 *
 *      客户端操作:接口以及工厂类.工厂类负责创建合适的对象,接口负责接住这些不同的子类对象.调用接口的方法即可运行.解耦了通过不同的条件创建子类对象的功能.自动创建对象.所以简单工厂模式的工厂类是精髓.
 *
 *      没用策略模式的代码,客户端会有算法类(CashSuper是算法的父类.)
 *
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("请输入折扣方式:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        CashSuper cashSuper = CashFactory.createCashAccept(str);

        double totalPrices;
        System.out.println("输入单价:");
        double price=scanner.nextDouble();
        System.out.println("输入数量:");
        double num=scanner.nextDouble();
        totalPrices = cashSuper.acceptCash(price * num);

        System.out.println("单价:" + price + "  数量:" + num + "  折扣方式:"+str+"  最终价格:" + totalPrices);
    }
}
