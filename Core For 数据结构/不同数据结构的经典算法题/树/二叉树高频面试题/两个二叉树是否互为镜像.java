package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:21
 */
public class 两个二叉树是否互为镜像 {

    boolean isMarror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        } else if (t1 == null || t2 == null) {
            return false;
        }

        if (t1.val != t2.val) {
            return false;
        }
        return isMarror(t1.left, t2.right) && isMarror(t1.right, t2.left);
    }
}
