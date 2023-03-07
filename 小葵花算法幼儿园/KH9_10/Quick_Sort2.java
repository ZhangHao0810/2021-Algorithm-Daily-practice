import java.util.Arrays;

/**
 * 双路快排
 * <p>
 * 对于有大量重复元素的情况，普通快排会造成partition不平衡的情况，所以，可以考虑使用双路快排。
 * i，j分别从两边向中间靠拢，每次交换i，j时，总是arr[i] >= v，arr[j]<=v的情况，这样就将==v的情况在两边平分
 *
 * @author Super-Zhang
 * @date 2021-09-11 7:56
 */
public class Quick_Sort2 {
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

    /*
     *  只有这里发生了变化。
     */
    private static int getMiddle(int[] arr, int l, int r) {
        swap(arr, l, l + (int) (Math.random() * (r - l)));

        int e = arr[l];

        int i = l + 1, j = r;
        while (true) {
            while (i <= r && arr[i] < e)
                i++;
            while (j >= l + 1 && arr[j] > e)
                j--;
            if (i > j) break;
            swap(arr, i, j);
            i++;
            j--;
        }

        swap(arr, l, j);

        return j;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
