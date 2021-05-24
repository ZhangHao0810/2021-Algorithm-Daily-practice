package 树.二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-18 10:13
 *
 * 二叉树的题目普遍可以用递归和迭代的方式来解。
 */
public class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;


    TreeNode( TreeNode node){
        this.val = node.val;
        this.left = node.left;
        this.right = node.right;
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(){
    }
}
