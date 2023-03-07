import java.util.Arrays;

/**
 * 三路快排
 * <p>
 * 当存在大量重复元素时，三路快排比双路快排更快
 *
 * @author Super-Zhang
 * @date 2021-09-11 8:17
 * <p>
 * 三路快排可以直接在递归函数 quickSort里进行排序。
 */
public class Quick_Sort3 {

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};

        System.out.println("初始值：" + Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println("\n排序后：" + Arrays.toString(a));
    }

    // 每次递归，保证  lt 是小于区间的最右元素。 gt 是大于区间的最左元素。
    // [l,lt] 是小于区间， [lt+1,gt-1] 是等于区间，[gt,r] 是大于区间。
    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        swap(arr, l, l + (int) (Math.random() * (r - l)));
        int key = arr[l];
        int lt = l, gt = r + 1, i = l + 1;

        while (i < gt) {
            if (arr[i] < key) {
                swap(arr, i, lt + 1);
                i++;
                lt++;
            } else if (arr[i] > key) {
                swap(arr, i, gt - 1);
                gt--;
            } else i++;
        }
        swap(arr, l, lt);

        quickSort(arr, l, lt - 1);
        quickSort(arr, gt, r);

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
