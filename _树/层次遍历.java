import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Super-Zhang
 * @date 2021-05-17 11:24
 */
public class 层次遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            //每一层用一个list存储。
            List<Integer> list = new ArrayList<>();

            while (count > 0) {
                TreeNode node = queue.poll();//poll 出队并返回值。
                list.add(node.val);
                if (node.leftchild != null) {
                    queue.add(node.leftchild);
                }
                if (node.rightchild != null) {
                    queue.add(node.leftchild);
                }
                count--;
            }

            res.add(list);
        }
        return res;
    }
}
