import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-08-08 19:50
 *
 * 描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。
 *
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class JZ21栈的压入_弹出序列 {

    /**
     * 还是遇到的少了，没能把情况考虑全面。
     *
     * 关于栈， 一定要考虑双向的情况，不能只push不pop，反之亦然。
     */

    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            Stack<Integer> stack = new Stack<>();
            int popNum=0;

            for(int i=0;i<pushA.length;i++){
                stack.push(pushA[i]);
                //while 不断对比栈顶元素，检查了 pushA压栈过程中出栈的情况。
                while(!stack.empty()&&stack.peek()==popA[popNum]){
                    stack.pop();
                    popNum++;
                }
            }
            return stack.empty();//熟练使用Stack的API
        }
    }
}
