

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-06-29 10:05
 *
 * LeetCode:
 * 编写⼀个函数来查找字符串数组中的最⻓公共前缀。如果不存在公共前缀，返回空字符串""。
 *
 * 不要被吓倒， 要的是整个字符串数组的公共前缀。
 *
 * Null 和 "" 的区别：
 * Null没有地址， ""有地址，但地址内容是空。
 *
 * 显然，如果能够在某对象上调用toString()，则该对象显然不为空。
 * 否则，会有NullPointerException。
 */
public class 最长公共前缀 {

    private static String getprefix(String[] strs) {

        StringBuilder res = new StringBuilder();

        Arrays.sort(strs);

        int m = strs[0].length();
        int n = strs[strs.length - 1].length();
        int num = Math.min(m, n);

        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                res.append(strs[0].charAt(i));
            } else
                break;
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"ustomer", "car", "cat"};

        System.out.println(最长公共前缀.getprefix(strs));// c
    }
}
