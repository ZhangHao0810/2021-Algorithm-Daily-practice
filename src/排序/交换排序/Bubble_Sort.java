package 排序.交换排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-06 10:15
 * 冒泡排序
 * <p>
 * 每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * 1、时间负责度都是O（n2）不管原始数组是否有序，时间复杂度都是O（n2），因为每一个数都要与其他数比较一次
 * 2、空间复杂度都是O（1）
 */
public class Bubble_Sort {

    public static void main(String[] args) {
        int[] arr = {7, 6, 7, 11, 5, 12, 3, 0, 1};
        System.out.println("排序前：" + Arrays.toString(arr));
//        bubble_sort(arr);
//        bubble_sort2(arr);
//        bubble_sort3(arr);
//        System.out.println("排序前：" + Arrays.toString(arr));

    }

    private static void bubble_sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    /**
     * 记录每趟排序中最后一次进行交换的位置。
     * 下次只要扫描到该位置即可。
     *
     * @param a
     */
    private static void bubble_sort2(int[] a) {
        int i = a.length - 1;  //记录标志，作为待排序序列的最后位置。
        while (i > 0) {
            int pos = 0; //每趟开始时,无记录交换
            for (int j = 0; j < i; j++)
                if (a[j] > a[j + 1]) {
                    pos = j; //记录交换的位置
                    swap(a, j, j + 1);
                }
            i = pos; //移动标志到交换的位置。
        }
    }

    /**
     * 在每趟排序中进行正向和反向两遍冒泡的方法一次可以得到两个最终值(最大者和最小者) ,
     * 从而使排序趟数几乎减少了一半。
     *  两个指针 定义待排序序列的上下边界。
     * @param a
     */
    private static void bubble_sort3(int[] a) {
        int low = 0;
        int high = a.length - 1; //设置变量的初始值
        int tmp, j;
        while (low < high) {
            for (j = low; j < high; ++j) //正向冒泡,找到最大者
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            --high;                 //修改high值, 前移一位
            for (j = high; j > low; --j) //反向冒泡,找到最小者
                if (a[j] < a[j - 1]) {
                    tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            ++low;                  //修改low值,后移一位
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
