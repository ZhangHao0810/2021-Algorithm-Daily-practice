package 开班测评;

/**
 * @author Super-Zhang
 * @date 2021-08-28 11:47
 *
 * 牛牛手里有N根木棒,分别编号为1~N,现在他从N根里想取出三根木棒，使得三根木棒构成一个三角形,
 * 你能计算出牛牛有多少种取法吗?(考虑两种取法中使用的木棒编号有一个不一样就认为是不同的取法)。
 *
 * 输入描述:
 * 首先输入一个正整数N，接下来的一行共有N个正整数表示每个木棒的长度。
 * N ≤ 50, 木棒的长度 ≤ 10000.
 *
 * 输出描述:
 * 输出一个整数表示方法数。
 *
 * 示例
     * 输入
     * 5
     * 1 2 3 4 5
     *
     * 输出
     * 3
 */
import java.io.*;

/**
 * 构成三角形： 任意两边相加大于第三边
 **/
public class _02组装三角形 {
    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] input = bf.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i]+arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[k]+arr[j] > arr[i]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}