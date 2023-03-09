package Q09_用两个栈实现队列;

import java.util.Stack;

/**
 * @author ZhangHao
 * @date 2020/2/22 13:54
 * @Description：
 *
 *  思路很简单, 栈是木桶,队列是管道.
 *      所以,入队列和入栈操作一致,
 *      出队列的时候,要和出栈的顺序相反才行,
 *      先入的进入栈底,利用另外一个栈,在栈底的元素可以到栈顶位置.
 *      再出栈,即可达到类似出队列的效果.
 */
public class Q9 {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int node) {
        in.push(node);
    }

    public int pop() throws Exception {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        if (out.isEmpty()) {
            throw new Exception("queue is empty");
        }

        return out.pop();
    }

}
