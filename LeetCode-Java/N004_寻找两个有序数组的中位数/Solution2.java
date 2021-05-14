package N004_寻找两个有序数组的中位数;

/**
 * @author Super-Zhang
 * @date 2021-05-14 11:39
 */
public class Solution2 {
    public double findMedianSortedArrays2(int[] num1, int[] num2) {

        //保证num1的长度小于 num2
        if (num1.length > num2.length) {
            int[] temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int m = num1.length;
        int n = num2.length;

        //分割线左边的所有元素需要满足的个数
        int totalLeft = (m + n + 1) / 2;

        //在num1的区间 [0,m]里查找恰当的分割线
        //使得 num1[i-1] <= num2[j] && num2[j-1] <= num1[i]
        int left = 0;
        //搜索区间右边界初始化为 第一个数组的长度。
        int right = m;

        //【核心代码：二分查找 逐渐缩小查找的区间。】
        while (left < right) {
//            通过下面两行代码确定分割线的位置
            //i 为num1在分割线右边元素的下标。
            int i = left + (right - left) / 2;//下方不会出现数组越界 不用上取整。
            // j 为num2 在分割线右边元素的下标。
            int j = totalLeft - i;

            //分割线在数组2 左边元素的数要大于 分割线在数组1 右边元素的数值。要将分割线右移
            if (num2[j-1] > num1[i]) {
                //下一轮搜索的区间[i+1，right]
                left = i + 1; // 出现 i+1 这样的表达式，
            } else {
                //下一轮搜索的区间[left,i]
                right = i;
            }
        }

        int i = left;
        int j = totalLeft - i;

        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : num1[i - 1];
        int nums1RightMin = i == m ? Integer.MAX_VALUE : num1[i];
        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : num2[j - 1];
        int nums2RightMin = j == n ? Integer.MAX_VALUE : num2[j];

//        返回数组中位数的表达式。
        if ((m + n) % 2 == 1) {//两数组和为奇书时。
            return Math.max(nums1LeftMax, nums2LeftMax);
        }else{
            return (double) (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2;
        }


    }
}
