package 开班测评;

/**
 * @author Super-Zhang
 * @date 2021-08-28 11:49
 *
 * 小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
 * 1、将a_i放入b序列的末尾
 * 2、逆置b序列
 *
 * 小易需要你计算输出操作n次之后的b序列。
 *
 * 输入描述:
 * 输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
 * 第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。

 * 输出描述:
 * 在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
 *
 * 示例1
 * 输入
 * 4
 * 1 2 3 4
 *
 * 输出
 * 4 2 1 3
 */
import java.util.*;

// 有时候 找规律往往是最好的解决方法！！！
// 一定好好好读题啊， 题干说行末无空格。
// 如果连了解题目希望我做什么逻辑都搞不明白，那还玩个毛线！！！！
public class _03操作序列 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        String[] temp = new String[s1.length];

        int left =0;
        int right = s1.length-1;
        int index = s1.length-1;
        while(left<right){
            temp[left] = s1[index];
            left++;
            index--;
            temp[right] = s1[index];
            right--;
            index--;
        }
        if(left == right){
            temp[left] = s1[index];
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            res.append(temp[i]);
            if (i!=temp.length-1){
                res.append(" ");
            }
        }
        System.out.println(res);
    }
}