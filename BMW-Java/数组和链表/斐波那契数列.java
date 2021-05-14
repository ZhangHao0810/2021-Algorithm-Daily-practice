package 数组和链表;

/**
 * @author Super-Zhang
 * @date 2021-04-09 9:38
 */
public class 斐波那契数列 {

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.print(recFeibo(i));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("↑ 递归法， ↓循环法 ");

        for (int i=0;i<10;i++){
            System.out.print(fibo(i));
            System.out.print(" ");
        }


    }

    /**
     * 递归实现。效率很差，多进行了很多运算。
     * @param n
     * @return
     */
    private static int recFeibo(int n) {
        if (n<=0)
            return 0;

        if (n == 1 || n == 2) {
            return 1;
        }

        return recFeibo(n - 1) + recFeibo(n - 2);
    }

    /**
     * 循环法（正推法），时间复杂度O(n)
     * @param n
     * @return
     */
    private static int fibo(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int left=1;//上一个值。
        int temp;
        int right=1;//当前元素值，一会儿就变成上一个值了。

        for (int i = 3; i <= n; i++) {
            temp=right;
            right+=left;
            left=temp;
        }

        return right;


    }

}
