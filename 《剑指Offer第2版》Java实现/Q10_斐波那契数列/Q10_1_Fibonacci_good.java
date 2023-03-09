package Q10_斐波那契数列;

/**
 * @author ZhangHao
 * @date 2020/2/23 16:44
 * @Description：
 *
 *  分析问题之后,i项跟i-1和i-2项有关,只需要存储前两项的值就能求解第i项.
 *  可以将算出来的保存一下，等需要的时候查一下就行，不必多次求解。但是有更简单的方式：
 *  既然求第n项的值，从第一项开始捋就得了。重要的是分析问题的能力。不要被动的去
 */
public class Q10_1_Fibonacci_good {

    public int fibonacci(int n) {
        if (n<=1)
            return n;
        int pre2 = 0, pre1 = 1;
        int fib=0;
        for (int i = 2; i < n; i++) {
            fib = pre1+pre2;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }

}
