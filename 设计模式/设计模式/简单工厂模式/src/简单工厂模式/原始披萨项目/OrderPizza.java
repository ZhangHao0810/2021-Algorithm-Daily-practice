package 简单工厂模式.原始披萨项目;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ZhangHao
 * @date 2019/11/11 21:03
 * @Description： 用户订单类,循环要一直开着,等待订单的到来.
 */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza=null;
        String ordertype;

        do{
            ordertype=gettype();

            if (ordertype.equals("cheese")) {
                pizza=new CheesePizza();
            }else if (ordertype.equals("pepper")){
                pizza=new PepperPizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String gettype(){
        try {
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
