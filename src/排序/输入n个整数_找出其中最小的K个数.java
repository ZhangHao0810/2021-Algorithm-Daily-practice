package 排序;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-08 8:48
 * 就是排序，取前k个值。
 * <p>
 * 推排序 时间复杂度 O(nlogk)
 * 将前k个元素（0 ~ k-1)构建大顶堆。
 * 从k开始依次比较堆顶元素  比堆顶元素大，不放入。小的话就置换堆，重建堆。
 * 最后的那个堆就是前k个最小值了。
 */
public class 输入n个整数_找出其中最小的K个数 {

    public static void main(String[] args) {

        int k = 4;

        int[] arr1 = {7, 6, 7, 11, 5, 12, 3, 0, 1};
        System.out.println("排序前：" + Arrays.toString(arr1));

        System.out.println("排序后：" + sort1(arr1, k).toString());

        int[] arr2 = {25, 6, 32, 11, 8, 12, 7, 0, 75};
        System.out.println("排序前：" + Arrays.toString(arr2));

        System.out.println("排序前：" + Arrays.toString(sort2(arr2, k)));
    }

    /**
     * 当可以修改数组时，利用快排思想  排一次，就把基准值的左右大小顺序确定！
     * 将基准值放在k的位置，这样【0- k-1】 就小于右边所有的了。
     * 时间复杂度O(k*n) 当k<<<n时，约等于O(n)
     * 【这种方法更好，因为用了快排，输出值是有序的。】
     * @param input
     * @param k
     * @return output
     */
    private static int[] sort2(int[] input, int k) {

        int[] output = new int[k];

        while (input == null|| k<=0||k>input.length)
            return output;

        int start =0;
        int end = input.length-1;
        int index = partition(input, start, end);

        //筛选到index=k-1 就能保证index左边都比 index和它右边 的小。
        while (index != k - 1) {
            if (index < k - 1) {
                start = index+1; //前面筛选不够，继续筛选
            }else {
                end = index-1;
            }
            index = partition(input, start, end);
        }

        System.arraycopy(input, 0, output,0,output.length);
        return output;
    }

    /**
     * 分区算法(快排，将start放在 比左大，比右小的位置。
     * @param input 输入数组
     * @param start 开始下标
     * @param end   结束下标
     * @return 分区位置
     *
     * 快排 太强了。
     */
    private static int partition(int[] input, int start, int end) {
        int tmp = input[start];

        while (start < end) {
            //找到离start最远的比tmp小的位置（小才跳出循环）。
            while (start < end && input[end] >= tmp) {
                end--;
            }
//            将这个小值覆盖input[start]（就是变相让start右边的小值放在左边了）。
            input[start] = input[end];

            //找到离start最近的比tmp大的位置（大于tmp才跳出循环）
            while (start < end && input[start] <= tmp) {
                start++;
            }
//            将这个大值放在input[end] （变相把刚找到的大值放在刚才小值的位置。
            // 将大值放在end处，end是刚才找到的右边的小值的位置，刚好覆盖。 达成一次 左小右大。
            input[end] = input[start];
        }//当start == end 跳出while循环。

        input[start]=tmp;

        return start;
    }

    /**
     * 不修改输入数组，O(nlogk)
     *
     * @param input
     * @param k
     * @return
     */
    private static ArrayList<Integer> sort1(int[] input, int k) {
        ArrayList<Integer> leastNumbers = new ArrayList<>();
        while (input == null || k <= 0 || k > input.length) {
            return leastNumbers;
        }
        int[] numbers = new int[k];

        System.arraycopy(input, 0, numbers, 0, k);

        //构建堆
        for (int i = k / 2 - 1; i >= 0; i--) {
            adjustHeap(numbers, i, k - 1);
        }
        //交换和调整堆
        for (int i = k; i < input.length; i++) {
            if (input[i] < numbers[0]) {
                numbers[0] = input[i];
                adjustHeap(numbers, 0, k - 1);
            }
        }

        for (int n : numbers) {
            leastNumbers.add(n);
        }

        return leastNumbers;

    }

    //堆的范围 a[heap] - a[end]
    //构建堆的时候，要注意 大顶堆的逻辑。 要有自己的逻辑思考！！ 算法就是逻辑！
    private static void adjustHeap(int[] a, int heap, int end) {

        int temp = a[heap];

//        找堆中比a[i]更小的元素。
        for (int child = heap * 2 + 1; child <= end; child = child * 2 + 1) {

            //拿到兄弟里面牛逼的。
            if (child + 1 <= end && a[child] < a[child + 1])
                child++;

            if (a[child] > temp) {
                a[heap] = a[child];
                heap = child; //移动i指针。
            } else
                break;
        }
        a[heap] = temp;
    }

}
