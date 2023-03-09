package Q21_调整数组顺序使奇数位于偶数前面;

/**
 * @author ZhangHao
 * @date 2020/3/5 14:06
 * @Description：
 * 使用冒泡思想，每次都当前偶数上浮到当前最右边。
 * 时间复杂度 O(N<sup>2</sup>)，空间复杂度 O(1)，时间换空间。
 */
public class Q21_2 {

    public void reOrderArray(int[] nums) {
        int N = nums.length;
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isEven(nums[j]) && !isEven(nums[j + 1])) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    private boolean isEven(int x) {
        return x % 2 == 0;
    }

    //交换i 与j 位置的元素
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
