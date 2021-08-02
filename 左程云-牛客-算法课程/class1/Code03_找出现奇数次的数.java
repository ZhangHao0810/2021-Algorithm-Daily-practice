package class1;

/**
 * @author Super-Zhang
 * @date 2021-07-28 11:57
 * <p>
 * 1： 数组中，有一个数出现了奇数次，其余出现了偶数次。找这个奇数次的数。
 * 2： 数组中，有两种数出现了奇数次，其余出现了偶数次，找这两个数。
 */
public class Code03_找出现奇数次的数 {

    public static void pritOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int cur : arr) {
            eor ^= cur;
        }
        System.out.println(eor);
    }

    public static void printOddTimesNum2(int[] arr) {
        int eor=0,onlyOne=0;
        for (int cur : arr) {
            eor ^= cur;
        }
        // eor = a ^ b
        // eor != 0
        // eor 中必然有一个位置是1
        int rightOne=eor & (~eor +1); //提取出最右边的1

        for (int cur : arr) {
            if((cur & rightOne)==0)//这里等于1也行。因为a和b 有一个是1，有一个是0
                onlyOne ^= cur;
        }
        //onlyOne 就是 a 或者 b。
        System.out.println(onlyOne+" "+ (eor^ onlyOne));
    }

}
