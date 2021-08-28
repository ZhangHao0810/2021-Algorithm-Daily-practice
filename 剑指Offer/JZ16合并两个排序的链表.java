/**
 * @author Super-Zhang
 * @date 2021-08-03 14:36
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class JZ16合并两个排序的链表 {

    /**
     * 链表的操作是一般要设置一个前驱。
     *
     * 引用是要指向一个类型对象，不然会报NullPointException
     * 不能声明一个引用是什么类型，这个引用就能当这个类型的对象来用了，基本的逻辑。
     */

    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode head= new ListNode();//这里不能指向Null，引用是要指向一个类型对象的，不然会报NullPointException
        ListNode moveNode=head;

        while(list1!=null && list2!=null){
            if(list1.val> list2.val){
                moveNode.next=list2;
                list2=list2.next;
            }else{
                moveNode.next=list1;
                list1=list1.next;
            }
            moveNode=moveNode.next;
        }
        if(list1!=null)  moveNode.next = list1;
        if(list2!=null)  moveNode.next = list2;

        return head.next;
    }
}
