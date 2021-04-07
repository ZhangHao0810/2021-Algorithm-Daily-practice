package 排序.归并排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-07 9:57
 */
public class Merge_Sort自测 {

    public static void main(String[] args) {
        int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        mergeSort(data);
        System.out.println("排序后的数组："+Arrays.toString(data));
    }

    private static void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private static void sort(int[] data, int left, int right) {

        // 这里是一定要加上的，防止溢出！！！！
        if (left>=right)
            return;

        int center = (left+right)/2;

        sort(data, left, center);
        sort(data, center + 1, right);

        merge(data, left, center, right);
        System.out.println("这趟归并结束，结果是："+Arrays.toString(data));
    }

    private static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        //记录临时数组索引。
        int tmpArrIndex=left;

        //这是更容易理解的一个写法，因为移动的是两个数组的第一个元素的指针。所以缓存left给tmpL 移动tmpL即可。
        int tmpR =center+1;
        int tmpL = left;

        while (tmpL <= center && tmpR <= right) {
            if (data[tmpL] <= data[tmpR]) {
                tmpArr[tmpArrIndex++] = data[tmpL++];
            } else {
                tmpArr[tmpArrIndex++] = data[tmpR++];
            }
        }

        while (tmpL <= center) {
            tmpArr[tmpArrIndex++]=data[tmpL++];
        }
        while (tmpR <= right) {
            tmpArr[tmpArrIndex++]=data[tmpR++];
        }
        //最终移动的是待合并的两个数组的第一个元素。

        //将暂存数组拷贝回原数组。
        // （不能让data指向暂存数组，因为 这样原数组没有变，跳出merge之后 sort()的data还是指向原数组。）
        while (left <= right) {
            data[left] = tmpArr[left++];  //这里一定注意，都是left。
        }
    }

}
