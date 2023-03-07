package Q03_数组中重复的数字;

/**
 * @author ZhangHao
 * @date 2020/2/16 19:46
 * @Description： 循环实现二分查找
 * 非常重要,二分查找会了,便于理解很多的算法.
 */
public class 补充_Java二分查找 {

    public static int binarySort(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (end + start) >> 1;
            if (key < array[mid]) {
                start = mid - 1;
            } else if (key > array[mid]) {
                end = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
