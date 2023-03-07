/**
 * @author ZhangHao
 * @date 2020/5/22 20:34
 * @Description： 请实现一个函数, 将字符串中的空格替换成"%20".
 */
public class ReplaceSpace {

/** 2020/5/22 20:35
 * 第一种方法: 常规方法
 *  String.charAt(i)
 *  String.valueOf(char).equals(" ")
 *
 *  额外提供一个StringBuffer来存储.
*/
    public static String replaceSpace(StringBuffer str){
        int length=str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")) {
                result.append("20%");
            }else {
                result.append(b);
            }
        }
        return result.toString();
    }

    /**
     * 2020/5/26 17:44
     * 第二种方法: API 一行代码解决
     * String类的 replaceAll(String reg, String replacement)
     *  reg要经过java的转义才能用, java转义之后再经过正则转义就是正确的含义.
     *  \\ 转义字符 表示 \
     *  \s 正则表达式中是空格. 所以第一个参数要写 \\s
     */
    public static String replace2(StringBuffer str) {
        return str.toString().replaceAll("\\s", "20%");
    }

}
