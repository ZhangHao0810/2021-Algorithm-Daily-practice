package 树.二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-18 10:15
 */
public class 求二叉树的最小深度 {

    int getMinDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getMin(root);
    }

    //因为是比小。所以最终叶子的孩子部分要处理，返回值要给他一个很大的数，
    int getMin(TreeNode root) {
//        root是叶子的孩子。
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        //root是叶子
        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = getMin(root.left);
        int right = getMin(root.right);

        return Math.min(left, right) + 1;
    }

}
