/**
 * @author Super-Zhang
 * @date 2021-09-09 9:27
 */
public class 替换字符串中的空格 {
    public static void main(String[] args) {
        String str = "We are one!";
        System.out.println(replace(str, "%20"));
    }

    private static String replace(String str, String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(s);
            } else sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
