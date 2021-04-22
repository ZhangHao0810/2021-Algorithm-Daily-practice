package 数组和链表.链表中带环问题;

import 数组和链表.Node;

/**
 * @author Super-Zhang
 * @date 2021-04-21 21:21
 */
public class 带环的链表计算环长度 {

    public static void main(String[] args) {
        Node node = new Node("6", null);
        Node.createNodes(5, node);

        Node head = node;
        while (node.next != null) {
            System.out.print(node.value);
            node = node.next;
        }
        System.out.println(node.value);
//        现在node是尾巴了

//        把尾巴指向 head.next 构成环状结构。
        node.next = head.next;

        Node into = entryNodeOfLoop2(head);
        System.out.println("入口节点："+into.value);

        System.out.println("环的长度："+getLength(into));

    }

    /**
     * 求环的长度
     * 前提：两节点已经相交，已判定有环
     * ndoe1:相交节点
     */
    public static int getLength(Node Node1) {
        Node p1 = Node1;
        Node p2 = Node1.next;
        int length = 0;
        while (!p1.value.equals(p2.value)) {
            length++;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return length;
    }

    private static Node entryNodeOfLoop2(Node pHead) {
        Node fast = pHead;
        Node slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //当快指针和慢指针相遇时,将快指针放在头，然后俩指针同步走，相遇即环入口。
            if (fast == slow) {
                fast = pHead;

                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }//当再次相遇，return 相遇的值。
                return fast;
            }
        }
        return null;
    }
}
