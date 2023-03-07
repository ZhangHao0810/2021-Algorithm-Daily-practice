/**
 * @author ZhangHao
 * @date 2020/5/28 21:44
 * @Description： 给定一个字符串S  找出s中最长的回文子串.
 */
public class 最长回文子串 {

    /** 2020/6/9 16:50
     * 方法体今日编辑
    */
//    len是子串的长度. index是回文子串的索引.
    private int index, len;

    public String longestPalindrome(String s) {
//        如果s长度小于2 返回s.
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
//            s.length 是奇数的情况,
            palindromeHelper(s, i, i);
//            s.length 是偶数的情况.
            palindromeHelper(s, i, i + 1);
        }
//        找到回文子串,返回[index : len]
        return s.substring(index, index + len);
    }

//    搜索最长回文子串. 以l 和 r 作为两个指针, 往两边扩.
    private void palindromeHelper(String s, int l, int r) {
//        关键: 如果左边的值等于右边的值,则满足条件, 尝试再扩一下. 再次判断.
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
//        len是记录好的最长子串的长度, 全局变量. r - l - 2 是检测出来的回文子串的长度, -2是因为跳出while时候 l--; r++;            r++;
//        如果len比这次检测出来的长度要小, 就重新记录一下len和index
        if (len < r - l - 2) {
//            跳出while之后, l是-- 的,所以要加回来.
            index = l + 1;
//            长度是r和l的差, 因为r++ 了 所以要-1
            len = r - l - 1;
        }
    }
}
