package 第二章;

/**
 * @author Super-Zhang
 * @date 2021-08-02 9:45
 *
 *  递归过程类似一颗多叉树，递归的过程就是利用栈玩了一个遍历，栈空间就是树的高度。
 */
public class Code01_递归求最大值 {

    public static int getMax(int[] arr) {
        return process(arr, 0, arr.length - 1);

    }

    private static int process(int[] arr, int L, int R) {
        if(L==R) return arr[L];

        int mid = L+(R-L)/2;
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr, mid+1, R);
        return Math.max(leftMax, rightMax);
    }
}
