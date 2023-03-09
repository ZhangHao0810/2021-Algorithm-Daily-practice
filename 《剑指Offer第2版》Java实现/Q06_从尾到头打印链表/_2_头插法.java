package Q06_从尾到头打印链表;

import java.util.ArrayList;

/**
 * @author ZhangHao
 * @date 2020/2/19 22:37
 * @Description： 新链表的数据往前面插,
 *  头节点是头插法中使用的一个额外节点,这个节点不存储值.
 *  第一个节点就是链表的第一个真正存储值的节点.
 *
 *   尝试着多画图来理解. 非常的吊. 链表的思维一定要学好.
 */
public class _2_头插法 {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }

        ArrayList<Integer> out = printListFromTailToHead(list.getHead());
        System.out.println(out);

    }


    private static ArrayList<Integer> printListFromTailToHead(Node listNode){
//头插法构建逆序链表
        Node head = new Node(null) ;
        while (listNode != null) {
            Node memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
//    将构建出来的链表放到ArrayList中返回.
        ArrayList<Integer> ret = new ArrayList<>();
        head=head.next;
        while (head != null) {
            ret.add((Integer) head.data);
            head=head.next;
        }
        return ret;

    }
}
