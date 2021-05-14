package 数组和链表;

import jdk.internal.util.Preconditions;

/**
 * @author Super-Zhang
 * @date 2021-04-30 8:00
 * <p>
 * 给定一个单链表中的表头和一个等待被删除的节点。请在 O(1) 时间复杂度删除该链表节点。并在删除该节点后，返回表头。
 * <p>
 * 示例：
 * <p>
 * 给定 1->2->3->4，和节点 3，返回 1->2->4。
 * <p>
 * <p>
 * 将结点j的下一个结点完全复制给j
 * j->next = j->next->next;
 * j->data = j->next->data;
 * <p>
 * 特殊情况为：
 * 当j为尾结点时，需要从头遍历
 * 当链表中只有一个结点时，需将头节点置NULL，
 * 【平均时间复杂度为((n-1)*O(1) + O(n) )/n = O(1);】
 * <p>
 * 本题目主要复杂在对特殊情况的考虑上。
 */
public class 删除单链表中的节点时间复杂度1 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        node3.next = null;

        deleteNode(node1, node2);
    }

    private static void deleteNode(ListNode head, ListNode targetListNode) {

        // 要删除的节点是尾节点
        if (null == targetListNode.next) {
            ListNode currentListNode = head;
            if (currentListNode == targetListNode) {
                // 链表中只有一个节点，删除该节点时应该同时将指向它的引用都置为null。
                targetListNode = null;
                head = null;
                currentListNode = null;
            } else { // 链表中节点数大于1
//                将currentListNode 定位到待删除节点之前。
                while (currentListNode != null && currentListNode.next != targetListNode) {
                    currentListNode = currentListNode.next;
                }
                if (null != currentListNode) {
                    currentListNode.next = currentListNode.next.next;
                }
            }
        }
        // 要删除的节点不是尾节点  【这里是时间复杂度为1的关键。】
        else {
            // targetListNode的后继节点
            ListNode nextOfTargetListNode = targetListNode.next;
            // 将targetListNode的后继节点的值复制到targetListNode中，
            // 此时targetListNode的值和它的后继节点的值相等，故删除掉targetListNode的后继节点等价于删除targetListNode
            targetListNode.val = nextOfTargetListNode.val;
            // 删除targetListNode的后继节点
            targetListNode.next = nextOfTargetListNode.next;
            nextOfTargetListNode.next = null;
        }
    }

}
