import java.util.HashSet;

/**
 * @author ZhangHao
 * @date 2020/5/26 23:04
 * @Description： 拼接给定字符串的字符, 构造最长回文串
 *  回文串即 正读反读一样的字符串.
 *
 *      分析回文串的样式:  同样的字符左右各一个, 然后可能中间再有一个单独的.
 *      所以 字符出现次数为双数的组合,
 *           字符出现次数为双数的组合+一个只出现了一次的字符.
 */
public class 最长回文串 {
    public int longestLindrome(String s) {
        if (s.length() == 0) {
            return 0;
        }
        //用HashSet存放字符.
        HashSet<Character> characters = new HashSet<Character>();
        //将字符串的字符取出来放到数组中.
        char[] chars=s.toCharArray();
        int count=0;
        for (char aChar : chars) {
            //如果HashSet中没有该字符就放进去.
            if (!characters.contains(aChar)) {
                characters.add(aChar);
            } else {
                //如果有该字符,就说明找到了一个成对的字符(count++) 然后将该字符移出.
                characters.remove(aChar);
                count++;
            }
        }
        //返回两种可能性, 双数对称 或者是 双数+中单
        return characters.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
