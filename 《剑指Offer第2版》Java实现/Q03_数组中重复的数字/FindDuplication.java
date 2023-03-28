package Q03_数组中重复的数字;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author ZhangHao
 * @date 2020/2/16 18:45
 * @update: 2023年3月27日17:14:50
 * @Description： 考点:
 * 考察对一位数组的理解以及编程能力.
 * 分析问题的能力.
 * <p>
 * 解题思路
 * [时间复杂度 O(N)，空间复杂度 O(1)]。
 * 因此不能使用排序的方法，也不能使用额外的标记数组。
 * 对于这种数组元素在 [0, n-1] 范围内的问题，
 * 可以将值为 i 的元素调整到第 i 个位置上进行求解。
 * 以 (2, 3, 1, 0, 2, 5) 为例，遍历到位置 4 时，该位置上的数为 2，但是第 2 个位置上已经有一个 2 的值了，因此可以知道 2 重复：
 * <p>
 * 这个问题不是单纯的将数组中重复元素找出,更重要的是数组元素在[0, n-1] 范围内
 * 所以说这个问题确实比较特殊,并不是简单的找重复元素,一定要注意前提.不要只看结果.代码优化.
 * <p>
 * 题目要求:
 * 在一个长度为n的数组里的所有数字都在0~n-1的范围内.
 * 数组中某些数字是重复的,但不知道几个数字重复了.也不知道每个数字重复了几次.
 * 找出数组中任意一个重复的数字.
 * ex: 输入长度为 7 的数组{2,3,1,0,2,5,3} 对应的输出是 2或者3
 * <p>
 * 牛逼.值得多看.
 */
public class FindDuplication {

    @Test
    public void main() {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(duplicate(nums));
        System.out.println(getDuplicate(nums));
    }

    /**
     * @description 返回任意一个重复数字。
     * @author zh
     * @data 2023/3/28
     */
    public int getDuplicate(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[2]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }

        return -1;
    }

    /**
     * @description 返回所有的重复数字。
     * @author zh
     * @data 2023/3/28
     */
    public ArrayList<Integer> duplicate(int[] nums) {

        ArrayList<Integer> duplication = new ArrayList<>();
        if (nums == null || nums.length <= 0)
            return null;
        for (int i = 0; i < nums.length; i++) {
//            因为数组元素就是0~n-1  长度为n  所以要充分利用下标的优势.将数放到下标的地方.
//            注意while 条件 元素和元素位置下标不一致.这是关键.
            while (nums[i] != i) {
//             进入while中,元素还是和以元素为下标的位置的元素相等,便一定是这俩重复了.
//             重复数字,返回true,重复数字保存在duplication[0]中.
                if (nums[i] == nums[nums[i]]) {
                    duplication.add(nums[i]);
                    break;
                }
//           如果和下标不一致,就把这个数放在以这个数为下标的位置.互换一下. 这时候,nums[i]这个位置就OK了,
// 当for循环  i== nums[i]时, 便不会执行while. 所以时间复杂度就在这里省下来了.
                swap(nums, i, nums[i]);
            }
        }

        return duplication;
    }

    /**
     * 2020/2/16 18:59
     * 将元素放在与元素相等下标的位置上. 当下次 for到这里时,便不会执行while
     * 交换 数组的两个元素，参数为两个元素的下标。
     */
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
