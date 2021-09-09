package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:45
 */
public class 在二叉树中插入节点 {
    TreeNode insertNode(TreeNode root,TreeNode node){
        if(root == node){
            return node;
        }
        TreeNode tmp ;
        tmp = root;
        TreeNode last = null;
        while(tmp!=null){
            last = tmp;
            if(tmp.val>node.val){
                tmp = tmp.left;
            }else{
                tmp = tmp.right;
            }
        }
        if(last!=null){
            if(last.val>node.val){
                last.left = node;
            }else{
                last.right = node;
            }
        }
        return root;
    }
}
