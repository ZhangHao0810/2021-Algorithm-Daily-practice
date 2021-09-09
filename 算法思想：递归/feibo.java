/**
 * @author Super-Zhang
 * @date 2021-04-07 15:09
 * <p>
 * 斐波那契数列的第一个和第二个数分别为1和1，
 * 从第三个数开始，每个数等于其前两个数之和（1，1，2，3，5，8，13…………）.
 * 编写一个程序输出斐波那契数列中的前20个数。要求每行输出5个。
 * <p>
 * 其实用递归做fibo 会有很多的重复计算。
 */
public class feibo {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(f(i) + " ");
            if (i % 5 == 0) System.out.println();
        }

        for (int i = 1; i < 20; i++) {
            System.out.println(fiboplus(i));
        }
    }

    /**
     * 返回第n位的fibo数。 main中要循环 才可遍历所有fibo数。
     *
     * @param n
     * @return
     */
    private static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

//    从下到上进行操作。 无需递归！！！！

    /**
     * 返回第n位fibo数。 fibo没有用数组。直接每次从头算起。
     *
     * @param n
     * @return
     */
    private static int fiboplus(int n) {

//        int[] res = {1, 1};
//
//        if (n < 2) return res[n];

//        int first = 1;
//        int second = 1;
//        int fibn = 0;
//        for (int k = 2; k <= n; k++) {
//            fibn = first+second; // 计算得出 3 。
//            first=second; //移动1指针到2.
//            second = fibn; // 移动2 指针到3
//        }
//        return fibn;

        // 这个太吊了。 这个是最好的手段。 先想递归，再想这个优化

        int i = 1;
        int j = 1;

        for (int k = 1; k < n / 2 && n > 2; k++) {
            i = i + j;
            j = j + i;
        }

        if (n % 2 == 0) {
            return j;
        } else return i;

    }

}
