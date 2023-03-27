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

