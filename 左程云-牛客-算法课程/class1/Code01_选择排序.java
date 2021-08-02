package class1;

/**
 * @author Super-Zhang
 * @date 2021-07-28 11:23
 *
 * 选择排序思想： 选择全部元素中最小的，放在前头。 循环。
 * 和冒泡相比，需要格外设一个变量保存最小元素的索引位置。
 *
 * 时间复杂度：O(n^2)
 */
public class Code01_选择排序 {

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int head = 0; head < arr.length; head++) {
            int minIndex = head;
            for (int j = head; j < arr.length; j++) {
                minIndex = arr[j]<arr[minIndex] ? j : minIndex;
            }
            swap(arr,head,minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
