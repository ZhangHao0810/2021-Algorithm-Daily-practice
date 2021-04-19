package 数组和链表;

/**
 * @author Super-Zhang
 * @date 2021-04-19 14:46
 * 示例：
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class 反转链表 {

    private static class Node {
        private String vlaue;
        private Node next;

        private Node(String vlaue, Node next) {
            this.vlaue = vlaue;
            this.next = next;
        }

    }

    public static void main(String[] args) {

        Node node = new Node("6", null);
        createNodes(5, node);

        while (node.next!=null) {
            System.out.print(node.vlaue + " ");
            node = node.next;
        }
        System.out.println(node.vlaue);


//        ===========  翻转链表  ====================
        Node node2 = new Node("6", null);
        createNodes(5, node2);

        Node head=reverse(node2);
        while (head.next!=null) {
            System.out.print(head.vlaue+" ");
            head = head.next;
        }
        System.out.println(head.vlaue);

    }

    /**
     * 弹栈，压栈的过程。
     *  递归的思想！ 绝了。
     */
    private static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;

        return newHead;
    }

    private static Node createNodes(Integer i, Node node) {
        if (i < 0) {
//            Node last = new Node("NULL", null);
//            node.next=last;
//            return last;
            return node;
        }
        Node next = new Node(i.toString(), null);
        node.next = next;

        return createNodes(i - 1, next);
    }

}
