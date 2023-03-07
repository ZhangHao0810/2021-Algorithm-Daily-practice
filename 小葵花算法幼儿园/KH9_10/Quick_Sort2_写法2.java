import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-09-11 8:10
 */
public class Quick_Sort2_写法2 {
    public static void main(String[] args) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};

        System.out.println("初始值：" + Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println("\n排序后：" + Arrays.toString(a));
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) { //如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle = getMiddle(a, low, high);
            quickSort(a, low, middle - 1);          //递归对低子表递归排序
            quickSort(a, middle + 1, high);        //递归对高子表递归排序
        }
    }

    private static int getMiddle(int[] a, int left, int right) {
        int key = a[left];//将基准（left）元素暂存 或者说将left元素拿出来，让left空着。
//        a[left]= 0;
        while (left < right) {
//            从右开始找比基准元素小的数。
            while (left < right && a[right] >= key) {
                right--;//移动标志，最终定位比基准小的元素。
            }
//            right 元素小于基准元素了。所以该将其放在基准元素的左边
//            怎么放呢？ a[left]当做是空，所以放在left即可。
            a[left] = a[right];
//          a[right]= 0; //将right位置置为空。

            //这个时候 还未移动left指针。
//            从left开始找比基准元素大的数，将其放在基准元素的右边。
//        放在右边怎么放呢？ 刚才right空了一个位置，就放在right的位置即可。
            while (left < right && a[left] <= key) {//从left开始找比基准大的，
                left++;
            }
            a[right] = a[left];
//            a[left]= 0;
        }

//        到最后会有一个位置被空出来，这就是基准元素的位置。放上去即可。
        //此时【left=right】是基准元素该在的位置
        a[left] = key;  // key 并没有一直在交换，全程没有交换操作，只有赋值操作，比较牛。
        return left;

    }
}
