import java.util.Arrays;

/**
 * 普通优化快排
 * <p>
 * 优化：为防止在近乎有序的数组，partition分割极度不平衡，可将v元素随机化选取
 *
 * @author Super-Zhang
 * @date 2021-09-11 7:18
 */
public class Quick_Sort1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {

        if (l >= r) return; // 这里要有跳出递归的判断，否则StackOverflow

        int mid = getMiddle(arr, l, r);
        quickSort(arr, l, mid - 1);
        quickSort(arr, mid + 1, r);
    }

    /**
     * 始终保证  [l+1,p] 是 小于 e 的。
     */
    private static int getMiddle(int[] arr, int l, int r) {
        swap(arr, l, l + (int) (Math.random() * (r - l))); // 这句就是针对近乎有序数组的快排优化，加上随机数，防止快排退化为O（n^2）

        int e = arr[l];
        int p = l;

        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < e) {
                swap(arr, p + 1, i);
                p++;
            }
        }
        swap(arr, l, p);

        return p;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
