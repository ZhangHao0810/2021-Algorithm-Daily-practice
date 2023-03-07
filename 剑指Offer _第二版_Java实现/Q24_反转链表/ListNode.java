package Q24_反转链表;

/**
 * @author ZhangHao
 * @date 2020/3/2 12:22
 * @Description：
 */
public class ListNode<E> {
    E data;//数据域
    ListNode<E> next;//指针域,其实就是另外一个节点对象的引用.

    public ListNode(ListNode<E> next) {
        this.next = next;
    }

    ListNode(E data, ListNode<E> next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data.toString();
    }

}