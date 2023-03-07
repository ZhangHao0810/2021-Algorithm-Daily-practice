package Q24_反转链表;

/**
 * @author ZhangHao
 * @date 2020/3/8 19:44
 * @Description： 使用头插法
 */
public class 迭代 {

    public ListNode ReverseList(ListNode head) {
        ListNode newList = new ListNode(-1,null);
        while (head != null) {
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }
}
