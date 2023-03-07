/**
 * @author ZhangHao
 * @date 2020/5/28 21:44
 * @Description：  动态规划. 找长度, 返回的是int 值. {这个存疑, 代码有问题 没有解决.}
 */
public class 最长回文子序列 {
    /**
     * 2020/6/9 16:51
     * 方法体今日编辑
     * 与最长回文子串的区别是, 子串是连续的, 子序列可以不连续,
     * bbbb是 bbbab的子序列, 但不是子串.
     */
    public static int method(String s) {
        int len=s.length();
//        整个二维数组.
        int[][] dp = new int[len][len];
//        i从最后倒着走
        for (int i = len - 1; i >= 0; i--) {
            dp[i][i]=1;
//            j从i+1 正着走.
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }else{
                    dp[i][i] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
//       最后一列就是子序列.
        return dp[0][len - 1];
    }

    public static void main(String[] args) {
        String s="bbbab";
        System.out.println(method(s));
    }
}
