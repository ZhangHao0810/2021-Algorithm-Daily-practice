package 栈和队列;

import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-08 17:36
 *
 * 有效的括号-题目描述
 *
 * 给定一个只包括 ‘(‘，’)’，’{‘，’}’，’[‘，’]’ 的字符串，判断字符串是否有效。
 *
 * 说明：有效字符串需满足
 *
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合。
 *
 *
输入：{[]}
输出：true
 */
public class 判断括号字符串中的括号是否有效 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
//                是左括号，入栈。
                stack.push(ch);
            } else {
//                如果括号不是左括号
                if (stack.isEmpty()) {
                    return false;
                }
//                如果括号不是左括号，弹出栈顶
                //判断元素是否同栈顶元素匹配
                char topChar = stack.pop();
                if (ch == ')' && topChar != '(') {
                    return false;
                } else if (ch == ']' && topChar != '[') {
                    return false;
                } else if (ch == '}' && topChar != '{') {
                    return false;
                }
            }
        }
//        如果栈空了也没有返回值的话，
        return stack.isEmpty();
    }
}
