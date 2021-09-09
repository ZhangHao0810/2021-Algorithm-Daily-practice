package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:25
 *
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 */
public class 求两个二叉树的最低公共祖先节点 {

    TreeNode getLastCommonParent(TreeNode root, TreeNode t1, TreeNode t2) {
        if (findNode(root.left, t1)) {
            if (findNode(root.right, t2)) {
                return root;
            } else {
                return getLastCommonParent(root.left, t1, t2);
            }
        } else {
            if (findNode(root.left, t2)) {
                return root;
            } else {
                return getLastCommonParent(root.right, t1, t2);
            }
        }
    }

    // 查找节点node是否在当前 二叉树中
    boolean findNode(TreeNode root, TreeNode node) {
        if (root == null || node == null) {
            return false;
        }
        if (root == node) {
            return true;
        }
        boolean found = findNode(root.left, node);
        if (!found) {
            found = findNode(root.right, node);
        }
        return found;
    }
}
