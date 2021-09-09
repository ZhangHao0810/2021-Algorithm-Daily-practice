package 开班测评;

/**
 * @author Super-Zhang
 * @date 2021-08-28 11:26
 *
 * 如果一个单词通过循环右移获得的单词，我们称这些单词都为一种循环单词。
 * 例如：picture 和 turepic 就是属于同一种循环单词。 现在给出n个单词，需要统计这个n个单词中有多少种循环单词。
 *
 *
示例1
    输入
        5
        picture
        turepic
        icturep
        word
        ordw

    输出
        2
 */


import java.io.*;

// 题眼：单词自己拼上自己，新单词一定包含 其他的循环单词。
public class _1循环单词 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }//将输入的每一个单词读取出来
        System.out.println(sumCircleWord(words));
    }

    private static int sumCircleWord(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("1")) {
                String word = words[i] + words[i];
                for (int j = i + 1; j < words.length; j++) {
                    if ((word.contains(words[j])) && (words[i].length() == words[j].length())) {
                        words[j] = "1";
                    }
                }
            }
        }
        int num = 0;

        for (String word : words) {
            if (!word.equals("1")) {
                num++;
            }
        }
        return num;
    }
}