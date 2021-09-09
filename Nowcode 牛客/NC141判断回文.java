/**
 * @author Super-Zhang
 * @date 2021-07-05 13:29
 * <p>
 * 判断一个字符串是否是回文。
 */
public class NC141判断回文 {

    public static void main(String[] args) {
        String str = "abcbsa";

        System.out.println(judge(str));

    }

    /**
     * 牛客方案：  不用双指针，直接搞索引。
     *       i < len / 2
     *       len - 1 - i 就是对称的位置。 值得借鉴！
     * @param str
     * @return
     */
    private static boolean solutionByNC(String str) {
        int len=str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }



    /**
     * 我的方案 双指针方案。两指针同时往中间凑。 我觉得很好。
     * @param string
     * @return
     */
    private static boolean judge(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) == string.charAt(right)) {
                left++;
                right--;

            } else return false;
        }

        return true;
    }
}
