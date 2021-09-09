/**
 * @author Super-Zhang
 * @date 2021-07-04 21:45
 * <p>
 * 数组存着某个股票在第i天的价格。
 * 有一次买入和卖出的机会，设计算法获得最大收益。
 */
public class NC7股票交易 {

    public static void main(String[] args) {
        int[] array = {9, 5, 8, 4, 2, 3};

        System.out.println(getMaxProfit(array));
        System.out.println(solutionByNC(array));

    }

    /**
     * 思路分析； 就是最小值买入，最大值卖出。 先找到最小值，然后获得最大收益。
     *  牛的一点是，只需要遍历数组一次即可。  双指针就必定要两个循环，效率低。
     * @param prices
     * @return
     */
    public static int solutionByNC(int[] prices) {
        int min = prices[0];
        int ans=0;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);//获得此时的最小值，
            ans = Math.max(ans, prices[i] - min);//比较该值和最小值的差额，获得最大收益。
        }
        return ans;
    }

    /**
     * 看完正确答案，我的复杂度确实更大。类似冒泡了。
     * @param array
     * @return
     */
    public static String getMaxProfit(int[] array) {
        int maxProfix = 0, profix = 0;
//        int a = 0, b = 0;

        for (int buyDay = 0; buyDay < array.length; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay < array.length; sellDay++) {
                profix = array[sellDay] - array[buyDay];
//                int temp = maxProfix;
                maxProfix = Math.max(profix, maxProfix);
//                if (maxProfix != temp) {
//                    a = buyDay+1;
//                    b = sellDay+1;
                }

            }


        return "收益：" + maxProfix;
//        return "买入日：" + a + "  卖出日:" + b + "  收益:" + maxProfix;
    }

}
