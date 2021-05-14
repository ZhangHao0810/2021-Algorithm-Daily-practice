package 排序.选择排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 14:33
 * <p>
 * 利用指针来做！
 */
public class Simple_Selection_Sort_2自测 {

    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        System.out.println("初始值：" + Arrays.toString(a));
        select_Sort(a);
        System.out.println("\n排序后：" + Arrays.toString(a));
    }

    private static void select_Sort(int[] a) {
        int i, min, max;
        int left = 0, right = a.length - 1;

        while (left < right) {
            min = left;
            max = right;

            for (i = left; i < right; i++) {
                if (a[i] > a[max]) {
                    max=i;
                }
                if (a[i] < a[min]) {
                    min=i;
                }
            }

//            将最小值放在最左边。
            swap(a, left, min);//其实这一步的时候，min在left的右边。

//            不懂的话，真的举个例子即可  7，3，6 排序  看看left min max  right分别怎么指的就知道了。
//            在理解的基础上背诵。多写，熟能生巧。每隔一段时间都要敲上一遍八个排序算法。
            if (left == max) { //因为min在left的右边，所以min在max的右边，所以要将max放在正确的位置上。
               max=min;
            }
            swap(a,right,max);//此时再交换max和right就没问题了。

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
