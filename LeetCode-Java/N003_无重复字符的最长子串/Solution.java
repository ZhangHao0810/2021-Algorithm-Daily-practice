package N003_无重复字符的最长子串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Super-Zhang
 * @date 2021-05-14 16:22
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {

        /**
         * 用左右指针来做。
         */
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1;
        int ans = 0;
        for (int lk = 0; lk < n; ++lk) {
            // i是左指针。
            //当左指针！=0，则表示开启了一个新串查找。将上一个串的元素移出。
            if (lk != 0) {
                // 左指针向右移动一格，移除刚才左指针指向的元素。
                occ.remove(s.charAt(lk - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 左指针到右指针之间是一个极长的无重复字符子串，返回字串长度。
            ans = Math.max(ans, rk - lk + 1);
        }
        return ans;

    }
}
