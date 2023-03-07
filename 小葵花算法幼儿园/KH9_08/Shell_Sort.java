import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-09-09 9:22
 */
public class Shell_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 6, 3, 8, 33, 27, 66, 9, 7, 88};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int temp;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int k = i - gap; k >= 0; k -= gap) {
                    if (arr[k] > arr[k + gap]) {
                        temp = arr[k];
                        arr[k] = arr[k + gap];
                        arr[k + gap] = temp;
                    } else break;
                }
            }
        }
    }
}
