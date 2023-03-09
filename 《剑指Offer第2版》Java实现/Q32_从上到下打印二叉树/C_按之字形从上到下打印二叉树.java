package Q32_从上到下打印二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ZhangHao
 * @date 2020/3/14 10:27
 * @Description： 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 *
 * 用到了 集合工具类的 反转方法.
 *  Collections.reverse(list);
 *
 */
public class C_按之字形从上到下打印二叉树 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
//        用一个插旗标识是否反转.
        boolean reverse = false;
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while (cnt-- > 0) {
                TreeNode node = queue.poll();
                if (node == null)
                    continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if (reverse)
//                关键代码,利用了Collections工具类的reverse方法.
                Collections.reverse(list);
            reverse = !reverse;
//            将这一行元素添加保存.
            if (list.size() != 0)
                ret.add(list);
        }
        return ret;
    }
}
