package Ⅰ栈和队列;

import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-10-09 11:16
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add，poll，peek)
 * 栈： push , pop , peek
 * 队列：offer或add , poll , peek
 */
public class _2_由两个栈组成的队列 {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public _2_由两个栈组成的队列(){
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    //push栈向pop栈倒入数据
    private void pushToPop(){
        if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int pushInt){
        stackPush.push(pushInt);
        pushToPop();

    }

    public int poll(){
        if (stackPop.empty() && stackPush.empty()){
            throw  new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.peek();
    }

}
