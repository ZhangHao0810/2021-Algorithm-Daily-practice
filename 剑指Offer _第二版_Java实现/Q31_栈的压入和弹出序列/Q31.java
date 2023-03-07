package Q31_栈的压入和弹出序列;

import java.util.Stack;

/**
 * @author ZhangHao
 * @date 2020/3/13 9:30
 * @Description：
 *  输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序
 *
 *  stack.peek() 返回栈顶元素但不移除
 *  stack.pop()  返回栈顶元素,并移除.
 *
 *
 *  1,2,3,4,5 是某栈的压入顺序，序列 4,5,3,2,1 是该压栈序列对应的一个弹出序列
 */
public class Q31 {
    //    用一个栈来模拟压入弹出操作.
    public boolean isPopOrder(int[] pushSequence, int[] popSequence) {
        int n=pushSequence.length;
        Stack<Integer> stack=new Stack<>();
        for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
//            push一个.
            stack.push(pushSequence[pushIndex]);
//            这个while的判断条件是关键.
//            因为pop可能贯穿在每一次的push后,并且pop的次数也可以是多次.
//            如果每次允许pop的元素(stack顶的元素)和popSequence的前面元素一致,说明成功pop pop索引+1;
            while (popIndex < n && !stack.isEmpty()
                    && stack.peek() == popSequence[popIndex]) {
//                再pop出去
                stack.pop();
                popIndex++;
            }
        }
//        如果最后是空,表示push的都pop出去了,所以第二个序列就可以满足要求.
        return stack.isEmpty();

    }
}
