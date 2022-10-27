package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:23
 */
public class 翻转二叉树or镜像二叉树 {

    TreeNode mirrorTreeNode(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = mirrorTreeNode(root.left);
        TreeNode right = mirrorTreeNode(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
