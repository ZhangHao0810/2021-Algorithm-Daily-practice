package Q08_二叉树的下一个节点;

/**
 * @author ZhangHao
 * @date 2020/2/21 18:32
 * @Description： 如果节点的右子树不为空, 那么下一个节点是右子树的最左节点.
 * 如果为空,向上找第一个 该节点在祖节点左子树 的祖先节点.
 */
public class Q8 {

    public TreeLinkNode getNext(TreeLinkNode pNode) {
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;//node 为右子树的最左节点.
        } else {
            while (pNode.father != null) {
                TreeLinkNode father = pNode.father;
                if (father.left == pNode) {
                    return father;
                }
                pNode = pNode.father;
            }
        }

        return null;

    }

}
