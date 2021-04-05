package 排序.选择排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 12:16
 * 简单选择排序
 *
 * 基本思想：
 * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；
 * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
 * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
 *
 * 【时间复杂度】
 * 不管原始数组是否有序，时间复杂度都是O（n2），因为每一个数都要与其他数比较一次
 *
 * 【空间复杂度】
 * 因为只定义了两个辅助变量，与n的大小无关，所以空间复杂度为O（1）
 */
public class Simple_Selection_Sort {
    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        System.out.println("初始值："+Arrays.toString(a));
        selectSort(a);
        System.out.println("\n排序后："+Arrays.toString(a));
    }

    private static void selectSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int k=i;//k存放最小值下标，每次循环最小值下标+1
            for (int j = i+1; j <a.length ; j++) {
                if (a[j] > a[k]) {
                    k=j; //定位最小值
                }
            }
//            将未排序的最小值放在未排序序列首位
            swap(a,k,i);

        }

    }

    private static  void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
}
