package 百度;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Super-Zhang
 * @date 2021-07-01 16:47
 *
 *  给定一个字符串， 给定一个数组k ， 输出最长的 包含k个不同字符子串 的长度。
 *
 *   cbca ， k=2 答案：3
 *
 *   限时 20min
 *   我用时： 差不多。
 */
public class No1 {

    public static void main(String[] args) {
        int k = 2 ;
        String s="lkalagjssa";

        System.out.println(No1.getLongestSubString(s, k));

    }

    public static int getLongestSubString(String str, int k) {
//        char[] chars = str.toCharArray();

        ArrayList list=new ArrayList();

        int l;
        int r=1;

        int num=0;
        int max=0;

        for ( l = 0; l < r; l++) {

            list.add(str.charAt(l));
            num++;

            for (r = l + 1; r < str.length(); r++) {

                if (list.contains(str.charAt(r))) {

                    break;

                }else{
                    list.add(str.charAt(r));
                    num++;
                }

            }

            if (num>=k)
             max = Math.max(num, max);

            list.clear();
            num=0;

        }

        return max;
    }
}
