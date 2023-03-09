package Q08_二叉树的下一个节点;

/**
 * @author ZhangHao
 * @date 2020/2/21 18:31
 * @Description： 二叉树类
 */
public class TreeLinkNode {

    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode father = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}