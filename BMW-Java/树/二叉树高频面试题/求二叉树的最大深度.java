package 树.二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-18 10:13
 */
public class 求二叉树的最大深度 {

    int maxDeath(TreeNode node) {
//        到叶子的孩子了。
        if (node == null) {
            return 0;
        }
        int left = maxDeath(node.left);
        int right = maxDeath(node.right);
        return Math.max(left,right)+1;//这个+1是点睛，加的就是形参node。
}

}
