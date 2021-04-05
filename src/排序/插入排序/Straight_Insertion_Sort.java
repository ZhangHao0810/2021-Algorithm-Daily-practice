package 排序.插入排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 9:24
 * <p>
 * 插入排序 ： 将记录插入到已排好序的表中。
 * <p>
 * [直接插入排序] ：设立哨兵，作为临时存储和判断数组边界之用
 * <p>
 * 时间复杂度 O(n^2) ， 正序 直接插入排序为倒叙，n^2
 * 空间复杂度 只需要两个变量暂存当前数和下标，与n无关。O(1)
 */
public class Straight_Insertion_Sort {

    public static void main(String[] args) {
        int[] n = {20, 12, 15, 1, 5, 49, 58, 24, 578, 211, 20, 214, 78, 35, 125, 789, 11};

        int temp;//待排序的当前数。
        int k; //下标。(这里k 提出来可以防止反复生成与销毁。）


//
//        //        简化写法：
//        for (int i = 1; i <ints.length; i++) {
//
//            for (k = i - 1; k >= 0; k--) {
//                if (ints[k] > ints[k + 1]) {
//                    temp = ints[k];
//                    ints[k]  = ints[k+1];
//                    ints[k+1] = temp;
//                }else
//                  break;
//            }
//
//            System.out.println(Arrays.toString(ints));
//
//        }


        //默认0位置是有序序列，从1位置开始。
        for (int i = 1; i < n.length; i++) {
//            将该数暂存
            temp = n[i];

            //内层对已经排序过的部分进行遍历。
            for (k = i; k > 0; k--) {
//                如果碰到比暂存数大的。
                if (n[k - 1] > temp) {
                    //将k-1的数覆盖到k位置。
                    n[k] = n[k - 1];

                    //向右移动后，如果k=1，将当前数放在首位。
                    if (k == 1) {
                        n[k - 1] = temp;
                        break;
                    }
                }
                //如果不大于，将当前数放到k位置(这里的k位置是上一层的k-1位置），结束。
                else {
                    n[k] = temp;
                    break;
                }
            }
            System.out.println(Arrays.toString(n));
        }
        System.out.println(Arrays.toString(n));

    }
}
