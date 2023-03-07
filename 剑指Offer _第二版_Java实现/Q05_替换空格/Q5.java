package Q05_替换空格;

/**
 * @author ZhangHao
 * @date 2020/2/18 16:51
 * @Description： 替换字符串中的空格. 将字符串当今StringBuffer中. 参数类型就是StringBuffer
 * <p>
 * 学会使用StringBuffer的charAt(index) 方法.获得某位置的字符.
 * 自己对该算法有一定的改进.
 *
 * 看似简单其实也是大有门道的.
 */
public class Q5 {

    public String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        for (int i = 0; i < p1; i++) {
            if (str.charAt(i) == ' ') {
                str.append(" ");
            }
        }

//        注意,此时p1和p2的值是不同的,p1指向原长度,p2指向新长度.
        int p2 = str.length() - 1;
        while (p1 >= 0 && p2 > p1) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
        }
        return str.toString();
    }
}
