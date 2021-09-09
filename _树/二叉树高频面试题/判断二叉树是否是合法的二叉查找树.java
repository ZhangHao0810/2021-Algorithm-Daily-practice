package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:50
 * 一棵BST定义为：
 * 节点的左子树中的值要严格小于该节点的值。
 * 节点的右子树中的值要严格大于该节点的值。
 * 左右子树也必须是二叉查找树。
 * 一个节点的树也是二叉查找树。
 */
public class 判断二叉树是否是合法的二叉查找树 {
    public int lastVal = Integer.MAX_VALUE;
    public boolean firstNode = true;
    public boolean isValidBST(TreeNode root) {
        // write your code here
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(!firstNode&&lastVal >= root.val){
            return false;
        }
        firstNode = false;
        lastVal = root.val;
        return isValidBST(root.right);
    }
}
