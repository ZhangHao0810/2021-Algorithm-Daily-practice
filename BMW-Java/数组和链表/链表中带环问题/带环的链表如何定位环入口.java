package 数组和链表.链表中带环问题;

import 数组和链表.Node;

import java.util.HashSet;

/**
 * @author Super-Zhang
 * @date 2021-04-21 21:21
 */
public class 带环的链表如何定位环入口 {


    public static void main(String[] args) {
        Node node = new Node("6", null);
        Node.createNodes(5, node);

        Node head=node;
        while (node.next != null) {
            System.out.print(node.value);
            node=node.next;
        }
        System.out.println(node.value);
//        现在node是尾巴了

//        把尾巴指向 head.next 构成环状结构。
        node.next=head.next;

        System.out.println(EntryNodeOfLoop(head).value);

        System.out.println(entryNodeOfLoop2(head));



    }

    /**
     * HashSet 的 add方法，如果add失败（即有重复）返回false
     * 时间 o（n） 空间 O（n） 链表长的话，空间复杂度会很高。
     */
    private static Node EntryNodeOfLoop(Node pHead){
        HashSet<Node> hs = new HashSet<>();
        while(pHead!=null){
            if(!hs.add(pHead))//如果包含了，那么这个就是入口结点
                return pHead;
            pHead = pHead.next;
        }
        return null;
    }

    /**
     * /*
     * * 定义a如下： 链表头移动a步到达入口点。
     * 定义x如下： 入口点移动x步到达相遇点。
     * 定义r如下： 环的长度。
     * 定义L如下： 链表总长度为L。
     * p1=a+x
     * p2 = 2p1
     * 2p1 = p1 + n*r
     * 此时a+x=n*r
     * 然后fast指针和slow指针各走a步，同时到达入口点,此时slow指针减去a正好走了n次环r,刚好停在入口点
     * 即p1走的路+新走的a=a+x+a=n*r+a,刚好fast从链表头移动a步到达入口点
     */
    private static Node entryNodeOfLoop2(Node pHead) {
        Node fast=pHead;
        Node slow=pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow=slow.next;
            //当快指针和慢指针相遇时,将快指针放在头，然后俩指针同步走，相遇即环入口。
            if (fast == slow) {
                fast=pHead;

                while (fast != slow) {
                    fast=fast.next;
                    slow=slow.next;
                }//当再次相遇，return 相遇的值。
                return fast;
            }
        }
        return null;
    }


}
