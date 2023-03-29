package Q07_重建二叉树;

/**
 * @author Super-Zhang
 * @date 2021-05-17 10:33
 * @update 2023年3月29日13:40:17
 * 二叉树的节点类，同时有 前中后 三个序 遍历的方法
 */
public class TreeNode {

    private Object data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode() {

    }

    private static void visit(Object obj) {
        System.out.print(obj + " ");
    }

    //先序遍历
    public static void preorder(TreeNode root) {
        if (root != null) {
            visit(root.data);
            preorder(root.leftChild);
            preorder(root.rightChild);
        }

    }

    //中序遍历
    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.leftChild);
            visit(root.data);
            inorder(root.rightChild);
        }

    }

    //后序遍历
    public static void afterorder(TreeNode root) {
        if (root != null) {
            afterorder(root.leftChild);
            afterorder(root.rightChild);
            visit(root.data);
        }

    }

}
