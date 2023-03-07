package Q29_顺时针打印矩阵;

import java.util.ArrayList;

/**
 * @author ZhangHao
 * @date 2020/3/12 9:43
 * @Description： 顺时针打印矩阵元素
 */
public class Q29 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {

            //遍历 第r1行 的元素  上边从左向右
            for (int i = c1; i <= c2; i++)
                ret.add(matrix[r1][i]);
            //遍历 第c2列 的元素  右边从上到下
            for (int i = r1 + 1; i <= r2; i++)
                ret.add(matrix[i][c2]);

//
            if (r1 != r2)
                //下边从右向左.
                for (int i = c2 - 1; i >= c1; i--)
                    ret.add(matrix[r2][i]);
            if (c1 != c2)
//                左边从下到上.
                for (int i = r2 - 1; i > r1; i--)
                    ret.add(matrix[i][c1]);
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ret;
    }
}

