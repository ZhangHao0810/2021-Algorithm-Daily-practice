/**
 * @author Super-Zhang
 * @date 2021-07-06 9:40
 * 给定两个有序整数数组A,B 和 元素数目 m n  将数组B合并到数组A中，变成一个有序的数组。
 * A数组有足够的空间存放B数组元素。
 */
public class NC22合并两个有序的数组 {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 8, 0, 0, 0, 0};
        int[] b = {2, 4, 7, 9};

        int[] mysolution = mysolution(a, 5, b, 4);
        System.out.println();
    }

    /**
     * 我的方案，使用temp数组存。 其实是没有读好题干的。 读题！
     * 牛客方案： 倒序比较和插入。
     *
     * @param a
     * @param m
     * @param b
     * @param n
     * @return
     */
    private static int[] mysolution(int[] a, int m, int[] b, int n) {

        int p_a = m - 1;
        int p_b = n - 1;

        for (int i = p_a + p_b; i > 0; i--) {

            if (p_b < 0 || (p_a >= 0 && a[p_a] >= p_b)) {
                //将a的屁股插到真实的a的屁股。
                a[i] = a[p_a];
                p_a--;
            } else {
                //直接将B数组元素插入A的屁股。
                a[i] = b[i];
                p_b--;
            }

        }
        return a;

    }
}
