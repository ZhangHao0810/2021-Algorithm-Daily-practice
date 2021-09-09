package 第一章;

/**
 * @author Super-Zhang
 * @date 2021-07-28 11:57
 * <p>
 * 1： 数组中，有一个数出现了奇数次，其余出现了偶数次。找这个奇数次的数。
 * 2： 数组中，有两种数出现了奇数次，其余出现了偶数次，找这两个数。
 */
public class Code03_找出现奇数次的数 {

    /**
     * a ^ a = 0
     * 0 ^ b = b
     * a ^ a ^ b = b
     * @param arr
     */
    public static void pritOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int cur : arr) {
            eor ^= cur;
        }
        System.out.println(eor);
    }

    /**
     *
     * @param arr
     */
    public static void printOddTimesNum2(int[] arr) {
        int eor=0,onlyOne=0;
        for (int cur : arr) {
            eor ^= cur;
        }
        // eor = a ^ b
        // 因为 a != b , 故 eor != 0
        // eor 中必然有一个位置是1， 故利用这个1 将原数组分成两份。
        int rightOne=eor & (~eor +1); //提取出最右边的1

        for (int cur : arr) {
            if((cur & rightOne)==0)// & 相等 1 ， 不等 0  进入if 的 cur 是两份中的一分。
                onlyOne ^= cur;
        }

        //onlyOne 就是 a 或者 b。
        System.out.println(onlyOne+" "+ (eor ^ onlyOne));
    }

}
