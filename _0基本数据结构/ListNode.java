/**
 * @author Super-Zhang
 * @date 2021-04-21 11:31
 *
 * 全局使用的 链表数据结构
 */
public class ListNode {

    public String value;
    public int val;
    public ListNode next;

    public ListNode(String value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode(int x) {
        val = x;
    }

}