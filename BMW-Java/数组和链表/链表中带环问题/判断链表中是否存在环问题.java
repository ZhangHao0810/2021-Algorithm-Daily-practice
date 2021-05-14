package 数组和链表.链表中带环问题;

import 数组和链表.Node;

/**
 * @author Super-Zhang
 * @date 2021-04-21 15:58
 *
 * 单链表中的环是指链表末尾的节点的 next 指针不为 NULL ，而是指向了链表中的某个节点，导致链表中出现了环形结构。
 *
 * 判断链表中是否存在环问题-穷举比较法
 *
 * 解题思想
 *
 *     遍历链表，记录已访问的节点。
 *     将当前节点与之前以及访问过的节点比较，若有相同节点则有环。
 *     否则，不存在环。
 *
 *
 *     快慢指针原理， 因为有环，所以没有终点，一个快一个慢，快的定会追上慢的。
 *     一旦链表带环，链表便没有尾巴。
 */
public class 判断链表中是否存在环问题 {

    /**
     * 判断链表中是否存在环问题-哈希缓存法
     *
     * 既然在穷举遍历时，元素比较过程花费大量时间，那么有什么办法可以提高比较速度呢？
     *
     * 解题思想
     *
     *     首先创建一个以节点 ID 为键的 HashSet集合，用来存储曾经遍历过的节点。
     *     从头节点开始，依次遍历单链表的每一个节点。
     *     每遍历到一个新节点，就用新节点和 HashSet 集合当中存储的节点作比较，
     *     如果发现 HashSet 当中存在相同节点 ID，则说明链表有环，
     *     如果 HashSet 当中不存在相同的节点 ID，就把这个新节点 ID 存入 HashSet ，
     *     之后进入下一节点，继续重复刚才的操作。
     *
     * 假设从链表头节点到入环点的距离是 a ，链表的环长是 r 。
     * 而每一次 HashSet 查找元素的时间复杂度是 O(1), 所以总体的时间复杂度是 1 * ( a + r ) = a + r，
     * 可以简单理解为 O(n) 。而算法的空间复杂度还是 a + r - 1，可以简单地理解成 O(n) 。
     */

//    判断链表中是否存在环问题-快慢指针法（经典解法）
//
//    定义两个指针分别为 slow，fast，并且将指针均指向链表头节点。
//    规定，slow 指针每次前进 1 个节点，fast 指针每次前进两个节点。
//    当 slow 与 fast 相等，且二者均不为空，则链表存在环。
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

        System.out.println(isLoop(node));

    }


    private static boolean isLoop(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node one = head;
        Node twe  = head.next;
        while( twe.next != null){
            one = one.next;
            twe = twe.next.next;
            if(twe == null){
                return false;
            }
            if(one.value.equals( twe.value)){
                return true;
            }
        }
        return false;
    }

}
