package 字符串;

/**
 * @author Super-Zhang
 * @date 2021-06-29 16:22
 * <p>
 * LeetCode:
 * 给定⼀个字符串，验证它是否是回⽂串，只考虑字⺟和数字字符，可以忽略字⺟
 * 的⼤⼩写。说明：本题中，我们将空字符串定义为有效的回⽂串。
 * <p>
 * 验证一个字符串是否是回文串，从两边来。
 * <p>
 * Character.isLetterOrDigit(char c) 可以判断一个字符是否是字母或数字！！
 * Character.toLowerCase(char c)  当不区分大小写时，用这个！
 * <p>
 * char本来就是ACSII码，实质上就是数字，数字怎么比较他就怎么比较，直接==；
 */
public class 回文串_验证回文串 {

    public boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true;
        }

        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(str.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(str.charAt(r))) {
                r--;
            } else {
                if (Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r)))
                    return false;
                l++;
                r--;
            }

        }
        return true;
    }
}
