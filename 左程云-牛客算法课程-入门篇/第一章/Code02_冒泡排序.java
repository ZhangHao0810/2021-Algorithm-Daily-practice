package 第一章;

/**
 * @author Super-Zhang
 * @date 2021-07-28 11:32
 *
 * 时间复杂度：O(n^2)
 */
public class Code02_冒泡排序 {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    //交換ij位置上的值。 可以用这个方法，
    // 但要保证 i 和 j 不相等，自己跟自己异或，内容会被置为0
    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
