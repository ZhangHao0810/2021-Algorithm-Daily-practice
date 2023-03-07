package Q04_二维数组中的查找;

/**
 * @author ZhangHao
 * @date 2020/2/17 15:00
 * @Description： 考察的是如何缩小规律的二维数组的查找范围.
 *
 *  因为每行递增,每列递增.所以 右上角的元素,可以比较大小来缩小范围.
 *      比他大的在下面,比他小的在左边. 就一个一个的移动. 一直移动到合适位置即可.
 *      时间复杂度为 O(M*N) 空间复杂度为O(1)
 *    对于左上角来说,所有元素都比他大,对于右下角来说,所有元素都比他小.无法缩小范围.
 *    对于左下角来说,上面的比他小,右面的比他大,应该也可以拿来缩小范围.
 *
 *    找规律的能力还是欠缺呀.
 */
public class Q4 {

    public static void main(String[] args) {
        int[][] maxtrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(find(2,maxtrix));
        System.out.println(find(5,maxtrix));

    }

     private static boolean find(int target, int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0, c = cols - 1;
        while (r < rows - 1 && c >= 0) {
            if (target == matrix[r][c])
                return true;
            else if (target > matrix[r][c]) {
                r++;
            } else
                c--;
        }

        return false;

    }

}
