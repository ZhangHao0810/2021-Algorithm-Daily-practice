package 排序.选择排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 12:41
 * <p>
 * 【简单选择排序的改进——二元选择排序：】
 * <p>
 * 简单选择排序，每趟循环只能确定一个元素排序后的定位。我
 * 们可以考虑改进为每趟循环确定两个元素（当前趟最大和最小记录）的位置,从而减少排序所需的循环次数。
 * 改进后对n个数据进行排序，最多只需进行[n/2]趟循环即可。
 * 即每趟确定两个元素，当前趟最小往前排，当前趟最大值往后排
 */
public class Simple_Selection_Sort_2 {

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        System.out.println("初始值：" + Arrays.toString(a));
        select_Sort(a);
        System.out.println("\n排序后：" + Arrays.toString(a));
    }

    /**
     * 用指针的思路来做，这才更容易理解！！！！！！！
     *
     * @param a
     */
    private static void select_Sort(int a[]) {

        int i, min, max;

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            // 做不超过n/2趟选择排序
            min = left;
            max = right; //分别记录最大和最小关键字记录位置

            for (i = left; i <= right; i++) {
                //因为每一次外循环结束，都是往两边凑的。所以这里 j<r.length-i
                if (a[i] > a[max]) {
                    max = i;
                }
                if (a[i] < a[min]) {
                    min = i;
                }
            }

            //最大最小值交换，当前趟最小往前排，当前趟最大值往后排
            swap(a, left, min);
            System.out.println("min 换后" + Arrays.toString(a));

            if (left == max) {
                max = min;
            }

            swap(a, right, max);
            System.out.println("max 换后" + Arrays.toString(a));

            left++;
            right--;
        }

    }

    private static void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
}
