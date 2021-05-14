package N004_寻找两个有序数组的中位数;

/**
 * @author Super-Zhang
 * @date 2021-05-14 11:25
 * <p>
 * <p>
 * 时间复杂度：O（log min（m，n））
 * 空间复杂度：O（1）
 */
public class Solution {

    public double findMedianSortedArrays(int[] num1, int[] num2) {

        //保证num1的长度小于 num2， 对nums1 进行二分查找法。时间复杂度出自二分查找。
        if (num1.length > num2.length) {
            int[] temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int m = num1.length;
        int n = num2.length;

        /**
         * 【分割线左边的所有元素需要满足的个数：】
         *
         * 这里规定了，如果是奇数个，左边多一个，就在分子+1.“上取整”
         * 又 如果是偶数个，整数除法Java下取整，分子的+1没有影响。 公式便确定下来。
         */
        int totalLeft = (m + n + 1) / 2;

        int left = 0;
        //搜索区间右边界初始化为 第一个数组的长度。
        int right = m;

        /**
         * 有两种极端情况：
         *   1. 两条数组长度不相等，让短的作为第一条。
         *          1）分割线在第一条最左边。 那么一定在第二条的中间。不会出现数组越界。
         *          2）分割线在第一条最右边，那么也一定出现在第二条的中间，不会出现数组越界。
         *   2. 两条数组等长。
         *          1）分割线在第一条的最左边，在第二条的最右边。
         *          2）在第一条的最右边，在第二条的最左边。
         *
         * 在num1的区间 [0,m]里查找恰当的分割线
         *
         * 【定义分割线：】
         *          *分割线的划分标准：
         *          *     num1[i-1] <= num2[j] && num2[j-1] <= num1[i]
         *          *     num1左边的最大值 <= num2右边的最小值。
         *          *     num2左边的最大值 <= num1右边的最小值。
         */
        //【核心代码：二分查找 逐渐缩小分割线划分的位置。】
//        对num1数组进行操作。
        while (left < right) {
            //i 为num1在分割线右边元素的下标。
            // 这里+1 太绝了。若没有1 当left=0，right=1时，i=0 。在num1【i-1】的时候会发生数组越界异常。
            int i = left + (right - left + 1) / 2;    // j 为num2 在分割线右边元素的下标。
            int j = totalLeft - i;

//            在num1的区间 [0,m]里查找恰当的分割线
            if (num1[i - 1] > num2[j]) {//第一个数组的分割线划的太靠右了。
                //下一轮搜索的区间[left,i-1]
                right = i - 1;
            } else {
                //下一轮搜索的区间[i,right]
//                当区间只剩俩元素，[left(i),right]时，58和60行代码不会使得区间再缩小。
//                 若  int i = left + (right - left) / 2; 程序陷入死循环。
                left = i;
            }
        }

        int i = left;
        int j = totalLeft - i;

        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : num1[i - 1];
        int nums1RightMin = i == m ? Integer.MAX_VALUE : num1[i];
        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : num2[j - 1];
        int nums2RightMin = j == n ? Integer.MAX_VALUE : num2[j];

//        返回数组中位数的表达式。
        if ((m + n) % 2 == 1) {//两数组和为奇数时。
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (double) (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2;
        }

    }

}
