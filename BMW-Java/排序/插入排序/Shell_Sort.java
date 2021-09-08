package 排序.插入排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 10:00
 * <p>
 * 希尔排序。
 * 相对直接排序有大的改进  缩小增量排序。
 * <p>
 * 时间复杂度：最坏 O(n^2)  最好 O(n)  平均 O(n^1.3)
 * 空间复杂度： O（1）
 * <p>
 * 增量因子除1外没有公因子。
 * 希尔排序是不稳定的排序方法。
 * <p>
 * 直接插入排序和希尔排序的比较：
 * 直接插入排序是稳定的；而希尔排序是不稳定的。
 * 直接插入排序更适合于原始记录基本有序的集合。
 * 希尔排序的比较次数和移动次数都要比直接插入排序少，当N越大时，效果越明显。
 * 在希尔排序中，增量序列gap的取法必须满足：最后一个步长必须是 1 。
 * 直接插入排序也适用于链式存储结构；希尔排序不适用于链式结构。
 */
public class Shell_Sort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 6, 3, 8, 33, 27, 66, 9, 7, 88};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int temp;

//        1层循环控制增量序列，最后一个步长必须为1. 为原序列分组，分组之后对组内进行直接排序。
//        最开始的循环，每组只有俩元素。 随着循环次数增加，组内元素变多，分组数减少。
//          间隙数=分组数
        for (int gap = arr.length / 2; gap >0; gap /= 2) {//每循环一次 缩小一下增量。

//            2层循环根据增量序列定位分组的最后一个位置，每循环一次，进入下一个分组。
//            第二层和第三层实际上是直接插入排序。
//               只不过直接插入排序的第一个for是移动待插入的元素，这里的for是移动到下一个分组的待插入元素。
            for (int j = gap; j < arr.length; j++) {

//                3层，组内从最后一个位置 依次向前执行插入排序中的插入操作。
                for (int k = j - gap; k >= 0; k -= gap) {
                    if (arr[k] > arr[k + gap]) {  //插入排序并不是打牌，摸完之后只插一次，而是换换换
                        temp = arr[k];
                        arr[k] = arr[k + gap];
                        arr[k + gap] = temp;
                    }else
                        break;
                }
            }
        }
    }
}
