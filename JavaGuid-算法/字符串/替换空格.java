package 字符串;

/**
 * @author Super-Zhang
 * @date 2021-06-29 9:41
 *
 * 剑指offer：请实现⼀个函数，将⼀个字符串中的每个空格替换成“%20”。例如，当字符串为
 * We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 本题涉及到正则表达式
 * 在 Java 中，\\ 表示：我要插入一个正则表达式的反斜线，所以其后的字符具有特殊的意义。
 *    空格：\s 匹配任何空白字符，包括空格、制表符、换页符等。与 [ \f\n\r\t\v] 等效。
 *
 * 熟练运用String的API
 *  string.replaceAll可以使用正则。
 */
public class 替换空格 {

    public static void main(String[] args) {
        System.out.println("\\");   // 输出 \
        System.out.println("\\\\"); // 输出 \\
//        System.out.println("\\\"); 报错。
    }

    public static String replaceSpace2(StringBuffer str) {
        return str.toString().replaceAll("\\s","%20");
    }
}
