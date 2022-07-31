

import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-14 9:48
 * 包含 + - * / 和括号的数学表达式。
 *
 *  牛逼！
 */
public class 表达式求值 {

    static Stack<Integer> number = new Stack<>();
    static Stack<Character> operate = new Stack<>();

    /**
     * 设定符号优先级。
     *
     * @param c
     * @return
     */
    static int cLevel(char c) {
        switch (c) {

            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
        }
        return 0;
    }

    /**
     * 对栈进行操作。
     */
    static void dealStack() {
        char operate1 = operate.pop();
//        将number的俩出抛出，最俩数进行operate栈顶的符号对应的计算。
        int num1 = number.pop();
        int num2 = number.pop();

        switch (operate1) {
            case '+':
                number.push(num1 + num2);
                break;
            case '-':
                number.push(num1 - num2);
                break;
            case '*':
                number.push(num1 * num2);
                break;
            case '/':
                number.push(num1 / num2);
                break;
        }
    }

    /**
     * 返回String表达式的值。
     *
     * @param s
     */
    static int method(String s) {

        s = "(" + s + ")";

        while (!operate.isEmpty()) {
            operate.pop();
        }
        while (!number.isEmpty()) {
            number.pop();
        }

        //遍历String
        for (int i = 0; i < s.length(); i++) {
            char tem = s.charAt(i);

            //字符为数字字符。
            if (tem >= '0' && tem <= '9') {
                int num = tem - '0';
                //将下一位数字加入这个数字，构成多位数
                while (i != s.length() - 1 && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <='9') {

                    i++;
                    num = num * 10 + s.charAt(i) - '0';
                }
                //将这个数存入数的栈
                number.push(num);
            }

            else if (tem == '(') {
                operate.push(tem);
            }

            //读到的字符为操作字符。
            else if (tem == '+' || tem == '-' || tem == '*' || tem == '/') {
                // 栈顶的优先级高于即将入栈的操作符。则运行计算。否则入栈。
                while (!operate.isEmpty() && cLevel(tem) < cLevel(operate.peek())) {
                    dealStack();
                }
                operate.push(tem);
            } else if (tem == ')') {
                //匹配左括号。  计算括号内的内容。
                while (!operate.peek().equals('(')) {
                    dealStack();
                }
                //把左括号抛出。
                operate.pop();
            }

        }

        return number.pop();

    }

    public static void main(String[] args) {

        String s = "8*2+1";
        System.out.println(method(s));
    }

}
