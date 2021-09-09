/**
 * @author Super-Zhang
 * @date 2021-04-29 22:19
 *
 *
 * 这个算法 很好的训练了加法！ 将加法的大于十进一位做的很透彻！！ 很好。算法可以很好的训练自己的思维。！
 *
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class 使用链表实现大数加法 {
    public static void main(String[] args) {

        Solution test = new Solution();

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        node3.next = null;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        node4.next = node5;
        ListNode node6 = new ListNode(4);
        node5.next = node6;
        node6.next = null;

        test.addTwoNumbers(node1, node4);

    }

}


class Solution {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode p = listNode;
        int sum = 0;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10);
            sum = sum / 10;
            p = p.next;
        }
        return listNode.next;
    }
}