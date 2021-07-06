/**
 * @author Super-Zhang
 * @date 2021-07-06 10:41
 * 给定含有重复数字的升序数组a， 利用二分查找输出第一个大于等于查找值v的位置。不存在的话输出数组长度+1
 * 位置下标从1开始。
 *
 *  输入： 数组长度，查找值，数组
 */
public class NC105二分查找 {

    private int solution(int n, int v, int[] a) {
        int left=0;
        int right=n-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  //left+right 可能会溢出int范围

            if (a[mid] >= v) {
                right=mid-1; //当mind是v的时候，right在v左边，所以最后right+1就是最终结果了。
            }else left=mid+1;
        }
        return right+2;
    }
}
