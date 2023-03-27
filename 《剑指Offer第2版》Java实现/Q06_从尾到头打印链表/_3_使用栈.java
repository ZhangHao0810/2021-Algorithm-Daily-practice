package Q06_从尾到头打印链表;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @author ZhangHao
 * @date 2020/2/19 23:23
 * @Description： 栈是后进先出, 所以出栈顺序即为逆序.
 * 学会基本数据结构的使用方法.
 */
public class _3_使用栈 {


    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        System.out.println("链表值：" + linkedList);
        printListFromTailToHead(linkedList);

    }

    /**
     * @description 入栈，再出栈，即可翻转链表。
     * @author zh
     * @data 2023/3/27
     */
    private static void printListFromTailToHead(LinkedList<Integer> linkedList) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; linkedList != null && i < linkedList.size(); i++) {
            stack.push(linkedList.get(i));
        }

        while (stack.peek() != null) {
            System.out.print(stack.pop() + ", ");
        }
    }

}
