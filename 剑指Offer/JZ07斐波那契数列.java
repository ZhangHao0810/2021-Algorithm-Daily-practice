/**
 * @author Super-Zhang
 * @date 2021-08-03 13:05
 * <p>
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 */
public class JZ07斐波那契数列 {

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
        if (n < 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 1.2递归优化：记忆化搜索
     * <p>
     * 用成员变量数组装着算过的数。 依旧反复递归调用自己，但用一个 if 判断来截断运算！！
     */
    int ans[] = new int[40];

    public int Fibonacci(int n) {
        if (n <= 1) return n;
        if (ans[n] != 0) return ans[n];// 减少递归次数的关键。
        return ans[n] = Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    /**
     * 2 动态规划
     * <p>
     * 动态规划类似分治，同样是将原问题分解成子问题，通过求解子问题而得到原问题的解。
     * 但不同的是，动态规划是自底向上分解，并且会保存子问题的解，在需要时可直接拿过来使用，这一点是区别于分治的。
     */
    int Fibonacci1(int n) {
        int ans[] = new int[40];
        ans[1] = 1;
        for (int i = 2; i <= n; ++i) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }

    /**
     * 2.1 动态规划优化：递推
     * <p>
     * 我比较擅长这个。
     */
    public int Fibonacci2(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
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
    public int Fibonacci3(int n) {
        if(n == 0)  return 0;
        if(n == 1)  return 1;
        int sum = 1;
        int one = 0;
        for(int i=2;i<=n;i++){ //找规律找出来的精华。
            sum = sum + one;
            one = sum - one;
        }
        return sum;
    }

}
