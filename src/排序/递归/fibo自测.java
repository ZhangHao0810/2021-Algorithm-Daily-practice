package 排序.递归;

/**
 * @author Super-Zhang
 * @date 2021-04-07 15:09
 * <p>
 * <p>
 * 斐波那契数列的第一个和第二个数分别为1和1，
 * 从第三个数开始，每个数等于其前两个数之和（1，1，2，3，5，8，13…………）.
 * 编写一个程序输出斐波那契数列中的前20个数。要求每行输出5个。
 */
public class fibo自测 {

    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) { //注意这里是从1开始。 从0开始 栈溢出。
            System.out.print(f(i) + " ");
            if (i % 5 == 0) System.out.println();
        }
    }

    private static int f(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

}
