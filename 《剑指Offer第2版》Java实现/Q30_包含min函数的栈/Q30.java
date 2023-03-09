package Q30_包含min函数的栈;

import java.util.Stack;

/**
 * @author ZhangHao
 * @date 2020/3/13 9:20
 * @Description： 定义栈数据结构, 在该类型中实现一个能够得到栈最小元素的min函数
 *
 *  熟练掌握栈的结构和相关的操作.
 */
public class Q30 {

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
//        minStack 栈的栈顶一直是dataStack栈的最小元素.
        minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));
    }

    public void pop(){
        dataStack.pop();
        minStack.pop();
    }

    public int top(){
        return dataStack.peek();
    }

    public int min(){
        return minStack.peek();
    }

}
