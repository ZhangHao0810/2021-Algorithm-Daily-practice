/**
 * @author Super-Zhang
 * @date 2021-04-29 17:53
 * 题目：输入一个单链表，输出此链表中的倒数第 K 个节点。（去除头结点，节点计数从 1 开始）。
 */
public class 输出单链表倒数第K个节点 {

    public static void main(String[] args) {

        Node start = new Node("9", null);
        

        createNodes(8, start);
        
        Node point = start;
        while (point.next != null) {
            System.out.print(point.value);
            point=point.next;
        }
        System.out.println(point.value);

        Node n = findKthToTail(start, 4);

        System.out.println(n.value);

    }

//    双指针法（经典解法）

    /**
     *  双指针法-解题思路
     *
     *     定义两个指针 p1 和 p2 分别指向链表头节点。
     *     p1 前进 K 个节点，则 p1 与 p2 相距 K 个节点。
     *     p1，p2 同时前进，每次前进 1 个节点。
     *     当 p1 指向到达链表末尾，由于 p1 与 p2 相距 K 个节点，则 p2 指向目标节点。
     */
     static Node findKthToTail(Node head,int k){
        if(head==null || k==0) return null;
        Node first = head;
        Node behind = head;
        for(int i=0; i<k-1; i++){
            if(first.next!=null)
                first = first.next;
            else{
                return null;
            }
        }
        while(first.next!=null){
            first = first.next;
            behind = behind.next;
        }
        return behind;
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
