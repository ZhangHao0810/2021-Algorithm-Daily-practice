package 第二章;

/**
 * @author Super-Zhang
 * @date 2021-08-02 11:27
 *
 * 把最右边的数放在中间，使得该数左边和右边的所有数满足大于小于逻辑。 依次递归。得到排好序的数组。
 * 时间复杂度：O(NlogN) 空间复杂度：O(N)
 */
public class Code06_快速排序 {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    //arr[l..r]排好序。
    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L + (int) (Math.random() * (R - L + 1)), R); //随机选一个数。
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    //荷兰旗问题。
    // L 当前元素。
    //返回等于区域的左右边界。 res[0],res[1]
    public static int[] partition(int[] arr, int L, int R) {
        int less = L-1; //<区域 右边界
        int more = R; //>区域左边界
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            }else {
                L++;
            }
        }
        swap(arr, more, R);
        return new int[]{less + 1, more};
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
