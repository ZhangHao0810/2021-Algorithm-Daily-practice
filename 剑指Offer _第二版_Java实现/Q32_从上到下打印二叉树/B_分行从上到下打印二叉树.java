package Q32_从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ZhangHao
 * @date 2020/3/14 10:04
 * @Description： 按层打印二叉树.
 * 同一层的节点按从左到右的顺序打印,每一层打印到一行.
 * <p>
 * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
 */
public class B_分行从上到下打印二叉树 {
    /**
     * 2020/3/14 10:05
     * 思路和A 一样.
     */

    public ArrayList<ArrayList<Integer>> print(TreeNode root) {
//        注意,LinkedList 是Queue的实现类.
        Queue<TreeNode> queue = new LinkedList<>();
//        ArrayList里面套ArrayList
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        queue.add(root);
//        外层while循环表示层.
        while (!queue.isEmpty()) {
            ArrayList<Integer> list=new ArrayList<>();
//            cut保存这一层的元素数量.
            int cut=queue.size();
//            内层while循环保证遍历这一层的每一个元素. 并add进list
            while (cut-- > 0) {
                TreeNode treeNode = queue.poll();
                if (treeNode == null)
                    continue;
//                添加进表示这一层元素的list中.
                list.add(treeNode.val);
                queue.add(treeNode.left);
                queue.add(treeNode.right);
            }
            if (list.size() != 0) {
                ret.add(list);
            }
        }
        return ret;

    }
}
