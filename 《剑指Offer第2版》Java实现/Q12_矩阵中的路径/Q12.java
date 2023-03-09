package Q12_矩阵中的路径;

/**
 * @author ZhangHao
 * @date 2020/2/25 9:31
 * @Description： 输入一般从控制台, 故设置输入为数组, 另外编写一个函数进行数组向矩阵(二维数组)的转化.
 */
public class Q12 {
    //    next代表四个方向.
    private final static int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int rows;
    private int clos;

    //判断是否有路径的方法,要输入数组,和矩阵的行,列数,以及要检查的str
    public boolean hasPath(char[] array, int rows, int clos, char[] str) {
//        如果矩阵行列为0,直接false
        if (rows == 0 || clos == 0)
            return false;
//      将参数赋值给全局变量,以供其他函数使用.
        this.rows = rows;
        this.clos = clos;
//        二维数组的标记,因为每次搜索不可以走重复点.,要在函数之外定义,不能作为backtracking的局部变量.但作为全局变量又有些浪费.
        boolean[][] marked = new boolean[rows][clos];
//        根据数组构造矩阵.
        char[][] matrix = buildMatrix(array);
//      遍历矩阵所有元素,每个元素都当一次起始点.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < clos; j++) {
                if (backtracking(matrix, str, marked, 0, i, j))
                    return true;
            }
        }
        return false;
    }

    //    获得路径的函数,是回溯的.内部调用自己.r与c表示位置,伴随回溯是动态的,初始值是hasPath()遍历的每个元素.
    private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c) {
//        当长度相同时,便找到了.
        if (pathLen == str.length) {
            return true;
        }

//        遍历到这些条件,便返回false
// 这是关键的一个判断,也是回溯false终结的手段. || 是或者的意思.
        if (r < 0 || r >= rows || c < 0 || c > clos || matrix[r][c] != str[pathLen] || marked[r][c]) {
            return false;
        }
//        默认这一点是true,代表可以进入.
        marked[r][c] = true;

//        再次遍历该点的上下左右四个方向.
        for (int[] n : next) {
            if (backtracking(matrix, str, marked, pathLen + 1, r + n[0], c + n[1])) {
                return true;
            }
        }
//        该点已经遍历,
        marked[r][c] = false;
        return false;
    }

    private char[][] buildMatrix(char[] array) {
        char[][] matrix = new char[rows][clos];
        for (int r = 0, idx = 0; r < rows; r++) {
            for (int c = 0; c < clos; c++) {
                matrix[r][c] = array[idx++];
            }
        }
        return matrix;
    }

}
