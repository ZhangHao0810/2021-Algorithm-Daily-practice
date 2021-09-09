package _03选择排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 12:33
 */
public class Simple_Selection_Sort_1自测 {

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        System.out.println("初始值：" + Arrays.toString(a));
        selectSort(a);
        System.out.println("\n排序后：" + Arrays.toString(a));
    }

    private static void selectSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int k=i;

            for (int j = i; j < a.length; j++) {
                if (a[j] > a[k]) {
                    k=j;
                }
            }

            swap(a,k,i);
        }
    }

    private static void swap(int[] data, int i, int j) {
        if (i != j) {
            int temp;

            temp = data[i];
            data[i] = data[j];
            data[j] = temp;

        }
    }
}
