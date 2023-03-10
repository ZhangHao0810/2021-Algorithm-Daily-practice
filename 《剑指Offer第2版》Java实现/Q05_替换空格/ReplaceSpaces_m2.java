package Q05_替换空格;

/**
 * @author Super-Zhang
 * @date 2021-08-03 11:17
 *
 * 描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpaces_m2 {

    /**
     * 调用Spring的api
     */
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
