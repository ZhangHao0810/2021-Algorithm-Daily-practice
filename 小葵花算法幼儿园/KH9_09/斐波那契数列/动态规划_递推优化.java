package 斐波那契数列;

import java.util.Scanner;

/**
 * @author Super-Zhang
 * @date 2021-09-10 9:59
 */
public class 动态规划_递推优化 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;

        int sum = 1;
        int one = 0;

        for (int i = 2; i <= n; i++) { //找规律找出来的精华。
            sum = sum + one;
            one = sum - one;
        }

        return sum;
    }

}
