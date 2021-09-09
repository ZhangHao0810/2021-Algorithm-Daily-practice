/**
 * @author Super-Zhang
 * @date 2021-07-04 22:23
 * <p>
 * 给定两个nxn的矩阵A和B，求A x B
 *
 * 算法pass时间：22:45。（包含 自分析，自coding，看解析，对照coding的过程）
 */
public class NC143矩阵乘法 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] b = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int [][] ans=getMatrixMulti(a,b);

        for (int[] an : ans) {
            for (int j = 0; j < ans.length; j++)
                System.out.printf("%5d", an[j]);
            //"%5d"表示按5位的固定位宽输出整型数值。如果不足五位，则在前面补空格；超过五位，则按实际位数输出k
            System.out.println();
        }
    }

    /**
     *  我的答案，同牛客网相同。 主要就是 矩阵相乘的原理搞懂即可。
     * @param a
     * @param b
     * @return
     */
    private static int[][] getMatrixMulti(int[][] a, int[][] b) {

        int[][] ans = new int[a.length][a.length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                for (int c = 0; c < ans.length; c++) {
                    ans[i][j] += a[i][c] * b[c][j];
                }

            }

        }

        return ans;
    }
}
