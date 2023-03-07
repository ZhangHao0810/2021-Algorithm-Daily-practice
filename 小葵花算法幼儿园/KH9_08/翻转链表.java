/**
 * @author Super-Zhang
 * @date 2021-09-09 9:32
 */
public class 翻转链表 {

    public ListNode reverselinkedlist(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;
    }

}

/**
 * 单链表
 */
class ListNode {
    int value;
    ListNode next;
}