package Q14_剪绳子;

/**
 * @author ZhangHao
 * @date 2020/2/27 14:35
 * @Description：
 * 剪绳子,要求长度(整数)的乘积最大.
 *
 * 应用贪心算法需要较强的基本功. (我是没看懂证明)
 *
 *  尽可能的多剪长度为3的绳子,并且不允许出现长度为1的绳子.
 *  如果出现了,就把长度为3的绳子与长度为1的绳子组合成两个长度为2的绳子.
 *
 *  贪心算法是通过数学公式推导出来的迭代公式,比较考研数学功底.
 *
 *  证明:
 *      当n>=5时,2(n-2)>n 且 3(n-3)>n
 *          因此在 n >= 5 的情况下，将绳子剪成一段为 2 或者 3，得到的乘积会更大。
 *          又因为3(n-3)>2(n-2) 所以应该尽量多剪长度为3的绳子
 */
public class 贪心解法 {

    public int integerBreak(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int timesOf3 = n / 3;
        if (n - timesOf3 * 3 == 1)
            timesOf3--;
        int timesOf2 = (n - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3)) * (int) (Math.pow(2, timesOf2));
    }
}
