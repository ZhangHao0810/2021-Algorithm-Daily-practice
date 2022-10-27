import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-04-30 8:15
 *
 * 输入一个链表，按链表值从尾到头的顺序返回一个 ArrayList 。
 * 先进后出，后进先出  栈！
 */
public class 从尾到头打印链表 {

    public static void printListReversinglyByStack(ListNode listNode){
        if(listNode == null){ //如果为空，直接返回
            return;
        }
        Stack<Integer> stack = new Stack<>(); //借助于栈
        while(listNode!=null){
            stack.push(listNode.val); //将数据放入栈中
            listNode = listNode.next; //指针域指向下一个指针
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " "); //借助于栈输出
        }
    }
}
