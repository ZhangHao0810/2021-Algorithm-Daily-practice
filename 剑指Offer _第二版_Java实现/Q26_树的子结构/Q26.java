package Q26_树的子结构;

/**
 * @author ZhangHao
 * @date 2020/3/10 10:47
 * @Description：  判断root2 是不是 root1 的子树.  递归的思想,一定要掌握.
 */
public class Q26 {
    public boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        //或,有一个对就是对. 这里的参数,就是子树的根节点. 所以移动root1,root2 不变.
        return isSubTreeWithRoot(root1, root2) || hasSubTree(root1.left, root2) || hasSubTree(root1.right, root2);
    }

    private boolean isSubTreeWithRoot(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val!=root2.val)
            return false;
        //左子树和左子树比,右边和右边比.  且,有一个错就是错了.
        return isSubTreeWithRoot(root1.left, root2.left) && isSubTreeWithRoot(root1.right, root2.right);
    }
}
