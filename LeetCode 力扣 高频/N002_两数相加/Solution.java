package N002_两数相加;

/**
 * @author Super-Zhang
 * @date 2021-05-14 15:55
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */



//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //新建一个起始位置。起始位置不返回。
        ListNode p = new ListNode(0);
        ListNode head=p;
        //进位
        int carry=0;

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        while (l1 != null && l2 != null) {
            int temp=(l1.val+l2.val+carry)%10;
            carry=(l1.val+l2.val+carry)/10;

//            链表的加链操作
            p.next = new ListNode(temp);
            p=p.next;
            l1=l1.next;
            l2=l2.next;
        }

        if (l1 == null) {
            while (l2 != null) {
                int tmp=(l2.val+carry)%10;
                carry=(l2.val+carry)/10;
                p.next = new ListNode(tmp);
                p = p.next;
                l2 = l2.next;
            }
        }

        if(l2==null){
            while(l1!=null){
                int tmp=(l1.val+carry)%10;
                carry=(l1.val+carry)/10;
                p.next=new ListNode(tmp);
                p=p.next;
                l1=l1.next;
            }
        }

        //链表结束，不要忘记进位
        if (carry > 0) {
            p.next = new ListNode(1);
        }

        return head.next;
    }
}
