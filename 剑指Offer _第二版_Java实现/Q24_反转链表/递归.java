package Q24_反转链表;

/**
 * @author ZhangHao
 * @date 2020/3/8 19:43
 * @Description：
 */
public class 递归 {

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList(next);
        next.next = head;
        return newHead;
    }
}
