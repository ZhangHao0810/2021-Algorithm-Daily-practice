import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-17 10:32
 *
 *  前序遍历： 根，左，右。
 */
public class 前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack =new Stack<>();
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

        //将根节点压入栈中
        stack.push(root);
        //当栈不为空时，出栈的元素插入list尾巴。
        while (!stack.isEmpty()) {
            root=stack.pop();
            list.add(root.val);
            //先放右子树，再放左子树。
            if (root.rightchild != null) stack.push(root.rightchild);
            if (root.leftchild != null) stack.push(root.leftchild);
        }
        return list;
    }
}
