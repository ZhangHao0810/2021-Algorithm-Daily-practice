

import java.util.HashSet;

/**
 * @author Super-Zhang
 * @date 2021-06-29 10:22
 * <p>
 * LeetCode:
 * 给定⼀个包含⼤写字⺟和⼩写字⺟的字符串，找到通过这些字⺟构造成的最⻓的回⽂串。返回长度。
 * 在构造过程中，请注意区分⼤⼩写。⽐如"Aa" 不能当做⼀个回⽂字符串。注
 * 意:假设字符串的⻓度不会超过1010。
 * <p>
 * 输⼊:
 * "abccccdd"
 * 输出:
 * 7
 * 解释:
 * 我们可以构造的最⻓的回⽂串是"dccaccd", 它的⻓度是7。
 * <p>
 * <p>
 * 什么样的才能构成回文串呢？
 * 双数，每个字符出现两次。
 * 单数，出现两次的字符+一个只出现一次的字符
 */
public class 回文串_构造最长回文串 {

    public int longestPalindrome(String s) {

        if (s == null) {
            return 0;
        }

        HashSet<Character> hashSet = new HashSet<>();

        char[] chars = s.toCharArray();

        int count = 0;
        for (char aChar : chars) {
            if (!hashSet.contains(aChar)) {
                hashSet.add(aChar);
            } else {
                hashSet.remove(aChar);
                count++;
            }
        }

        return hashSet.isEmpty() ? count * 2 : count * 2 + 1;

    }

}
