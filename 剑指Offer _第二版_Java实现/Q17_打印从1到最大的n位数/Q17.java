package Q17_打印从1到最大的n位数;

/**
 * @author ZhangHao
 * @date 2020/3/1 15:14
 * @Description： 面试官没有贵点n的范围, 所以n可能是很大的, 溢出int. 常规的数学解法不合适
 * 可以考虑利用字符串的特性.
 * <p>
 * 因为n可能会非常大,所以不能直接用int表示,用字符串的思想. 也就是char数组进行存储.
 */
public class Q17 {

    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
//       char[] number 就相当于缺槽, 活字印刷你懂得.
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    /**
     * 2020/3/1 15:18
     * 使用回溯法得到所有的数. 所有的数其实就是n位数字的全排列, 每一位都经历了0-9  递归.
     * digit digit表示槽位号.
     */
    private void print1ToMaxOfNDigits(char[] number, int digit) {
//        槽位填满之后,格式化输出.
        if (digit == number.length) {
            printNumber(number);
            return;
        }

        for (int i = 0; i < 10; i++) {
// 每一位都有可能是0~9的任意一个数字,给这个槽位赋值上0~9
            number[digit] = (char) (i + '0');
            //i 是int直接存在char中是i号Ascii码字符, 加上 '0' 的Ascii之后,才是存储在char的i字符.

//            开启下一个槽位
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    /**
     * 2020/3/1 15:37
     * 格式化输出一个数字, 不输出数字前面的0
     */
    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }
}
