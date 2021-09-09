/**
 * @author Super-Zhang
 * @date 2021-08-03 13:44
 *
 *  我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，从同一个方向看总共有多少种不同的方法？
 *
 * 比如n=3时，2*3的矩形块有3种不同的覆盖方法(从同一个方向看)：
 */
public class JZ10矩形覆盖 {

    /**
     * FeiBo永远的神。
     * 青蛙跳台永远的神。
     *
     * 见得多了，就能总结出这一类题目的解法。
     *
     * 使用动态规划：递推优化
     * 要先分析题目，找到其中的一些规律。
     *
     * 個數！ 和跳台阶是一个原理！
     */

    public int rectCover(int target) {
        if (target<3) return target;
        int a = 1, b = 2, c=0;
        for (int i=3; i<=target; ++i) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;

    }
}
