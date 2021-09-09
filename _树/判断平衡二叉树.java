/**
 * @author Super-Zhang
 * @date 2021-05-17 14:09
 *
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 */
public class 判断平衡二叉树 {


    /*
    采取后序遍历的方式遍历二叉树的每一个结点。

在遍历到一个结点之前已经遍历了它的左右子树，
那么只要在遍历每个结点的时候记录它的深度（某一结点的深度等于它到叶结点的路径的长度），
就可以一边遍历一边判断每个结点是不是平衡的。
     */

    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }

    /**
     *  递归查找某个结点的深度。
     * @param root
     * @return
     */
    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = getDepth(root.leftchild);
        int right = getDepth(root.rightchild);

        if (Math.abs(left - right) > 1) { //Math.abs() 获取绝对值。
            isBalanced = false;
        }

        return right > left ? right + 1 : left + 1;
    }
}
