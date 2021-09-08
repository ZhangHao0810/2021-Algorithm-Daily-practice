package 排序.交换排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-06 14:59
 *   [快速排序]
 *  基本思想：
 *
 *     选择一个基准元素,通常选择第一个元素或者最后一个元素,
 *     通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小。另一部分记录的 元素值比基准值大。
 *     此时基准元素在其排好序后的正确位置
 *     然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序
 *
 *     快排 O （nlogn）
 *     快排是 不稳定 的排序。
 */
public class Quick_Sort {

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};

        System.out.println("初始值："+Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println("\n排序后："+Arrays.toString(a));
    }

    private static  void quickSort(int[] a,int low, int high) {
        if(low<high){ //如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle=getMiddle(a,low,high);
            quickSort(a,  0,  middle-1);          //递归对低子表递归排序
            quickSort(a,   middle + 1, high);        //递归对高子表递归排序
        }
    }

    /**
     * 一般选取 low 作为基准元素。
     *
     *  喵的 确实有点牛逼。
     * @param a
     * @param left
     * @param right
     * @return
     */
    private static int getMiddle(int[] a, int left, int right){
        int key = a[left];//将基准（left）元素暂存 或者说将left元素拿出来，让left空着。
        a[left]= 0;
        while(left<right){
//            从右开始找比基准元素小的数，将其放在基准元素的左边。
            while(left<right && a[right]>=key){
                right--;//移动标志，最终定位比基准小的元素。
            }
//            right 元素小于基准元素了。所以不该在基准元素的右边，将其放在基准元素的左边
//            放在左边怎么放呢？ a[left]当做是空，所以放在left即可。
            a[left]=a[right];
            //right位置现在是空的了。
            a[right]= 0;

            //这个时候 还未移动left指针。
//            从left开始找比基准元素大的数，将其放在基准元素的右边。
//        放在右边怎么放呢？ 刚才right空了一个位置，就放在right的位置即可。
            while(left<right && a[left]<=key){//从left开始找比基准大的，
                left++;
            }
            a[right]=a[left];
            a[left]= 0;
        }

//        到最后会有一个位置被空出来，这就是基准元素的位置。放上去即可。
        //此时【left=right】是基准元素该在的位置
        a[left]=key;
        return left;

        
    }

}
