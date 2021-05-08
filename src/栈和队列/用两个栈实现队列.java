package 栈和队列;

import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-08 17:50
 * 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
 */
public class 用两个栈实现队列 {

    Stack<Integer> stackin=new Stack<>();
    Stack<Integer> stackout=new Stack<>();

    //进栈，相当于虚拟队列进队。
    public void appendTail(int item) {
        stackin.push(item);
    }

    //出栈 每次调用相当于虚拟队列出队
    public int  deleteHead() {

        //in栈不为空，则将元素全都放入out栈，
        while (!stackin.isEmpty()) {
            stackout.push(stackin.pop());
        }

        //out栈不为空，则返回输出out栈。
        if (!stackout.isEmpty()) {
            return stackout.pop();
        }

        return stackout.pop();
    }

}
