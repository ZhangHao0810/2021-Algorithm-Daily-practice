package 数组和链表;

/**
 * @author Super-Zhang
 * @date 2021-04-30 7:49
 * 有序链表合并-递归方案-解题思想
 *
 *     对空链表存在的情况进行处理，假如 pHead1 为空则返回 pHead2 ，pHead2 为空则返回 pHead1。
 *     比较两个链表第一个结点的大小，确定头结点的位置
 *     头结点确定后，继续在剩下的结点中选出下一个结点去链接到第二步选出的结点后面，然后在继续重复（2 ）（3） 步，直到有链表为空。
 */
public class 有序链表合并 {

    public static void main(String[] args) {
        

        Node有序链表合并 node1 = new Node有序链表合并(2);
        Node有序链表合并 node2 = new Node有序链表合并(4);
        node1.next = node2;
        Node有序链表合并 node3 = new Node有序链表合并(3);
        node2.next = node3;
        node3.next = null;

        Node有序链表合并 node4 = new Node有序链表合并(5);
        Node有序链表合并 node5 = new Node有序链表合并(6);
        node4.next = node5;
        Node有序链表合并 node6 = new Node有序链表合并(4);
        node5.next = node6;
        node6.next = null;

        mergeTwoList(node1, node4);
    }

    /**
     * 递归方式合并两个单链表
     *
     * @param head1 有序链表1
     * @param head2 有序链表2
     * @return 合并后的链表
     */
     static Node有序链表合并 mergeTwoList(Node有序链表合并 head1, Node有序链表合并 head2) {
        //递归结束条件
         if (head1 == null && head2 == null) {
             return null;
         }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        //合并后的链表
        Node有序链表合并 head = null;
        if (head1.data > head2.data) {
            //把head较小的结点给头结点
            head = head2;
            //继续递归head2
            head.next = mergeTwoList(head1, head2.next);
        } else {
            head = head1;
            head.next = mergeTwoList(head1.next, head2);
        }
        return head;
    }


}

class Node有序链表合并 {
    /**
     * 为了方便，这两个变量都使用public，而不用private就不需要编写get、set方法了。
     * 存放数据的变量，简单点，直接为int型
     */
    public int data;
    /**
     * 存放结点的变量,默认为null
     */
    public Node有序链表合并 next;
    /**
     * 构造方法，在构造时就能够给data赋值
     */
    public Node有序链表合并(int data) {
        this.data = data;
    }
}