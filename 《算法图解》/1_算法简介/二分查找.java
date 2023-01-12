/**
 * @Author: zh
 * @Date: 2023-01-12-14:00
 * @Description: 在已排好序的数列中进行查找。 O(log n), 远远快于 简单查找 O(n)
 */
public class 二分查找 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 6, 7, 9, 13, 25};
        System.out.println(binary_search(arr, 9));
    }

    /**
     * @description 二分查找函数
     * 接受一个有序数组和一个元素，如果指定的元素包含在数组中，函数将返回其位置。
     * 找到mid值，两边夹逼，mid加1
     * @author zh
     * @data 2023/1/12
     */
    static Integer binary_search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) return mid;

            if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
