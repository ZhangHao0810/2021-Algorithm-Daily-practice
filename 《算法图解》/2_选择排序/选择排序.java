import java.util.Arrays;

/**
 * @Author: zh
 * @Date: 2023-01-17-16:47
 * @Description: 选择排序是最粗糙的排序方式，每次选最大的，放入新数组，再选次大的。最终的时间复杂度为O(n·1/2·n) = O(n^2)
 * <p>
 * 要注意，算法的逻辑复杂程度，与代码的可读性不是一个概念。 一个很简单逻辑的代码，编写起来的可理解性可能并不好。
 * 【永远不要用文科的思路去学习算法】
 */
public class 选择排序 {

    public static void main(String[] args) {
        int[] arr = {23, 123, 22, 424, 1213, 111, 0, 99, 777};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //定位 i 索引应放的值
            int smallest_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest_index]) {
                    smallest_index = j;
                }
            }
            //在外层循环执行一次swap，程序swap的总次数为n
            if (i != smallest_index) {
                int tmp = arr[i];
                arr[i] = arr[smallest_index];
                arr[smallest_index] = tmp;
            }
        }
        return arr;
    }


}
