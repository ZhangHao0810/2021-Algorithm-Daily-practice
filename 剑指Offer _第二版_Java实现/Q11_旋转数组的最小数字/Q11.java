package Q11_旋转数组的最小数字;

/**
 * @author ZhangHao
 * @date 2020/2/24 12:50
 * @Description：
 *  原本思路就是顺序查找, 复杂度为O(n)
 * nums是一个递增数组的旋转数组, 所以 可以利用折半查找. O(logn)
 * 将数组对半分, 可以得到一个包含最小元素的新的旋转数组.
 */
public class Q11 {

    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        //获得数组的索引.
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = 1 + (h - 1) / 2;
//            如果数组有重复,巧了中间和两边某个的值是一样的. 就只能顺序查找了.
//            面试的时候,一定要问清楚这种问题.
            if (nums[l] == nums[m] && nums[m] == nums[h])
                return minNumber(nums, l, h);
//            中间数比最高的数小,符合递增排序,说明旋转的尺度比较大,最小值在前一个半区. 故h变为m.
            else if (nums[m] <= nums[h])
                h = m;
//            如果不满足的话,表名旋转尺度小,最小值在后一半区,l 变为m 要加1了,以为上一步的条件包含=
            else
                l = m + 1;
        }
        return nums[l];
    }

    //符合数组规律的最小值查找.
    private int minNumber(int[] nums, int l, int h) {
        for (int i = l; i < h; i++)
            if (nums[i] > nums[i + 1])
                return nums[i + 1];
        return nums[l];

    }
}
