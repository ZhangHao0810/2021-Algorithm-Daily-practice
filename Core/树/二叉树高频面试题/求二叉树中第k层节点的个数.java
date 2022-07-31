package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-18 10:30
 */
public class 求二叉树中第k层节点的个数 {
    int numsOfkLevelTreeNode(TreeNode root,int k){
        if(root == null||k<1){
            return 0;
        }
        if(k==1){
            return 1;
        }
        int numsLeft = numsOfkLevelTreeNode(root.left,k-1);
        int numsRight = numsOfkLevelTreeNode(root.right,k-1);
        return numsLeft + numsRight;
    }
}
