import java.util.ArrayList;

/**
 * @author Super-Zhang
 * @date 2021-08-03 11:19
 *  输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 *
 * 如输入{1,2,3}的链表
 * 返回一个数组为[3,2,1]
 * 0 <= 链表长度 <= 1000
 * 示例1
 * 输入：
 * {1,2,3}
 * 返回值：
 * [3,2,1]
 */
public class JZ03从尾到头打印链表 {

    /**
     * 翻转链表，利用栈来做。
     * 链表操作，可以利用ArrayList的前插进行链表的转换。
     * ArrayList 头插 相当于栈。
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp= listNode;
        while (tmp != null) {
            list.add(0, tmp.val);
            tmp=tmp.next;
        }
        return list;
    }


}
