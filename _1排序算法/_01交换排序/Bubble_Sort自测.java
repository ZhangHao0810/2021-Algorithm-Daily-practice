package _01交换排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-06 11:15
 *
 *  算法这个东西
 */
public class Bubble_Sort自测 {

    public static void main(String[] args) {
        int[] arr = {23,53,777,34, 6, 7, 11, 5, 12, 3, 0, 1};
        System.out.println("排序前：" + Arrays.toString(arr));
//        bubble_sort(arr);
//        bubble_sort2(arr);
        bubble_sort3(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

    }

    private static void bubble_sort3(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int i;
        while (low < high) {
//            正向冒泡 （取max放到上面）
            for (i = low; i < high; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i+1);
                }
            }
            high--;
//             逆向冒泡 （取min放在底下）
            for (i = high; i > low; i--) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            }
            low++;
        }
    }

    private static void bubble_sort2(int[] arr) {
//        设定待排序序列终点
        int i = arr.length - 1;

        while (i > 0) {
//            每趟开始时候没有交换，初始化标志。
            int flag = 0;
//            内层循环 一个泡泡 反复进行比较和交换，直至待排序序列终点。
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = j;
                }
            }
            i = flag;//将最后一个交换的位置设为待排序序列终点。
        }
    }

    private static void bubble_sort(int[] arr) {
//        外层循环负责冒泡次数。
        for (int i = 0; i < arr.length - 1; i++) {
//            内存循环控制特定泡泡的移动和比较。
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
