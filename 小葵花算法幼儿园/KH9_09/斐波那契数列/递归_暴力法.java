package 斐波那契数列;

import java.util.Scanner;

/**
 * @author Super-Zhang
 * @date 2021-09-10 8:24
 */
public class 递归_暴力法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
