package Q18_删除链表的节点;

/**
 * @author ZhangHao
 * @date 2020/3/2 12:20
 * @Description： 删除列表中的重复的节点
 */
public class Q18_2 {

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode next = pHead.next;
        if (pHead.data == next.data) {
            while (next != null && pHead.data == next.data)
                next = next.next;
            return deleteDuplication(next);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
