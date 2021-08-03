import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-08-03 14:26
 *
 *  输入一个链表，输出一个链表，该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点。
 * 如果该链表长度小于k，请返回一个长度为 0 的链表。
 */
public class JZ14链表中倒数最后k个结点 {

    /**
     * 注意泛型的使用
     * Stack<T> stack = new Stack<>();
     *
     * 这样后面才能用T类型接 stack.pop();否则返回的是Object。
     */

    public ListNode FindKthToTail (ListNode pHead, int k) {

        Stack<ListNode> stack=new Stack<>();
        ListNode p=pHead;
        while(p!=null){
            stack.add(p);
            p=p.next;
        }
        if(stack.size()<k) return new ListNode();

        ListNode res=null;
        for(int i=0;i<k;i++){
            res=stack.pop();
        }

        return res;
    }
}

