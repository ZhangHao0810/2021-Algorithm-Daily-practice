package Q21_调整数组顺序使奇数位于偶数前面;

/**
 * @author ZhangHao
 * @date 2020/3/5 14:04
 * @Description：  创建一个新数组，时间复杂度 O(N)，空间复杂度 O(N)。
 */
public class Q21_1 {

    public void reOrderArray(int[] nums) {
        // 奇数个数
        int oddCnt = 0;
        for (int x : nums)
            if (!isEven(x))
                oddCnt++;
        int[] copy = nums.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                nums[i++] = num;
            else
                nums[j++] = num;
        }
    }

    private boolean isEven(int x) {
        return x % 2 == 0;
    }
}
