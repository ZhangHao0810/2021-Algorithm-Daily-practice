/**
 * @author Super-Zhang
 * @date 2021-07-05 12:58
 * <p>
 * 给定一个n*m的矩阵a, 从左上角开始每次只能向右或者向下走，最后到达右下角的位置。
 * 路径上所有数字累加就是路径和，输出所有的路径中最小的路径和。
 */
public class NC59矩阵的最小路径和 {

    public static void main(String[] args) {
        int[][] a = {{1, 3, 4, 10}, {5, 6, 8, 1}, {4, 2, 1, 3}};

        System.out.println(minPathSum(a));

    }

    /**
     * 牛客思路： 用一个数组，计算出每一个位置的最小路径。最终就可以计算出最右下的了。
     * 其实思路很简单，用到了 【分治法】！ 要会将大问题拆解成小问题。
     *
     * 为了节省空间，可以直接操作原数组。
     * @param matrix
     * @return
     */
    public static int minPathSum(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        //初始化第一行和第一列。
        for (int i = 1; i < n; i++) {
            matrix[i][0] += matrix[i - 1][0];
        }
        for (int j = 1; j < m; j++) {
            matrix[0][j] += matrix[0][j - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                //比较ij 位置的上边和左边值。选小的。
                matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i][j - 1]);
            }

        }

        return matrix[n-1][m-1];

    }

    /**
     * 我自己 没解出来。
     *
     * @param a
     * @return
     */
    public static int getPathMinValue(int[][] a) {
        // 移动的步数
        int pathNum = a.length + a[0].length - 2;

        for (int i = 0; i < pathNum; i++) {

        }

        return 0;
    }
}
