import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-08-08 19:45
 *
 *  定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数，并且调用 min函数、push函数 及 pop函数 的时间复杂度都是 O(1)
 * push(value):将value压入栈中
 * pop():弹出栈顶元素
 * top():获取栈顶元素
 * min():获取栈中最小元素
 *
 * 示例:
 * 输入:    ["PSH-1","PSH2","MIN","TOP","POP","PSH1","TOP","MIN"]
 * 输出:    -1,2,1,-1
 * 解析:
 * "PSH-1"表示将-1压入栈中，栈中元素为-1
 * "PSH2"表示将2压入栈中，栈中元素为2，-1
 * “MIN”表示获取此时栈中最小元素==>返回-1
 * "TOP"表示获取栈顶元素==>返回2
 * "POP"表示弹出栈顶元素，弹出2，栈中元素为-1
 * "PSH-1"表示将1压入栈中，栈中元素为1，-1
 * "TOP"表示获取栈顶元素==>返回1
 * “MIN”表示获取此时栈中最小元素==>返回-1
 */
public class JZ20包含min函数的栈 {

    /**
     * 这里就体现出刷题的好处了，刷的多了就会遇到重复的题目。
     *
     * 思路有了之后便是逻辑编码 再就可以迎刃而解了。
     *
     * 本题收录在 《程序员代码面试指南》的第一题。
     * 我是用的是 两个栈，[一个只存最小值（值唯一），一个存原值] 的省空间方法。
     * 还有[维护高度相同的两个栈，一个存原值，一个存最小值] 的省时间方法。
     */

    public class Solution {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> mainStack = new Stack<>();


        public void push(int node) {
            stack.push(node);
            if(mainStack.isEmpty()){
                mainStack.push(node);
            } else  if(node <= mainStack.peek()){
                mainStack.push(node);
            }
        }

        public void pop() {
            int popNode=stack.pop();
            if(popNode == mainStack.peek()){
                mainStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return mainStack.peek();
        }
    }
}
