package Q03_数组中重复的数字;

import org.junit.Test;

/**
 * @author ZhangHao
 * @date 2020/2/16 16:29
 * @Description： 题目一的自主解答
 * 我草来, 整整十分钟,下不去手啊.
 * <p>
 * 同过自己解答 发现了诸多的问题.语言只要几天没用,就会生疏!
 * <p>
 * 学会使用 foreach来循环.(如果用不到下标的话)
 * <p>
 * 学会跳出多层循环,利用Label:  break Label;
 * <p>
 * <p>
 * <p>
 * 做3,4月的事，7,8月自有答案。:
 * 老师好,在面试或者是工作中, 写代码是逻辑或者行数少重要 , 还是空间/时间复杂度重要?
 * <p>
 * 叫我官人:
 * 逻辑清晰考虑全面并且代码可读性高比较重要
 * <p>
 * 做3,4月的事，7,8月自有答案。:
 * 我在看算法,发现有的给的答案比较繁琐,但是空间时间复杂度低.
 * <p>
 * 叫我官人:
 * 算法题考查的就是时间空间复杂度了
 * 一般实际工作中不是特别需要考虑这个
 * 算法只是稽查你的逻辑思维能力
 * <p>
 * 做3,4月的事，7,8月自有答案。:
 * 明白了 谢谢老师
 * <p>
 * <p>
 * 自检: 该算法的  时间复杂度:O(n^2) 空间复杂度:O(1)(数组在方法外面定义)
 */
public class GetDuplicateNumberInArray {

    @Test
    public void getDuplicateNumberInArray() {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int num;
        Label:
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (num == nums[j] && i != j) {
                    System.out.println(num);
                    break Label;
                }
            }
        }
    }

}

