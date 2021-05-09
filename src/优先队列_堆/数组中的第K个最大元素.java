package 优先队列_堆;

import java.util.PriorityQueue;

/**
 * @author Super-Zhang
 * @date 2021-05-09 21:54
 *
 * 思路：利用堆的特性，
 *
 * 说到堆，它是优先队列(priority queue），它又叫”堆”(heap), 但是可能优先队列这个名字更容易理解一些。
 * Java中PriorityQueue通过二叉小顶堆实现，每次移除元素重新构建二叉小顶堆。
 *
 *  直接利用java的优先队列来解。
 */
public class 数组中的第K个最大元素 {

    /**
     *  将数组添加到优先队列当中，当优先队列的长度大于k的时候，poll
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.add(num);
            if (priorityQueue.size() > k) {
                priorityQueue.peek();
            }
        }
        return priorityQueue.peek();
    }
}
