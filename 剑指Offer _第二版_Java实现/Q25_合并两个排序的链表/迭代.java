package Q25_合并两个排序的链表;

/**
 * @author ZhangHao
 * @date 2020/3/9 12:17
 * @Description：
 */
public class 迭代 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1,null);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null)
            cur.next = list1;
        if (list2 != null)
            cur.next = list2;
        return head.next;
    }
}
