package 二叉树高频面试题;

import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:46
 */
public class 输入一个二叉树和一个整数_打印出二叉树中节点值的和等于输入整数所有的路径 {

    void findPath(TreeNode root,int i){
        if(root == null){
            return;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int currentSum = 0;
        findPath(root, i, stack, currentSum);
    }

    void findPath(TreeNode r,int i,Stack<Integer> stack,int currentSum){
        currentSum+=r.val;
        stack.push(r.val);
        if(r.left==null&&r.right==null){
            if(currentSum==i){
                for(int path:stack){
                    System.out.println(path);
                }
            }
        }
        if(r.left!=null){
            findPath(r.left, i, stack, currentSum);
        }
        if(r.right!=null){
            findPath(r.right, i, stack, currentSum);
        }
        stack.pop();
    }

}
