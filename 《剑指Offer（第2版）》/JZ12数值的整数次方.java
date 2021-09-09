/**
 * @author Super-Zhang
 * @date 2021-08-03 14:
 *
 * 描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数。
 */
public class JZ12数值的整数次方 {

    /**
     * 代码写出来要优雅
     *
     * 某些涉及高深位运算之类的解法，不好理解，时间有限，写一个优雅的暴力解法更好。
     *
     * 2^-2 = (1/2)^2
     *
     * 不要习惯性的去用很多的if-else 堆积！！！ 将代码提炼，简洁化。
     */

    public double Power(double base, int exponent) {

        double res=1.0;
        if(exponent<0) {
            base=1/base;
            exponent=-exponent;
        }

        for(int i=0;i<exponent;i++)
            res*=base;

        return res;

    }
}
