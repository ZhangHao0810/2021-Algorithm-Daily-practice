

import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-08 21:41
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的 min 函数（时间复杂度应为O（1））。
 * 包含 min 函数的栈-解题思路
 *
 * 使用两个 stack，一个作为数据栈，另一个作为辅助栈。其中 数据栈 用于存储所有数据，而 辅助栈 用于存储最小值。
 * [为什么要使用辅助栈而不是直接一个 int min 呢?
 *    wo傻了。这是一个数据结构，如果data栈将当前最小的pop了，那最小值就随之改变了! 可是int min 并不会随之改 ]
 */
public class 包含min函数的栈 {

    Stack<Integer> data=new Stack<>();
    Stack<Integer> min=new Stack<>();


    //data栈和min栈进入元素。
    public void push(int item) {
        data.push(item);
        if (min.size() == 0 || item < min.peek()) {
            min.push(item);
        }else
            min.push(min.peek());//将当前的最小值压入minStack栈中
    }

    //弹出元素
    public void pop(){
        if(data.size() > 0 && min.size() > 0){
            data.pop(); //直接调用data的pop方法
            min.pop(); //minStack也相应的弹出最顶的元素，保证minStack和data的元素数量一致。
        }
    }
    //查询最顶部的元素
    public int top(){
        if(data.size() > 0){
            return data.peek();
        }
        return 0;
    }
    //min栈的栈顶元素，栈顶元素为data栈中现有元素的最小元素
    public int min(){
        if(data.size() > 0 && min.size() > 0){
            return min.peek();
        }
        return 0;
    }
}
