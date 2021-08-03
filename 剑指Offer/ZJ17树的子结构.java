/**
 * @author Super-Zhang
 * @date 2021-08-03 14:40
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class ZJ17树的子结构 {
    /**
     * 树结构，递归思想。
     *
     * 思考了一下，看完题解之后思路清晰地完整给出了解答。
     * 但又遇到了空指针异常，一定要注意分析链表，树节点的最后null的情况。
     */

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null) return false;
        boolean result=false;
        if(root1.val==root2.val){
            result = HashSubtreeHelper(root1,root2);
        }
        if(!result) result = HasSubtree(root1.left,root2);
        if(!result) result = HasSubtree(root1.right,root2);
        return result;
    }

    public boolean HashSubtreeHelper(TreeNode  root1,TreeNode root2){
        if(root2==null) return true;  //这里的讨论很重要，子结构只是一部分。
        if(root1==null) return false;
        if(root1.val!=root2.val) return false;
        return HashSubtreeHelper(root1.left,root2.left)&&HashSubtreeHelper(root1.right,root2.right);
    }

}
