package Q28_对称的二叉树;

/**
 * @author ZhangHao
 * @date 2020/3/11 19:41
 * @Description： 判断一个二叉树是否是对称的.
 */
public class Q28 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;
//这里的迭代是关键, 对称的样子要很清楚.
        return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
    }
}
