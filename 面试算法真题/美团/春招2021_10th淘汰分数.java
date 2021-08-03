package 美团;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Super-Zhang
 * @date 2021-07-07 7:47
 * <p>
 * 一个比赛，设置分数线m，使得晋级和淘汰的人数均在区间[x,y]之间，
 * 如果不存在m，输出-1，输出符合条件的所有分数线m
 * 本题目是美团 2021秋招 原题。  考察阅读题干理解题意的能力。
 * <p>
 * 一定要多刷原题！
 */
public class 春招2021_10th淘汰分数 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int x = scanner.nextInt();

        int y = scanner.nextInt();

        int[] score = new int[n];
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }

//        int x = 2, y = 4;
//        int[] score = {1, 2, 3, 4, 5};
        solution(x,y,score);

//        System.out.println(solution(x, y, score));

    }

    private static void solution(int x, int y, int[] score) {
        Arrays.sort(score);

        System.out.println("============");
        int n = score.length;

        if (x >= n || y >= n || x > y) {
            System.out.println(-1);
//            return -1;
        }

        /**
         * 这里其实是查找n - i的位置。
         */
        for (int i = x; i < y; i++) {

            if (n - i < y && n - i > x) {
                //此时i和 n-i 均在 [x,y]区间。
                System.out.println(score[i]);
            }
        }

    }

}


