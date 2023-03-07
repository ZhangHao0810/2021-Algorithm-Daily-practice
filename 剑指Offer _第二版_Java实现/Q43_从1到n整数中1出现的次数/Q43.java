package Q43_从1到n整数中1出现的次数;

/**
 * @author ZhangHao
 * @date 2020/3/24 22:46
 * @Description：  letcode的233题.  不太能看懂是啥意思. 需复看.
 */
public class Q43 {

    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }
}
