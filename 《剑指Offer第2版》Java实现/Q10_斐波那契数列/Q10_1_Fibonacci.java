package Q10_斐波那契数列;

/**
 * @author ZhangHao
 * @date 2020/2/23 16:37
 * @date 2021-08-03 13:05
 * @update 2023年3月31日14:21:06
 * @Description： 往常使用递归的解法.
 * 这种解法虽然好懂,但是会有大量的重复计算.
 * f(4)=f(3)+f(2)
 * f(3)=f(2)+f(1)
 * f(2)就被重复计算了两次.
 */
public class Q10_1_Fibonacci {
    /**
     * 同样的类型的题还有兔子繁殖的问题。
     * 此题可以用丰富的解法来解答。
     * 考察知识：[递归]，[记忆化搜索]，[动态规划], [递推]。
     * 难度：一星
     */

    /**
     * 1 分治
     * 分治思想简述
     * 当一个问题规模较大且不易求解的时候，就可以考虑将问题分成几个小的模块，再逐一解决；
     * 分治思想一般都会和递归一起使用，因为采用分治思想处理问题，其各个小模块通常具有与大问题相同的结构，这种特性也使递归技术有了用武之地。
     *
     * 所以，分治是一种思想，递归是一种技术！
     */

    /**
     * 1.1 分治 | 递归
     * <p>
     * 大量重复计算，超时！
     * 迭代 和 递归
     * <p>
     * 对比两种实现方式，迭代和递归的区别是：迭代使用的是循环结构，递归使用的是选择结构；
     * <p>
     * 使用递归能使程序的结构更清晰、更简洁、更容易让人理解，从而减少读懂代码的时间；
     * <p>
     * 但是大量的递归调用会创建函数的副本，会消耗大量的时间和内存，而迭代则不需要；
     * <p>
     * 递归函数分为调用和回退阶段，递归的回退顺序是它调用顺序的逆序。
     */
    public int fibonacci(int n) {
        if (n < 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 1.2递归优化：记忆化搜索
     * <p>
     * 用成员变量数组装着算过的数。 依旧反复递归调用自己，但用一个 if 判断来截断运算！！
     */
    int[] ans = new int[40];

    public int fibonacci1(int n) {
        if (n <= 1) {
            return n;
        }
        if (ans[n] != 0) {
            // 减少递归次数的关键。
            return ans[n];
        }
        return ans[n] = fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    /**
     * 2 动态规划
     * <p>
     * 动态规划类似分治，同样是将原问题分解成子问题，通过求解子问题而得到原问题的解。
     * 但不同的是，动态规划是自底向上分解，并且会保存子问题的解，在需要时可直接拿过来使用，这一点是区别于分治的。
     * 这样没问题，就是多了空间复杂度。
     */
    int fibonacci2(int n) {
        if (n <= 1) {
            return n;
        }
        //0号索引舍弃.
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    /**
     * 2.1 动态规划优化：递推
     * <p>
     * 我比较擅长这个。
     */
    public int fibonacci2D1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int sum = 0;
        int two = 0;
        int one = 1;
        for (int i = 2; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }

    /**
     * 2.2递推: 还可以优化，用更少的变量
     * 这个一定要学习到。 用两个指针就可以完成遍历。
     */
    public int fibonacci2D2(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = 1;
        int one = 0;
        //找规律找出来的精华。
        for (int i = 2; i <= n; i++) {
            sum = sum + one;
            one = sum - one;
        }
        return sum;
    }

}
