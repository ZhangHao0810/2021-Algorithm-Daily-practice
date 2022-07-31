package Ⅰ栈和队列;

import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-06-18 21:57
 * <p>
 * 难度 1/4
 * <p>
 * 思路：
 * 不能单独设个变量记录，重点在 pop的时候 还能获得正确的最小值。所以要用两个栈来实现。
 * <p>
 * 提高：
 * 自定义类的写法，构造方法。
 * 抛出运行时异常
 * 复习栈的API  pop,peek,push
 */
public class _1_设计一个有getMin功能的栈 {
    public static void main(String[] args) {

        StackPlus stackPlus = new StackPlus();

        stackPlus.push(3);
        stackPlus.push(5);
        stackPlus.push(2);
        System.out.println(stackPlus.getMin());

        stackPlus.push(1);
        stackPlus.push(2);
        System.out.println(stackPlus.getMin());

    }

}

class StackPlus {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    //类一定要有构造函数！
    StackPlus() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum) {

        this.stackData.push(newNum);

        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            this.stackMin.push(newNum);
        }

    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is Empty");
        }
        int value = this.stackData.pop();

        if (value == this.getMin()) {
            this.stackMin.pop();
        }

        return value;
    }

    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is Empty");
        }
        return this.stackMin.peek();//返回头结点。
    }

}
