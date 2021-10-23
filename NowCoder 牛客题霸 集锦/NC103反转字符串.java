/**
 * @author Super-Zhang
 * @date 2021-07-04 22:06
 * <p>
 * 给定一个字符串，输出字符串反转后的串。 串长度不超过1000；
 */
public class NC103反转字符串 {

    public static void main(String[] args) {
        String str = "abcdefg";

        String ans = getConvertString(str);
        ans = solutionByNC1(str);

        System.out.println(ans);

    }




    /**
     * 牛客方案1： 原地交换。最减资源。操作次数最少。O（n)
     *
     * @param str
     * @return
     */
    private static String solutionByNC1(String str) {
        char[] chars = str.toCharArray();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            char t = chars[i];
            chars[i] = chars[len - 1 - i];
            chars[len - 1 - i] = t;
        }
        return new String(chars);

    }

    /**
     * 牛客方案2： 调用库函数， 我醉了啊。  怎么没想到用revers。
     * @param str
     * @return
     */
    public static String solutionByNC2(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    /**
     * 我的方案:使用StringBuilder来做
     *
     * @param str
     * @return
     */
    private static String getConvertString(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }
}
