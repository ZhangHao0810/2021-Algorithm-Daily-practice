package 数组和链表;

/**
 * @author Super-Zhang
 * @date 2021-04-21 11:29
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 示例:
 *    给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 *
你的算法只能使用常数的额外空间。
你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class 将链表相邻的两个节点反转 {

    public static void main(String[] args) {
        Node node = new Node("6", null);
        createNodes(5, node);


//        Node head=swapPairs循环(node);
        Node head=swapPairs递归(node);


        while (head.next != null) {
            System.out.print(head.vlaue);
            head = head.next;
        }
        System.out.println(head.vlaue);


    }

    /**
     * 将链表相邻的两个节点反转-循环法
     * @param head
     * @return
     */
    public static Node swapPairs循环(Node head) {
        Node tmp =new Node(null,null);  //申请一个空的节点
        tmp.next = head;  //让链表的头节点指向那个空节点的下一个节点
        Node temp = tmp;  //把这个空节点保存下来，用这个变量去完成交换
        while(head != null && head.next !=null){
            temp.next = head.next;
            head.next = temp.next.next;
            temp.next.next = head;
            temp = temp.next.next;  //当上面交换完了后，temp向后移两个节点。
            head = temp.next;
        }
        return tmp.next; //返回空节点之后已经交换完了的链表
    }

    /**
     * 递归  倒着来的，从后将顺序履直。 很牛。
     * @param head
     * @return
     */
    public static Node swapPairs递归(Node head) {
        if (head.vlaue == null || head.next == null) {
            return head;
        }
        Node res = head.next;//找到节点的下一个
        Node temp = swapPairs递归(head.next.next);//移动头部
        res.next=head;//交换
        head.next=temp;//头部移动到下一组。

        return res;
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
