import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-08-03 12:09
 * 描述
 * 用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。
 * 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
 *
 * 示例:
 * 输入:
 * ["PSH1","PSH2","POP","POP"]
 * 返回:
 * 1,2
 * 解析:
 * "PSH1":代表将1插入队列尾部
 * "PSH2":代表将2插入队列尾部
 * "POP“:代表删除一个元素，先进先出=>返回1
 * "POP“:代表删除一个元素，先进先出=>返回2
 *
 */
public class JZ05用两个栈实现队列 {
    /**
     * 本题要点： 只有输出栈空的时候，才允许将输入栈的数据pop过去。
     * 逻辑问题！！ 想明白了。
     */

    Stack<Integer> stack1 = new Stack<>();//输入栈
    Stack<Integer> stack2 = new Stack<>();//输出栈，当输出栈为空时，把输入栈的内容全部导入。

    public void push(int node) {
        stack1.push(node);
    }

    public int pop(){
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

        }
        return stack2.pop();
    }
}
