package _02插入排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-05 9:49
 * <p>
 * 自己编 。反复练习。
 */
public class Straight_Insertion_Sort自测 {

    public static void main(String[] args) {

        int[] ints = {6, 5, 4, 3, 2, 1, 7, 8, 9, 5, 34, 2, 1,};
        int temp, k;


//        简化写法：
        for (int i = 1; i <ints.length; i++) {

            for (k = i - 1; k >= 0; k--) {
                if (ints[k] > ints[k + 1]) {
                    temp = ints[k];
                    ints[k]  = ints[k+1];
                    ints[k+1] = temp;
                }else
                    break;
            }

            System.out.println(Arrays.toString(ints));

        }

//        for (int i = 1; i < ints.length; i++) {
//
//            temp = ints[i];
//
//            //内层循环的逻辑一定要搞清楚。
//            for (k = i; k > 0; k--) {
//                if (ints[k - 1] > temp) {
//
//                    ints[k] = ints[k - 1];
//
//                    if (k == 1) {
//                        ints[k - 1] = temp;
//                    }
//
//                } else {
//                    ints[k] = temp;
//                    break;
//                }
//            }
//            System.out.println(Arrays.toString(ints));
//        }
        System.out.println(Arrays.toString(ints));
    }

}
