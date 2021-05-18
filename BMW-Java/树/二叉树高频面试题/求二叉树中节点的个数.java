package 树.二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-18 10:29
 */
public class 求二叉树中节点的个数 {

    int numOfTreeNode(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = numOfTreeNode(root.left);
        int right = numOfTreeNode(root.right);
        return left + right + 1;
    }
}
