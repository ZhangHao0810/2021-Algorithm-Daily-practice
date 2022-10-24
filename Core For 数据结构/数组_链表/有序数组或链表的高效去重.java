/**
 * @author Super-Zhang
 * @date 2021-04-30 8:26
 *
 * 高效去重-题目描述
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度
 *
 * 说明：不要使用额外的数组空间，你必须在原地修改输入数组并在使用O(1)额外空间的条件下完成。
 *
 * 示例1：
 *
 *     给定数组 nums = [1,1,2],
 *
 *     函数应该返回新的长度2，并且原数组nums的前两个元素被修改为1,2。
 *
 *     你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例2
 *
 *     给定数组 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 *     函数应该返回新的长度5，并且原数组nums的前两个元素被修改为0,1,2,3,4。
 *
 *     你不需要考虑数组中超出新长度后面的元素。
 *
 * 高效去重-解题思路
 */
public class 有序数组或链表的高效去重 {

    /**
     * 对数组的有效去重。  要降低时间复杂度，就不能在数组内部删除，可以考虑将重复元素移到最后，然后用栈pop。
     * @param nums
     * @return  不重复的数组长度.
     */
    int removeDuplicates(int[] nums) {
        int n=nums.length;
        if (n==0) return 0;
        int slow=0,fast=1;
        while (fast < n) {
            if (nums[fast] != nums[slow]) {
                slow++;
            }
            fast++;
        }
        return slow+1;
    }

    /**
     *  对链表有效去重。 跟数组其实是类似的。
     * @param head 排序链表的头节点。
     * @return 头节点。
     */
    ListNode deleteDuplicates(ListNode head){
        if (head==null) return null;
        ListNode slow = head, fast=head.next;
        while (fast!=null){
            if (fast.val != slow.val) {
                slow.next = fast;
                slow=slow.next;
            }

            fast = fast.next;
        }
        slow.next=null;
        return head;
    }


}



















