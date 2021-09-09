package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-18 10:29
 *
 * 递归的思路，太绝了。
 */
public class 求二叉树中叶子节点的个数 {


    int numsOfNoChildNode(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return numsOfNoChildNode(root.left)+numsOfNoChildNode(root.right);
    }


}
