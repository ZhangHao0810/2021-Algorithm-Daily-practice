package Q04_二维数组中的查找;

/**
 * @author ZhangHao
 * @date 2020/2/17 14:17
 * @Description： 注意, Java的 length 是从1开始数的.
 *
 *
 *  我的思路, 既然是面试题,一定不会这么简单, 直接遍历的时间复杂度为: O(N*M) 空间为O(1)
 *      假如 N==M 则主对角线的元素可以分割,左上边的都比这个元素小,这样可以节省一部分的遍历.
 *      但是如果N!=M 则先找出来最大的那个 正方形子阵,节约一部分遍历之后,再全部遍历正方形之外剩下的部分.
 *
 *      这种思路比较繁琐,很不奈斯,写到一半写不下去了,直接看答案.然后就又 卧槽 了
 *      果然考虑算法智力很重要. 要多多积累经验.
 */
public class MyAnswer {

    private static boolean findNum(int[][] nums, int x) {

        int row = nums.length - 1;
        int col = nums[0].length - 1;

        int flag = 0;

        if (row - col > 0) {
            flag = 1;
        } else if (row - col < 0) {
            flag = 2;
        }

        if (flag == 1) {
            for (int i = 0; i < row; i++) {
                if (x > nums[i][i]) {
                    continue;
                }
                if (x < nums[i][i]) {
                    return x == nums[i - 1][i] && x == nums[i][i - 1];
                }
                return true;
            }
            for (int j = row; j < col; j++) {

            }
        }

//        if (x < nums[0][0])
//            return false;
//        if (x > nums[row][col])
//            return false;
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (x == nums[i][j]) {
//                    return true;
//                }
//            }
//        }

        return false;
    }
}
