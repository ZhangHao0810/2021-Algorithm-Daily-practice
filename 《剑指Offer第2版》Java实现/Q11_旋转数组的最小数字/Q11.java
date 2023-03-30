package Q11_旋转数组的最小数字;

import org.junit.Test;

/**
 * @author ZhangHao
 * @date 2020/2/24 12:50
 * @date 2021-08-03 12:14
 * @update 2023年3月30日10:22:33
 * @Description： 描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 示例1
 * 输入： [3,4,5,1,2]
 * 返回值：1
 * <p>
 * 原本思路就是顺序查找, 复杂度为O(n)
 * nums是一个递增数组的旋转数组, 所以 可以利用折半查找. O(logn)
 * 将数组对半分, 可以得到一个包含最小元素的新的旋转数组.
 */
public class Q11 {

    /**
     * 考察特殊的 二分查找
     * <p>
     * 题干中有一个概念没有理解，导致想不明白题意：
     * 非递减数组， 意思是：数组中没有任何部分是递减的！ 122344
     * <p>
     * 非递减数组的旋转，就是将后边一部分元素挪到了前面，导致原本处在第一位的最小元素去到中间了。
     * 题目要找到并输出这个最小元素。
     * 查找元素嘛， 二分查找法适用。
     * <p>
     * 但是最小元素不知道，没有一个 target 去和 mid元素比。
     * 其实也是可以做的，将某个端点值设为target即可。
     * 而这个端点值不能随便选，一般选后面的。 可以在纸上做一下演草。
     * <p>
     * 情况1 ：1 2 3 4 5 ， arr[mid] = 3. target = 1, arr[mid] > target, 答案在mid 的左侧
     * 情况2 ：3 4 5 1 2 ， arr[mid] = 5, target = 3, arr[mid] > target, 答案却在mid 的右侧
     * 所以不能把左端点当做target
     */

    @Test
    public void main() {
//        int[] arrs = {3, 4, 5, 1, 2};
        int[] arrs = {3, 4, 4, 1, 3};
        System.out.println(minNumberInRotateArray(arrs));
    }


    /**
     * @description  二分查找 有三个关键值， low，mid，high，target
     * @author zh
     * @data 2023/3/30
     */
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low < high) {
            // 二分查找常用于查找一个数target，当没有一个target的时候，可以选择一个端点值作为target。本题中根据题意 每次都选hight索引为target
            int target = array[high];
            if (array[low] < target) {
                return array[low];
            }
            mid = (low + high) >> 1;
            if (array[mid] > target) {
                low = mid + 1;
            } else if (array[mid] < target) {
                high = mid - 1;
            } else {
                high--;
            }
        }

        return array[low];
    }
}
