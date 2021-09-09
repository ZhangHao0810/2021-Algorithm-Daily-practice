import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Super-Zhang
 * @date 2021-05-17 10:51
 * <p>
 * 后序遍历： 左，右，根。
 */
public class 后序遍历 {

    /**
     * ArrayList 当插入到已有位置是，原位置及其之后的元素往后顺移。
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        res.add(0, 1);
        res.add(0, 2);
//        res.add(1, 3);

        System.out.println(res.toString());
        /*输出：
        [2, 1]
        Process finished with exit code 0
         */

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.leftchild != null) stack.push(node.leftchild);
            if (node.rightchild != null) stack.push(node.rightchild);
            res.add(0, node.val); //逆序添加结点值 这个很绝。
        }
        return res;
    }
}
