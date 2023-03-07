package Q40_最小的K个数;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author ZhangHao
 * @date 2020/3/21 12:09
 * @Description： 大小为 K 的最小堆
 *
 *     复杂度：O(NlogK) + O(K)
 *     特别适合处理海量数据
 *
 * 应该使用大顶堆来维护最小堆，而不能直接创建一个小顶堆并设置一个大小，企图让小顶堆中的元素都是最小元素。
 *
 * 维护一个大小为 K 的最小堆过程如下：在添加一个元素之后，如果大顶堆的大小大于 K，那么需要将大顶堆的堆顶元素去除。
 */
public class Q40_2 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
        if (k > nums.length || k <= 0)
            return new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }
}
