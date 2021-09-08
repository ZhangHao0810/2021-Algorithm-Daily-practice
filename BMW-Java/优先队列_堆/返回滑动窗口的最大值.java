package 优先队列_堆;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Super-Zhang
 * @date 2021-05-09 22:08
 * <p>
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口 k 内的数字。滑动窗口每次只向右移动一位。
 * <p>
 * 返回滑动窗口最大值。示例:
 * <p>
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * <p>
 * 滑动窗口问题的关键点在于，我只能看到滑动窗口内的数据，外面的看不到！
 *
 *
 * 最标准解法：  维护 双端队列
 * 窗口大小是有限的，且无需维护第二大第三大的值
 */
public class 返回滑动窗口的最大值 {

    /**
     * 解法一：优先队列 （时间复杂度为O（n*logK））
     * <p>
     * 返回窗口中的的最大值，最大最小值我们可以优先考虑到“优先队列”，优先队列用于流式数据的最大最小值。算法题中，有出现slide window的都是高频考点。使用优先队列维持一个大顶堆。
     * <p>
     * a.维持一个max heap（删除滑动窗口最左边的元素，加入新的元素）
     * <p>
     * b.让最大值位于大顶堆
     * <p>
     * a步骤的维持max head的时间复杂度是logK。
     * <p>
     * b步骤的时间复杂度是N *O（1），即O(N）。
     * <p>
     * 总体时间复杂度为O（n*logK）。
     *
     *
     *
     * 解析；  其实就是在维护这个滑动窗口堆，每次删除离开滑动窗口的元素，加入新元素。
     * 同时，输出堆顶元素。  每一次维护堆顶元素 O（logN） ,查堆顶元素复杂度是O（1）
     *
     * 用大顶堆来解决问题。
     *
     * @param nums
     * @param k
     * @return
     */

    /**
     * 使用了 优先队列，真的厉害。
     * @param nums
     * @param k
     * @return 数组中元素就是滑动窗口移动时候元素的每次最大值
     */
    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums == null || k <= 0 || k == 1)
            return nums;

        PriorityQueue queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int[] max = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
//          如果是第K个数之前和第K个数，就说明优先队列没有满，继续添加
            if (i < k - 1) {
                queue.add(nums[i]);
            } else if (i == k - 1) {
                queue.add(nums[i]);
                max[0] = (int) queue.peek();
            } else {
//              优先队列已满，删除滑动窗口最左边的数[i - k],添加新的数
                queue.remove(nums[i - k]);
                queue.add(nums[i]);
                max[i - k + 1] = (int) queue.peek();
            }
        }
        return max;
    }


    //解法 2  ： 双端队列！【最标准解法】
    // 维护 左边为最大值，右边往里面放。 输出双端队列的最左侧元素。
    public int[] maxSlidingWindow2(int[] nums, int k) {
        if(nums == null  || nums.length == 0)//判断int数组是否为空，int数组是否没有数据
            return new int[0];
        ArrayDeque<Integer> adq = new ArrayDeque<>(k);
        //用数组而不是
        int[] max = new int[nums.length + 1 - k];
        for(int i = 0; i < nums.length; i++){
            //每当新数进来，如果发现队列的头部的数的下标是窗口最左边的下标，则移出队列
            // 如果队列头元素不在滑动窗口中了，就删除头元素
            if(!adq.isEmpty() && adq.peekFirst() == i - k)//i - k 这里很巧妙
                adq.removeFirst();
            //把队列尾部的数和新数一一比较，比新数小的都移出队列，直到该队列的末尾数比新数大或者队列为空的时候才停止，保证队列是降序的
            while(!adq.isEmpty() && nums[adq.peekLast()] < nums[i])
                adq.removeLast();
            //从尾部加入新的数
            adq.offerLast(i);
            //队列头部就是该窗口最大的数
            if(i >= k -1)//i < k - 1时，滑动窗口才有最大值
                max[i + 1 -k] = nums[adq.peekFirst()];
        }
        return max;
    }

}

