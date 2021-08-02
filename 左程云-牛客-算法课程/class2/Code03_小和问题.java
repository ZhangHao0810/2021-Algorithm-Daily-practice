package class2;

/**
 * @author Super-Zhang
 * @date 2021-08-02 10:42
 * <p>
 * 数组中每一个数左边比当前数小的数累加起来，叫做这个数组的小和。
 * <p>
 * 利用归并排序，可以降低时间复杂度。
 *
 * 转换思路，当前数右侧比它大的数，累加。
 */
public class Code03_小和问题 {

    public static int smallSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        return Process(arr, 0, arr.length - 1);
    }

    //排好序的同时，求小和。
    public static int Process(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = l + (r - l) / 2;
        return Process(arr, l, mid) +
                Process(arr, mid + 1, r) +
                merge(arr, l, mid, r);
    }


    public static int merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        int res=0;
        while (p1 <= M && p2 <= R) {
            // 这一句，得到了在merge的同时产生的小和。
            res += arr[p1] < arr[p2] ?(R-p2+1) * arr[p1] : 0;

            help[i++] = arr[p1] <= p2 ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 >= R) {
            help[i++] = arr[p2++];
        }

        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
        return res;
    }
}
