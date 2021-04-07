package 排序.归并排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-07 9:35
 *  归并排序
 *  是分治法（Divide and Conquer）的一个非常典型的应用
 *
 *  归并排序算法稳定，数组需要O(n)的额外空间，时间复杂度始终为O(nlog(n))
 *
 *  【工作原理】：
 * 归并排序就是递归得将原始数组递归对半分隔，直到不能再分（只剩下一个元素）后，开始从最小的数组向上归并排序
 * 1、 向上归并排序的时候，需要一个暂存数组用来排序，
 * 2、 将待合并的两个数组，从第一位开始比较，小的放到暂存数组，指针向后移，
 * 3、 直到一个数组空，这时，不用判断哪个数组空了，直接将两个数组剩下的元素追加到暂存数组里，
 * 4、 再将暂存数组排序后的元素放到原数组里，两个数组合成一个，这一趟结束。
 */
public class Merge_Sort {

    private static int  count=0;

    public static void main(String[] args) {
        int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        mergeSort(data);
        System.out.println("排序后的数组："+Arrays.toString(data));
    }

    private static void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    /**
     * 排序算法。
     */
    private static void sort(int[] data, int left, int right) {
        if (left>=right)
            return;
//        找出中间索引 （有点牛逼）
        int center = (left+right)/2;

//        对左边数组进行递归
        sort(data, left, center);
//          对右边数组进行递归
        sort(data, center + 1, right);
        // 合并。
        merge(data, left, center, right);
        count++;
        System.out.println("第"+count+"趟Merge结果："+Arrays.toString(data));
    }

    /**
     * 将两个数组合并，归并前两个数组各自有序，归并后数组有序。
     * @param data 数组
     * @param left 左数组的第一个元素的索引
     * @param center 左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right  右数组最后一个元素的索引
     */
    private static void merge(int[] data, int left, int center, int right) {
        //临时数组
        int[] tmpArr = new int[data.length];
        //右数组第一个元素索引。
        int mid = center+1;
        // third 记录临时数组的索引
        int third = left;
        //缓存左数组第一个元素索引。
        int tmp=left;

        //从两个数组中取出最小的放入临时数组
        while (left <= center && mid <= right) {
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }

        //剩余的 直接放入数组。 下面两个while只会执行一个。
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }

        // 将临时数组中的内容拷贝回原数组中。
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }

    }
}
