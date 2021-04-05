package 排序.插入排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 11:52
 */
public class Shell_Sort自测 {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 6, 3, 8, 33, 27, 66, 9, 7, 88};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int temp = 0;
        int i, k;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            System.out.println(Arrays.toString(arr));

            for (i = gap; i < arr.length; i++) {

                for (k = i - gap; k >= 0; k -= gap) {

                    if (arr[k] > arr[k + gap]) {// 注意这里是k和k+gap比，不是和k+1比
                        swap(arr, k, k + gap, temp);
                    } else {
                        break;
                    }
                }
            }

        }
    }

    private static void swap(int[] arr, int i, int j, int temp) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
