package _01交换排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-06 15:52
 *
 *  只有多敲代码，才能练就真本事。 熟能生巧。
 */
public class Quick_Sort自测 {

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};

        System.out.println("初始值："+Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println("\n排序后："+Arrays.toString(a));
    }

    private static void quickSort(int[] a, int left, int right) {
        if (left<right){ //要记住这个if。
            int mid = getmid(a, left, right);
            quickSort(a, 0, mid);
            quickSort(a, mid+1, right);//【这里一定要记住 是mid+1】
        }

    }

    // 快排的核心就是基准元素。
    private static int getmid(int[] a, int left, int right) {
        int key = a[left];

        while (left < right) {
            while (left < right && a[right] >= key) {
                right--;
            }
            a[left] = a[right];

            while (left < right && a[left] <= key) {
                left++;
            }
            a[right] = a[left];
        }

        a[left]=key;
        return left;
    }


}
