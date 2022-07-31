

/**
 * @author Super-Zhang
 * @date 2021-06-29 20:10
 * <p>
 * 剑指offer:
 * 将⼀个字符串转换成⼀个整数(实现Integer.valueOf(string)的功能，但是string不
 * 符合数字要求时返回0)，要求不能使⽤字符串转换整数的库函数。数值为0或者字符串不是
 * ⼀个合法的数值则返回0
 * <p>
 * <p>
 * Character.isDigit(char)⽅法判断是否是数字，是返回True，否则False
 *
 * 其实真的不难，一定要把思路捋顺了！
 */
public class 将字符串转换成整数 {

    public static int strToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();

//       判断符号位
        int flag = 0;
        if (chars[0] == '+') {
            flag = 1;
        } else if (chars[0] == '-') {
            flag = 2;
        }

        int start = flag > 0 ? 1 : 0;
        int res = 0;

        for (int i = start; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                int temp = chars[i] - '0';
                res = res * 10 + temp;
            } else
                return 0;
        }

        return flag == 2 ? -res : res;
    }
}
