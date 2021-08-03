import 排序.选择排序.Heap_Sort;

/**
 * @author Super-Zhang
 * @date 2021-08-03 12:14
 *
 * 描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 示例1
 * 输入：
 *
 * [3,4,5,1,2]
 *
 * 返回值：
 *
 * 1
 */
public class JZ06旋转数组的最小数字 {

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

    public int minNumberInRotateArray(int[] array) {
        if (array.length==0) return 0;
        int low=0;
        int high=array.length-1;
        int mid;

        while (low < high) {
            if (array[low]<array[high]) return array[low];

            mid=low +(high-low)/2;
// 二分查找常用于查找一个数target，当没有一个target的时候，可以选择一个端点值作为target。
            if (array[mid] > array[high]) {
                low=mid;
            } else if (array[mid] < array[high]) {
                high = mid;
            }else --high;
        }

        return array[low];
    }
}
