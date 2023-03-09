package Q36_二叉搜索树与双向链表;

/**
 * @author ZhangHao
 * @date 2020/2/21 18:31
 * @Description： 二叉树类
 */
public class TreeNode {

    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode father = null;

    TreeNode(int val) {
        this.val = val;
    }
}