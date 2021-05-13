package 哈希表;

import java.util.HashMap;

/**
 * @author Super-Zhang
 * @date 2021-05-13 16:12
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class 两数之和 {

    // 1. Two Sum
    // 时间复杂度：O(n)
    // 空间复杂度：O(n)

//    x1+x2=target,  所以 target-x1 = x2

    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            if (map.containsKey(numbers[i])){
                a[0] = map.get(numbers[i]); // numbers[i] 为x2，   拿到对应的value 即 x1的下标
                a[1] = i ; //拿到x2的下标。
                return a;
            }
            //存储差值为key,下标为value(题目要求从1开始故＋1)
            map.put(target - numbers[i], i );  //value存x1的下标。
        }
        return a;
    }

}
