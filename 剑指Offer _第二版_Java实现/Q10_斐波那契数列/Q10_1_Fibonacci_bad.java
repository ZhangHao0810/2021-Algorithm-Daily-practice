package Q10_斐波那契数列;

/**
 * @author ZhangHao
 * @date 2020/2/23 16:37
 * @Description： 这是我往常使用递归的解法.
 *  这种解法虽然好懂,但是会有大量的重复计算.
 *     f(4)=f(3)+f(2)
 *     f(3)=f(2)+f(1)
 *  f(2)就被重复计算了两次.
 */
public class Q10_1_Fibonacci_bad {

    public int fibonacci(int n) {
        if (n<=1)
            return n;
        int[] fib = new int[n + 1]; //0号索引舍弃.
        fib[1]=1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

}
