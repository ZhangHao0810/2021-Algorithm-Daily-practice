package Q32_从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ZhangHao
 * @date 2020/3/14 9:48
 * @Description： 从上到下打印二叉树的每个节点, 同一层的节点按照从左到右的顺序打印.
 * <p>
 * 考察的是二叉树的遍历算法,不过不是前序中序后序. 而是按层的遍历.  用到队列.
 * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
 * <p>
 * 太吊了. 神奇.
 */
public class A_不分行从上到下打印二叉树 {
    /**
     * 2020/3/14 9:50
     * 使用队列来进行层次遍历。
     * <p>
     * 不需要使用两个队列分别存储当前层的节点和下一层的节点，
     * 因为在开始遍历一层的节点时，当前队列中的节点数就是当前层的节点数
     * 只要控制遍历这么多节点数，就能保证这次遍历的都是当前层的节点。
     */
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int cut = queue.size();
//            队列的长度一开始是1,所以内while只走一次,即走第一层.
//            但是走完之后,就会把下一层的加入,即左右孩子,长度就不是1了. 所以内层while的条件不能单纯的是queue.size()!=0
//            走完内层循环,其实队列里还有内容, 二叉树还有节点没有被输出,外层循环保证了所有的都会被遍历.
//            下一次循环会再保存一下长度,即上一层的数量.把这些数量while完,这一层就over 再有 就是再再下一层的了.
            while (cut-- > 0) {
                TreeNode t = queue.poll();
                if (t == null) {
                    continue;
                }
                ret.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
        }
        return ret;

    }
}
