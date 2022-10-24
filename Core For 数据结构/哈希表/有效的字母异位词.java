

import java.util.*;

/**
 * @author Super-Zhang
 * @date 2021-05-13 19:06
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *     输入: s = "anagram", t = "nagaram"
 *     输出: true
 *
 * 示例 2:
 *
 *     输入: s = "rat", t = "car"
 *     输出: false
 */
public class 有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        if (ss.length != tt.length)
            return false;
        //key:字母  value：key出现的次数。
        Map<Character, Integer> map = new HashMap<>();
        for (char temp : ss) {
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        for (char temp : tt) {
            if (!(map.containsKey(temp))) {
                return false;
            } else {
                map.put(temp, map.get(temp) - 1);
                if (map.get(temp) == 0) {
                    map.remove(temp);
                }
            }
        }
        return true;
    }

}
