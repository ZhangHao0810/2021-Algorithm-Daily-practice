package 字符串;

import java.util.Scanner;

/**
 * @author Super-Zhang
 * @date 2021-06-29 19:20
 *
 *  例如: "()()()"的深度是1,"((()))"的深度是3。⽜⽜现在给你⼀个合法的括号序列,需要你计算出
 * 其深度。
 * 输⼊描述:
 * 输⼊包括⼀个合法的括号序列s,s⻓度length(2 ≤ length ≤ 50),序列中只包含'('和')'。
 * 输出描述:
 * 输出⼀个正整数,即这个序列的深度。
 *
 *
 *  这个题 有点意思。()(())(((())))(()) 输出 4
 */
public class 计算括号序列的深度 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        int cnt=0,max=0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(')
                cnt++;
            else cnt--;

            max = Math.max(max, cnt);
        }

        sc.close();
        System.out.println(max);
    }
}
