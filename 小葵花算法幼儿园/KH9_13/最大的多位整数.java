import org.junit.Test;

/**
 * @author Super-Zhang
 * @date 2021-09-15 8:49
 * <p>
 * 设有n个正整数，将它们连接成一排，组成一个最大的多位整数。
 * 例如：n=3时，3个整数13，312，343，连成的最大整数为34331213。
 * 又如：n=4时，4个整数7，13，4，246，连成的最大整数为7424613。
 * 输入：n
 * N个数
 * 输出：连成的多位数
 * 算法分析：此题很容易想到使用贪心法，在考试时有很多同学把整数按从大到小的顺序连接起来，测试题目的例子也都符合，但最后测试的结果却不全对。按这种标准，我们很容易找到反例：12，121应该组成12121而非12112，那么是不是相互包含的时候就从小到大呢？也不一定，如12，123就是12312而非12123，这种情况就有很多种了。是不是此题不能用贪心法呢？
 * 其实此题可以用贪心法来求解，只是刚才的标准不对，正确的标准是：先把整数转换成字符串，然后在比较a+b和b+a，如果a+b>=b+a，就把a排在b的前面，反之则把a排在b的后面。
 * <p>
 * 贪心算法所作的选择可以依赖于以往所作过的选择，但决不依赖于将来的选择，也不依赖于子问题的解，因此贪心算法与其他算法相比具有一定的速度优势。
 * 如果一个问题可以同时用几种方法解决，贪心算法应该是最好的选择之一。
 */
public class 最大的多位整数 {
    @Test
    public void testMaxNum() {
        //有n个正整数，将它们连接成一排，组成一个最大的多位整数
        //12112错误
        //12121正解
//        int[] nums = {12, 121};
        int[] nums = {12, 123};
        String result = maxNum(nums);
        System.out.println("组成最大整数:" + result);
    }

    /**
     * 根据给定的整数组成最大的多位数
     *
     * @param nums
     */
    public String maxNum(int[] nums) {
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            String num1 = nums[i] + "";
            for (int j = 1; j < nums.length; j++) {
                String num2 = nums[j] + "";
                if ((num1 + num2).compareTo(num2 + num1) < 0) { // 吊，"123".compareTo("111") 可以返回字符串所代表的数字的大小关系。
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }

}
