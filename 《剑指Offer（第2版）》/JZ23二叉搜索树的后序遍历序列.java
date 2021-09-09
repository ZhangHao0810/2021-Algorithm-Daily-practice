import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-08-18 8:49
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。
 * 假设输入的数组的任意两个数字都互不相同。（ps：我们约定空树不是二叉搜索树）
 *
 *
 * 二叉搜索树是一种节点值之间具有一定数量级次序的二叉树，对于树中每个节点：
 * 若其左子树存在，则其左子树中每个节点的值都不大于该节点值；
 * 若其右子树存在，则其右子树中每个节点的值都不小于该节点值。
 */
public class JZ23二叉搜索树的后序遍历序列 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length<1) return false;

        Stack<Integer> roots = new Stack<>();
        roots.push(Integer.MIN_VALUE);
        int max = Integer.MAX_VALUE;

        for(int i=sequence.length-1;i>-1;i--){

            if(sequence[i]>max) return false;

            while(sequence[i]<roots.peek()){ //这里使用while，栈中存着顶到底 大到小的数据， 非常巧妙，多练几遍。
                max = roots.pop();
            }

            roots.push(sequence[i]);
        }

        return true;
    }
}
