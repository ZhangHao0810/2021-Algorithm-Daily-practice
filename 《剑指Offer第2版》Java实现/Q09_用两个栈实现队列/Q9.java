package Q09_用两个栈实现队列;

import java.util.Stack;

/**
 * @author ZhangHao
 * @date 2020/2/22 13:54
 * @date 2021-08-03 12:09
 * @update 2023年3月30日09:36:11
 * @Description： 描述
 * 用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。
 * 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
 * <p>
 * 示例:
 * 输入: ["PSH1","PSH2","POP","POP"]
 * 返回: 1,2
 * 解析:
 * "PSH1":代表将1插入队列尾部
 * "PSH2":代表将2插入队列尾部
 * "POP“:代表删除一个元素，先进先出=>返回1
 * "POP“:代表删除一个元素，先进先出=>返回2
 * 思路很简单, 栈是木桶,队列是管道.
 * 所以,入队列和入栈操作一致,
 * 出队列的时候,要和出栈的顺序相反才行,
 * 先入的进入栈底,利用另外一个栈,在栈底的元素可以到栈顶位置.
 * 再出栈,即可达到类似出队列的效果.
 */
public class Q9 {

    /**
     * in:输入栈
     * out:输出栈，当输出栈为空时，把输入栈的内容全部导入
     */
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int node) {
        in.push(node);
    }

    /**
     * 本题要点： 只有输出栈空的时候，才允许将输入栈的数据pop过去。
     * 逻辑问题！！ 想明白了。
     */
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
