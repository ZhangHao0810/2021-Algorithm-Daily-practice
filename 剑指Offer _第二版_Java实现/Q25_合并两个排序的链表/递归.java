package Q25_合并两个排序的链表;

/**
 * @author ZhangHao
 * @date 2020/3/9 12:13
 * @Description：
 */
public class 递归 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.data <= list2.data) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
