package class1;

/**
 * @author Super-Zhang
 * @date 2021-07-28 12:10
 * <p>
 * 保证前面有序，将后面的往已排序的部分插入。
 * <p>
 * 打扑克，摸牌的过程就是插入排序。
 * <p>
 * 插入排序 时间复杂度：O(n^2)    最好 O(n) 最差 O(n^2)
 * <p>
 * 插入排序比选择和冒泡排序好一些，当输入中带有顺序的时候，会减少遍历的次数。
 */
public class Code04_插入排序 {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        //只有一张牌时不用看。
        for (int i = 1; i < arr.length; i++) {// 0~i范围上做到有序。

            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) { //当前数i 一直往前换，直到不能换了停。
                // 0~i-1 已经是有序的了，j+1 位置的数一直是 i。 j是当前数i的前一个数。
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
