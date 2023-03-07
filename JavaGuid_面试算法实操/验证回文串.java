/**
 * @author ZhangHao
 * @date 2020/5/26 23:15
 * @Description： 验证给定的字符串是否是回文串, 只考虑字母和数字, 可以忽略字母的大小
 * 说明: 空字符串定义为有效的字符串.
 */
public class 验证回文串 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        //取得头尾的插旗.从头尾开始向中间遍历.
        int l = 0, r = s.length() - 1;
        while (l < r) {
            ////字符不是字母和数字的情况
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            //字符不是字母和数字的情况
            else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            } else {
                //判断二者是否相等.
                if (Character.toLowerCase(s.charAt(l)) !=
                        Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
            }
            l++;
            r--;
        }
        return true;
    }
}
