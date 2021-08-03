/**
 * @author Super-Zhang
 * @date 2021-08-03 14:33
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class JZ15反转链表 {

    /**
     * 记住，翻转链表用三指针。
     *
     * pre 是链外元素。（返回链的链首）
     * cru 是当前链首。
     * nex 是当前链2.
     */

    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode cru = head;
        ListNode nex =null;

        while(cru!=null){
            nex=cru.next;
            cru.next = pre;
            pre=cru;
            cru=nex;
        }
        return pre;
    }
}
