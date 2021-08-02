package class2;

/**
 * @author Super-Zhang
 * @date 2021-08-02 10:07
 *  左侧排好序，右侧排好序，最后整合。
 *
 *   时间复杂度： O( N*logN ) ， 额外最大空间复杂度 O（N）
 *   归并排序没有浪费大量的比较。比较行为没有被浪费，变成了整体有序的部分。
 */
public class Code02_归并排序 {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return ;
        }
        process(arr, 0, arr.length - 1);
    }


    public static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L+(R-L)/2;  // 1,2,3   mid 是 2. 左侧为 1,2  右侧为 3
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i=0;
        int p1=L;
        int p2=M+1;
        while (p1 <= M && p2 >= R) { //吊哦
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
    }

}
