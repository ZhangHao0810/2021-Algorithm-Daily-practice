package Q03_数组中重复的数字;

/**
 * @author ZhangHao
 * @date 2020/2/16 19:20
 * @Description： 在长度为 n+1 的数组里面,所有数字都在 1~n 范围内,
 * 所有数组中至少有一个数字时重复的.
 * 请找出数组中任意一个重复的数字,但不能修改输入的数组.
 * <p>
 * 因为长度>数字最大值,所以一定有重复.
 * <p>
 * 不能修改输入的数组的话,一般会想到将数组元素复制到另一个数组中,但这样会增加空间复杂度.
 * 复制到另一个数组,时间复杂度 O(N)，空间复杂度 O(N)。
 * 用时间换空间
 * 时间复杂度为O(nlogn) 空间复杂度为O(1),也是比我自己编写的要快的.
 * <p>
 * 思路: 元素在1~n范围内,而元素个数 > n 则一定存在重复数字.
 * 即,当这个区间内的数字数目小于这个区间长度时,就一定有重复数字.
 * 二分查找,多一步统计区间数字的数目
 * <p>
 * 理解这个算法的前提是,必须要把 二分查找 搞得明明白白. 之所以要传入另一个参数length,就是因为有了元素范围 1~n的这个约定.
 * <p>
 * 算法缺点: 无法保证找出所有重复的数字.
 */
public class Q3_2 {

    public static void main(String[] args) {
        int[] nums = {2,3,5,4,3,2,6,7};
        int max = 7;
        int duplication = getDuplication(nums, max);
        System.out.println(duplication);
    }


    private static int getDuplication(int[] nums, int length) {
        if (nums == null || length <= 0)
            return -1;
        int start = 1;
        int end = length - 1;
        while (end >= start) {
            int middle = (end + start) >>> 1;
//            核心代码 count
            int count = countRange(nums, length, start, middle);
            if (end == start) {
                if (count > 1)
                    return start;
                else
                    break;
            }
            if (count > (middle - start + 1))
                end = middle;
            else
                start = middle + 1;
        }
        return -1;
    }

    //    输入长度为n的数组,这个函数将被调用O(logn)次 每次需要O(n)的时间,所以时间复杂度为O(nlogn)
//    统计在start和end这个区间中,数字的个数.遍历了数组的全部值,去匹配这个区间.
    private static int countRange(int[] nums, int length, int start, int end) {
        if (nums == null)
            return 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
//            如果数组中的元素出现在了这个范围内,数字的个数便+1.
            if (nums[i] >= start && nums[i] <= end)
                count++;
        }
        return count;
    }
}
