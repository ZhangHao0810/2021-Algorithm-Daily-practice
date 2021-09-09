import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-08-05 9:09
 * <p>
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class JZ18二叉树的镜像 {

    /**
     * 我的做法是：递归 从孩子开始， 换孩子，再往上走，直到换到根的两个孩子。
     * 等做完之后看题解才后知后觉的明白我的遍历是后序遍历。
     *
     * @param pRoot
     * @return
     */
    public TreeNode Mirror(TreeNode pRoot) {
        if (pRoot == null) return pRoot;

        TreeNode left = Mirror(pRoot.left);
        TreeNode right = Mirror(pRoot.right);

        pRoot.right = left;
        pRoot.left = right;

        return pRoot;
    }

    /**
     * BFS 广度优先搜索
     * <p>
     * 遍历每行的每一个节点，交换孩子。
     * 使用Queue 保证了先进先出，poll()沿着树的同一级别来进行。
     */
    public TreeNode Mirror2(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); //poll 移出队列头部元素。
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return root;
    }

    /**
     * DFS 深度优先搜索。
     */
    public TreeNode Mirror3(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return root;
    }
}
