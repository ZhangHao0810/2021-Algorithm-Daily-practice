package Q13_机器人的运动范围;

/**
 * @author ZhangHao
 * @date 2020/2/26 11:08
 * @Description：
 *  地上有m行n列的方格.
 *     一个机器人从(0,0)的格子开始移动,每次可以向左右上下移动一格,
 *     但是不能进入行坐标和列坐标的位数之和大于k的格子
 *     (12,34) 位数之和即: 1+2+3+4
 *     请问该机器人能到达多少个格子??
 */
public class Q13 {
//    四个方向移动.
    private static final int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
//    能到达的格子数.
    private int cnt = 0;
//    当前行列数.
    private int rows;
    private int cols;

    private int threshold;
//    获得每个位置上等待与k比较的数.
    private int[][] digitSum;

    public int movingCount(int threshold, int rows, int cols) {
//        将参数传给全局变量.
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
//        初始化
        initDigitSum();
//        声明每个位置都有的标记, 标记不能在函数dfs内定义 标记默认值是false
        boolean[][] marked = new boolean[rows][cols];
//        调用函数
        dfs(marked, 0, 0);
        return cnt;
    }

    private void dfs(boolean[][] marked, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c])
            return;
//        标记该位置true 表示已经走过,之后不要走了.
        marked[r][c] = true;
//        不满足条件,return
        if (this.digitSum[r][c] > this.threshold)
            return;
//        满足条件了的话,就多走一步.
        cnt++;
        for (int[] n : next)
            dfs(marked, r + n[0], c + n[1]);
    }

//    初始化,获得每个位置等待与k比较的数值.
    private void initDigitSum() {
        int[] digitSumOne = new int[Math.max(rows, cols)];
//        将每个位置的数字暂存下来.
        for (int i = 0; i < digitSumOne.length; i++) {
            int n = i;
            while (n > 0) {
                digitSumOne[i] += n % 10;
                n /= 10;
            }
        }
        this.digitSum = new int[rows][cols];
//        获得待比较值.
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.cols; j++)
                this.digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
    }
}