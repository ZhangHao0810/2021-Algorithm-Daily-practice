package Q25_合并两个排序的链表;

/**
 * @author ZhangHao
 * @date 2020/3/9 12:16
 */

public class ListNode {
    Integer data;//数据域
    ListNode next;//指针域,其实就是另外一个节点对象的引用.

    public ListNode(ListNode next) {
        this.next = next;
    }

    ListNode(Integer data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return  data.toString();
    }

}