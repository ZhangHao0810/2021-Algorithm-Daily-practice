package 栈和队列;

import javax.swing.*;
import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-08 21:29
 * <p>
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序
 */
public class 栈的压入_弹出序列 {

    public boolean isPopOrder(int pPush[], int pPop[]) {
        boolean bPoosible = false;
        if (pPush.length == 0 || pPop.length == 0) {
            bPoosible = false;
        }
        Stack<Integer> stack = new Stack<>();
        //标识弹出序列的位置
        int popIndex = 0;
        for (int i = 0; i < pPush.length; i++) {
            stack.push(pPush[i]);
            while (!stack.isEmpty() && stack.peek() == pPop[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        if (stack.isEmpty() && pPop.length - 1 == popIndex) {
            bPoosible = true;
        } else
            bPoosible = false;

        return bPoosible;
    }

}
