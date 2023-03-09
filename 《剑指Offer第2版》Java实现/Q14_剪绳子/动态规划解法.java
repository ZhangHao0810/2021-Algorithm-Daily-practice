package Q14_剪绳子;

/**
 * @author ZhangHao
 * @date 2020/2/27 14:53
 * @Description： 求解的时候, 从长度为1的时候开始往上推导.  从低向上的 推导思想.
 * <p>
 * 在剪第一刀的时候,有n-1种可能的剪法,也就是剪出来的第一段绳子的可能长度为 1,2,....n-1
 * 所以假如只剪一刀的话,(剪的长度为m) n长度的最优解=max(  m*(n-m)  )  m取值是从1~n-1
 * 因为剪很多刀其实就相当于剪很多个 1 刀!!!!! 这是解题的关键 每次都找剪一刀的最优解.
 * 最终可以追溯到n为1,2,3的时候,这时候我们给定最优解的值, 通过迭代就能得出结论了.
 * 拓展开来的话, 最优解(n)=max( 最优解(m)*最优解(n-m) ) 0<m<n
 * <p>
 * <p>
 * 上了个厕所,顿悟了.
 */
public class 动态规划解法 {


    /** 2020/2/27 15:36
     * 这是剑指Offer2上的答案, 原答案由C++编写,现改为Java.
    */
    int maxProductAfterCutting(int length) {
        if (length < 2)
            return 0;
        if (length == 2)
            return 1;
        if (length == 3)
            return 2;

//        products[]里面放的就是最优解.
        int products[] = new int[length + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        products[4] = 4;
//        从第五个开始就不同了,其实第四个开始就不同,剪一刀的最优解 2*2 和不剪是一样的.
//        products[5]=6;

        int max;

//        i为剪一刀的前边长度.
        for (int i = 4; i <= length; i++) {
//            每次计算新的绳子长度时候,要将max初始化.
            max = 0;
//            j为剪一刀的后边长度.
            for (int j = 1; j <= i / 2; j++) {
//                剪一刀的话,乘积就是前面长度*后面长度.
                int product = products[j] * products[i - j];
                if (max < product)
                    max = product;
//                这样products[]里面的值,就能从最小慢慢出来了.就可以用在下一次循环. 最终就可以求出最优解.
                products[i] = max;
            }
        }

        return products[length];

    }

    /** 2020/2/27 15:04
     * 这是java解析上面的答案. 更简短了.
    */
//    public int integerBreak(int n) {
////        定义一个数组dp, 存有 长度为索引+1时候的最优解(剪成各段之后的最大值)
//        int[] dp = new int[n + 1];
////        长度为1时,最大乘积为1.
//        dp[1] = 1;
////        从长度为2时候开始遍历,到长度为n
//        for (int i = 2; i <= n; i++)
////            j是剪一刀前半部分的长度,  i-j就是剪这一刀后半部分的长度.
//            for (int j = 1; j < i; j++)
//                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
//        return dp[n];
//
//    }
}
