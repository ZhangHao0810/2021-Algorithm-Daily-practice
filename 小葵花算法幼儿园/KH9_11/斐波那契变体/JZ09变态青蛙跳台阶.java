package 斐波那契变体;

/**
 * @author Super-Zhang
 * @date 2021-08-03 13:33
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶(n为正整数)总共有多少种跳法。
 */
public class JZ09变态青蛙跳台阶 {

    /**
     * 要勇敢的递推试一下，数学关系要搞明白，算法其实就是考察数学。
     *
     * 递推式子： 1（1）,2（1+1）,4（1+2+1），8（1+2+4+1），16（1+2+4+8+1）
     */

    public int jumpFloorII(int target) {
        if (target == 0 || target == 1) return 1;
        return (int) Math.pow(2,target-1);
    }

//        import java.lang.Math;

//        double r=  Math.pow(double a, double b); //a的b次幂
//        double c=  Math.abs(-2);//绝对值
//        double m=  Math.sqrt(9);// 传回x开平方值
//        double o=  Math.round(6.258);//传回x的四舍五入值
//        double p=  Math.random();//[0,1)之间的随机数
//
//        double n=  Math.rint(5.684);//传回最接近x的整数值
//        double f=  Math.floor(9.264);//向下取整



}
