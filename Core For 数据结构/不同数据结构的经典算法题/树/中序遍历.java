import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-17 10:37
 * <p>
 * 中序遍历：左，根，右。
 */
public class 中序遍历 {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        // 好屌。
        while (root != null||!stack.isEmpty()) {
            //不断遍历左孩子。
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;

    }
}
