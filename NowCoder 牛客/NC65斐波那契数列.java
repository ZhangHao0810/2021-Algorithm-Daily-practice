/**
 * @author Super-Zhang
 * @date 2021-07-06 10:22
 *
 *  输入整数n，输出斐波那契额数列的第n项。 n<55
 *   斐波那契额数列也叫兔子数列
 *   1,1,2,3,5,8,13
 */
public class NC65斐波那契数列 {

    /**
     * 递归法，会有大量重复计算。 省略
     */

    /**
     * 方法2，记忆化搜索, 相当于将递归时要用到的数保存在数组中，用的时候直接拿。
     */
    int[] temp = new int[55];

    private int solution2(int n) {

        if (temp[n] != 0) { //这里是关键，直接返回了数组值，避免了重复计算！！！
            return temp[n];
        }
        if (n == 0) {
            return 0;
        }
        if (n==1||n==2)
            return 1;

        temp[n] = solution2(n - 1) + solution2(n - 2);

        return temp[n];
    }

    /**
     * 方法3 递推法。简单演草一下即出公式。
     */
    private int solution3(int n) {
        if (n==0) return 0;
        if (n==1||n==2) return 1;

        int f1=1,f2=1,ans=0;

        for (int i = 3; i <= n; i++) {
            ans=f1+f2;
            f1=f2;
            f2=ans;
        }
        return ans;
    }

    /**
     * 矩阵快速幂法，未做具体了解。
     */

}
