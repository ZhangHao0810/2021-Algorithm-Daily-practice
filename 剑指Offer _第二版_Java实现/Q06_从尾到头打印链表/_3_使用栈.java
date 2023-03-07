package Q06_从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author ZhangHao
 * @date 2020/2/19 23:23
 * @Description：
 *  栈是后进先出,所以出栈顺序即为逆序.
 *      学会基本数据结构的使用方法.
 */
public class _3_使用栈 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }

        ArrayList<Integer> out = printListFromTailToHead(list.getHead());
        System.out.println(out);

    }

     private static ArrayList<Integer> printListFromTailToHead(Node listNode) {
        Stack<Integer> stack = new Stack<>();
         while (listNode != null) {
             stack.add((Integer) listNode.data);
             listNode=listNode.next;
         }
         ArrayList<Integer> ret = new ArrayList<>();
         while (!stack.isEmpty()) {
             ret.add(stack.pop());
         }
         return ret;
    }

}
