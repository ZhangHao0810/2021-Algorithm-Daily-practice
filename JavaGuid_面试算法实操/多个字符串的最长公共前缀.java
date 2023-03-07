import java.util.Arrays;

/**
 * @author ZhangHao
 * @date 2020/5/26 18:13
 * @Description：
 *      flower  flow flight
 *      最长公共前缀为: fl
 */
public class 多个字符串的最长公共前缀 {

    /** 2020/5/26 18:16
     *  利用Array.sort(strs) 为数组排序, 然后比较第一个和最后一个即可.
    */
    public  static String method(String[] strs){
//先判断有无null串.
        if (!checkStrs(strs)){
            return "";
        }
        int len=strs.length;
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);
        int m=strs[0].length();
        int n=strs[len-1].length();
        int num = Math.min(m, n);

        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                result.append(strs[0].charAt(i));
            }else break;

        }
         return result.toString();
    }

    public static boolean checkStrs(String[] strs){
        boolean flag=false;
        if (strs != null) {
            for (String str : strs) {
                if (str != null && str.length() != 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String[] strs = {"customer", "car", "cat"};
        System.out.println(method(strs));
    }
}
