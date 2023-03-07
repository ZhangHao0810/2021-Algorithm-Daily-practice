package 斐波那契数列;

import java.util.Scanner;

/**
 * @author Super-Zhang
 * @date 2021-09-10 9:59
 */
public class 动态规划_递推 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;

        int sum = 0;
        int two = 0;
        int one = 1;

        for (int i = 2; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;

    }
}
