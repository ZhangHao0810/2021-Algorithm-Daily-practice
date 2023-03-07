package 源码应用;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangHao
 * @date 2019/11/4 17:09
 * @Description： Map
 *
 *          1.Map是一个抽象的构建(类似Component)
 *          2.Hashmap是中间构建(Composite) 实现继承了相关方法 put,putAll
 *          3.Node是HashMap的静态内部类,类似Leaf叶子结点,里面就没有put,putAll
 *              static class Node<K,V> implement Map.Entry<K,V>
 *
 */
public class Client {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"游戏");


        Map<Integer, String> map = new HashMap<>();
        map.put(1,"游戏");
        map.put(2,"游戏");
//        把另一个map放到这个map中.
        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}
