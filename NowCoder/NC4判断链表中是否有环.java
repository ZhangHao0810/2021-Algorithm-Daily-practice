/**
 * @author Super-Zhang
 * @date 2021-07-06 10:15
 *
 *  判断链表中是否有环，有true，无false
 */
public class NC4判断链表中是否有环 {

    /**
     *  第一次感受到刷题的好处，这个方案之前有印象，可以将思路很好的展现！！ 算法这里一定要复习！ 总结归纳思路！！！！
     * @param head
     * @return
     */
    private static boolean mySolution(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while (slow != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow=slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
