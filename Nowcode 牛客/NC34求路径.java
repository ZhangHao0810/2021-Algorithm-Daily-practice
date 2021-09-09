/**
 * @author Super-Zhang
 * @date 2021-07-05 13:44
 * <p>
 * 机器人在mxn大小的地图的左上角（起点）
 * 每次向下或向右移动，要到达地图的右下角（终点） 可以有多少种不同的路径走法？
 */
public class NC34求路径 {

    public static void main(String[] args) {
        int[][] a = new int[5][4];

        System.out.println(uniquePaths(a.length, a[0].length));

    }

    /**
     * 牛客方案： 矩阵路径问题， 采用分治法！ 思路和求矩阵最小路径和一致。
     *
     * @param m
     * @param n
     * @return
     */
    private static int uniquePaths(int m, int n) {
//        原版：
//        int[][] dp = new int[m + 1][n + 1];
//
//        for (int i=1;i<=m;i++)    dp[i][1] = 1;
//        for (int j=1;j<=n;j++)    dp[1][j] = 1;
//
//        for (int i = 2; i <= m; i++) {
//            for (int j = 2; j <= n; j++) {
//                dp[i][j]=dp[i-1][j]+dp[i][j-1];
//            }
//        }
//
//        return dp[m][n];

//        我的修改版： 这样比较好理解。
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m-1][n-1];
    }

    /**
     * 我的方案： 只要走满 m-1+n-1步 ， 就一定是在终点。  卡克。
     *
     * @param a
     * @return
     */
    private static int pathway(int[][] a) {
        int num = 0;
        return num;
    }

}
