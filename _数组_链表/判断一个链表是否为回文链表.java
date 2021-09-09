/**
 * @author Super-Zhang
 * @date 2021-04-30 8:37
 *
 * 给定一个链表的头结点是head，请判断该链表是否为回文结构，例如：
 *
 *     1->2->1，返回true
 *     1->2->2->1，返回true
 *     1->2->3，返回false
 *
 *
 *
 * 遍历一遍链表,使用两个指针，一个快指针，一个慢指针,，当快指针走完整个链表的时候，慢指针刚好来到链表中间位置。将右半边的链表反转,然后对比前半段和后半段的data值是否相同，如果相同的话则是回文;最后对右半部分链表进行反转,还原为最初的链表(这步不是必须的，所以下面也省略了，机试的时候可以省略，面试的时候可以说一下)
 * 只需要固定的若干个临时变量,不需要额外开辟空间
 * 最好的方法： 时间复杂度为O(n),空间复杂度为O(1)
 */
public class 判断一个链表是否为回文链表 {
    /**
     * 判断链表是否为回文链表
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        //如果链表只有一个有效节点或者没有有效节点，return true
        if (head == null || head.next == null) {
            return true;
        }
        ListNode quick = head;
        ListNode slow = head;
        //快慢指针，快指针一次走两步，慢指针一次走一步
        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            slow = slow.next;
        }
        //从slow开始反转后半段链表
        ListNode pre = null;
        ListNode p = slow;
        while (p != null) {
            ListNode temp = p.next;
            p.next = pre;
            pre = p;
            p = temp;
        }
        //对比前半段和后半段的data值是否相同
        while (pre != null) {
            if (pre.val == head.val) {
                pre = pre.next;
                head = head.next;
            } else {
                return false;
            }
        }
        //返回true
        return true;
    }
}
