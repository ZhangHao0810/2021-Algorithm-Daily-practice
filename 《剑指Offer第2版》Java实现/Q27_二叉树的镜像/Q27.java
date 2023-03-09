package Q27_二叉树的镜像;

/**
 * @author ZhangHao
 * @date 2020/3/11 9:44
 * @Description： 得到二叉树的镜面对称.
 */
public class Q27 {

    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        //将节点的左右孩子互换位置.(因为树的结构特性,换了左右孩子,左右孙子们也就自动换了. 很吊.)
        swap(root);
//        递归左右孩子.
        Mirror(root.left);
        Mirror(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
