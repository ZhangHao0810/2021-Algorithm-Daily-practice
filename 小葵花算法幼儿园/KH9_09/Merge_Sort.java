import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-09-10 7:59
 */
public class Merge_Sort {

    private static int count=0;

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};
        mergeSort(arr,0,arr.length-1);
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int left, int right) {

        if (left >= right)
            return;

        int center = left + (right - left) / 2;

        mergeSort(arr, left, center);
        mergeSort(arr, center + 1, right);

        merge(arr, left, center, right);
        count++;
        System.out.println("第" + count + "趟Merge结果：" + Arrays.toString(arr));
    }

    /**
     * @param arr         待排序数组
     * @param left        左数组首元素下标
     * @param leftArrLast 左数组最后元素的下标
     * @param right       右数组最后元素下标
     */
    private static void merge(int[] arr, int left, int leftArrLast, int right) {
        int[] tmpArr = new int[arr.length];
        int rightArrFirst = leftArrLast + 1;
        int tmpArrIndex = left;
        int tmp = left;

        while (left <= leftArrLast && rightArrFirst <= right) {
            if (arr[left] <= arr[rightArrFirst]) {
                tmpArr[tmpArrIndex++] = arr[left++];
            } else {
                tmpArr[tmpArrIndex++] = arr[rightArrFirst++];
            }
        }

        while (rightArrFirst <= right) {
            tmpArr[tmpArrIndex++] = arr[rightArrFirst++];
        }
        while (left <= leftArrLast) {
            tmpArr[tmpArrIndex++] = arr[left++];
        }

        while (tmp <= right) {
            arr[tmp] = tmpArr[tmp++];
        }
    }
}
