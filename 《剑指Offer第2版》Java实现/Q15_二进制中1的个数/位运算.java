package Q15_二进制中1的个数;

/**
 * @author ZhangHao
 * @date 2020/2/28 11:11
 * @Description：
 *
 *  n&(n-1) 该位运算去除 n 的位级表示中最低的那一位。
 *  n       : 10110100
 *  n-1     : 10110011
 *  n&(n-1) : 10110000
 *  时间复杂度：O(M)，其中 M 表示 1 的个数。
 *
 */
public class 位运算 {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }


//    public int NumberOf1(int n) {
//        return Integer.bitCount(n);
//    }
}
