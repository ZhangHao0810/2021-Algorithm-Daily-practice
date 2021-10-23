package N002_两数相加;

/**
 * @author Super-Zhang
 * @date 2021-05-14 16:10
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //新建一个起始位置。起始位置不返回。
        ListNode p = new ListNode(0);
        ListNode head = p;
        //进位
        int carry = 0;

        while (l1 != null || l2 != null||carry!=0) {
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            int sumVal = l1val + l2val + carry;

            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            p.next = sumNode;
            p = p.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }


        return head.next;
    }
}
