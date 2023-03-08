package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:17
 */
public class 两个二叉树是否完全相等 {

    boolean isSameTreeNode(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        } else if (t1 == null || t2 == null) {
            return false;
        }

        if (t1.val != t2.val) {
            return false;
        }

        boolean left = isSameTreeNode(t1.left, t2.left);
        boolean right = isSameTreeNode(t1.right, t2.right);

        return left && right;
    }
}
