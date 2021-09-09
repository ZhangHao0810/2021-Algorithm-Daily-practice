package 开班测评;

/**
 * @author Super-Zhang
 * @date 2021-08-28 13:03
 *
 * 牛牛有两个字符串（可能包含空格）,牛牛想找出其中最长的公共连续子串,希望你能帮助他,并输出其长度。
 * 输入描述:
 *
 * 输入为两行字符串（可能包含空格），长度均小于等于50.
 *
 *
 *
 * 输出描述:
 *
 * 输出为一个整数，表示最长公共连续子串的长度。
 *
 * 示例1
 * 输入
 *
 * abcde
 * abgde
 *
 * 输出
 *
 * 2
 */
import java.io.*;

public class _04最长公共子序列 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m][n];
        int max = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;

                    } else{
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        System.out.println(max);
    }
}