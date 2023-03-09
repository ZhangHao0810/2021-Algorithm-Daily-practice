package Q18_删除链表的节点;

/**
 * @author ZhangHao
 * @date 2020/3/2 12:19
 * @Description： 在O(1)时间内删除链表节点
 *  给定单向链表的头指针和一个节点指针.
 */
public class Q18_1 {

    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null)
            return null;
        if (tobeDelete.next != null) {
            // 要删除的节点不是尾节点
            ListNode next = tobeDelete.next;
            tobeDelete.data = next.data;
            tobeDelete.next = next.next;
        } else {
            if (head == tobeDelete)
                // 只有一个节点
                head = null;
            else {
//                删除尾巴节点.
                ListNode cur = head;
                while (cur.next != tobeDelete)
                    cur = cur.next;
                cur.next = null;
            }
        }
        return head;
    }
}
