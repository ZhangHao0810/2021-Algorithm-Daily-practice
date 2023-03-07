package Q38_字符串的排列;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ZhangHao
 * @date 2020/3/19 12:14
 * @Description： 输入一个字符串，按字典序打印出该字符串中字符的全排列.
 * 例如输入字符串 abc，则打印出由字符 a, b, c 所能排列出来的所有字符串 abc, acb, bac, bca, cab 和 cba。
 * <p>
 * 字符的全排列, 这个算法 在递归函数中多了一个if语句,保证了每一个全排列没有重复字符.
 * 需要问清楚字符串中字符的全排列,假如原字符串有重复的字符,排列的时候是否也允许重复.
 */
public class Q38 {
    private ArrayList<String> ret = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str.length() == 0)
            return ret;
//        将每个字符保存下来.
        char[] chars = str.toCharArray();
//        基本排列一下.
        Arrays.sort(chars);
//
        backtracking(chars, new boolean[chars.length], new StringBuilder());
        return ret;
    }

    private void backtracking(char[] chars, boolean[] hasUsed, StringBuilder s) {
//        得到一个排列.
        if (s.length() == chars.length) {
            ret.add(s.toString());
            return;
        }
//        遍历数组,得到排列.
        for (int i = 0; i < chars.length; i++) {
//            如果i位置用了 转到下一个位置.
            if (hasUsed[i])
                continue;
//           ##   i不是0, i位置元素和前一个位置元素相等,且前一个位置被用了, 就转到下一个位置.
// /* 保证不重复 */
            if (i != 0 && chars[i] == chars[i - 1] && !hasUsed[i - 1])
                continue;
//                启用i位置.
            hasUsed[i] = true;

//            将i位置元素加到StringBuffer
            s.append(chars[i]);

//            递归.
            backtracking(chars, hasUsed, s);

//             删掉当前StringBuffer的最后一个元素.
            s.deleteCharAt(s.length() - 1);

//            解除占用,
            hasUsed[i] = false;
        }
    }
}
