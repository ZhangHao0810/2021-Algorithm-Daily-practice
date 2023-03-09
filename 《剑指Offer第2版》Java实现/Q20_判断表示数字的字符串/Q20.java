package Q20_判断表示数字的字符串;

/**
 * @author ZhangHao
 * @date 2020/3/4 13:44
 * @Description：  考察使用正则表达式进行匹配。
 *
 * true
 *
 * "+100"
 * "5e2"
 * "-123"
 * "3.1416"
 * "-1E-16"
 *
 * false
 *
 * "12e"
 * "1a3.14"
 * "1.2.3"
 * "+-5"
 * "12e+4.3"
 */
public class Q20 {

    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}
