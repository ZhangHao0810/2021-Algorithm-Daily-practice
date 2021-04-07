package 排序.桶排序_基数排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-07 14:25
 */
public class Radix_Sort自测 {

    public static void main(String[] args) {
        int[] array = {3, 2, 3, 2, 5, 333, 45566, 2345678, 78, 990, 12, 432, 56};

        radixSort(array, 10, 7);
        System.out.println("  " + Arrays.toString(array));
    }

    private static void radixSort(int[] array, int radix, int distance) {
//      distance是位数（桶内元素的长度）。radix是进制数（桶的数量）
//      关于桶的深度、桶内元素的顺序 都无需考虑！！！

        int length = array.length;

        int[] temp = new int[length];
        int[] count = new int[radix];  //count[] 存每个桶的元素数。

        int divide = 1;

//        外层循环 ，每次循环对每一位进行排序。由低位到高位。
        for (int i = 0; i < distance; i++) {

            System.arraycopy(array, 0, temp, 0, length);

            Arrays.fill(count, 0);

//            按桶内元素多少对temp分组
            for (int j = 0; j < length; j++) {
                int key = (temp[j] / divide) % radix; //拿到temp[j]divide位子上的值。
                count[key]++;
            }

            for (int j = 1; j < radix; j++) { //这里取不到radix 因为桶号是从1开始，但数组是从0开始
                count[j] = count[j] + count[j - 1];
            }

            //count[0] 指向桶1的首位  count[3] 指向桶4的首位  count[9] 相当于array.length
//            到这里其实找首位比找末位麻烦很多 要多定义变量什么的。干脆倒着来，从末位开始赋值。
            for (int j = length - 1; j >= 0; j--) {
                int key = (temp[j] / divide) % radix;
                count[key]--;
                array[count[key]] = temp[j];
            }

            divide=divide*radix;

        }
    }

}
