/**
 * @author Super-Zhang
 * @date 2021-08-03 13:20
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JZ08青蛙跳台阶 {
    /**
     * 本题的本质就是就是Fibo数列，只是初始值不一样。
     *
     * 更多详细见 ： 题解 #JZ7斐波那契数列。
     * 使用递推去解。
     *
     * 一定要有举一反三的能力！ 将学到的知识应用到新题型上面！
     */

    public int jumpFloor(int target) {
        if (target == 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        int sum = 0;
        int a = 1;
        int b = 2;
        for (int i = 3; i <= target; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
