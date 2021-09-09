package _03选择排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 16:26
 */
public class Heap_Sort自测 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 7, 11, 5, 12, 3, 0, 1};
        System.out.println("排序前：" + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序前：" + Arrays.toString(arr));
    }

    private static void sort(int[] a) {

        // 创建 大顶堆
        for (int i = a.length / 2 - 1; i >= 0; i--) {//注意这里i是下标 要从0开始。
            adjustHeap(a, i, a.length);
        }

        // 输出排序。
        for (int j = a.length - 1; j > 0; j--) {
            swap(a, 0, j);
            adjustHeap(a, 0, j - 1);
        }
    }

    private static void adjustHeap(int[] a, int i, int last) {
        int temp = a[i];

        //从左节点开始不断比较，找i的最牛逼孩子。
        //  k 表示 i 的最大孩子。 k首先指向左节点。左孩子是 2*i +1
        for (int k = 2 * i + 1; k <= last; k = 2 * k + 1) {
            //比较俩孩子谁更牛。
            if (k + 1 <= last && a[k] < a[k + 1]) {
                k++; //说明右节点更牛。k指右
            }

            //最牛的孩子比我牛。
            if (a[k] > temp) {
                a[i] = a[k];
                i = k;
//                进入下一次for ， 看看牛逼儿子的儿子是不是比我牛。
            } else
                //当我的孩子不如我的时候，不用比了，孙子肯定不如（默认已经是大顶堆）
                break;
        }

        a[i] = temp;

    }

    /**
     * 交换元素
     */
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
