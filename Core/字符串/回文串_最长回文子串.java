

/**
 * @author Super-Zhang
 * @date 2021-06-29 16:33
 * LeetCode:最⻓回⽂⼦串
 * 给定⼀个字符串s，找到s中最⻓的回⽂⼦串。你可以假设s的最⼤⻓度为1000
 *
 *以一个元素为中心，向左右遍历其他。
 */
public class 回文串_最长回文子串 {

private int index,len;

    public String longestPalindrom(String s) {
        if (s.length() <2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {

            palindromeHelper(s, i, i);//奇数的时候。
            palindromeHelper(s,i,i+1);//偶数的时候。
        }
        return s.substring(index, index + len);
    }

    private void palindromeHelper(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        //r - 1 - l 便是串的长度，在演草纸上演示一下就能出结果。
        // l=0 1 2 3 4=r    串长度 3 = r-l-1
//         l=0 1 2 3=r    串长度 2 = r-l-1
        if (len < r - 1 - l) {
            index=l+1;//因为while中 l-- 了，这里加回去。
            len=r-1-l;
        }
    }

}
