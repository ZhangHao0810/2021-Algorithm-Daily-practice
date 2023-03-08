import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-08-03 11:27
 * <p>
 * 描述
 * 给定某二叉树的前序遍历和中序遍历，请重建出该二叉树并返回它的头结点。(给遍历数组，返回一颗二叉树)
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
 * <p>
 * <p>
 * 提示:
 * 1.0 <= pre.length <= 2000
 * 2.vin.length == pre.length
 * 3.-10000 <= pre[i], vin[i] <= 10000
 * 4.pre 和 vin 均无重复元素
 * 5.vin出现的元素均出现在 pre里
 * 6.只需要返回根结点，系统会自动输出整颗树做答案对比
 * <p>
 * 输入：
 * [1,2,4,7,3,5,6,8],[4,7,2,1,5,3,8,6]
 * 返回值：
 * {1,2,3,4,#,5,6,#,7,#,#,8}
 * <p>
 * 说明：
 * 返回根节点，系统会输出整颗二叉树对比结果
 * <p>
 * 输入：
 * [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
 * 返回值：
 * {1,2,5,3,4,6,7}
 */
public class JZ04重建二叉树 {

    /**
     * 分析
     * <p>
     * 根据中序遍历和前序遍历可以确定二叉树，具体过程为：
     * 根据前序序列第一个结点确定根结点
     * 根据根结点在中序序列中的位置分割出左右两个子序列
     * 对左子树和右子树分别递归使用同样的方法继续分解
     * <p>
     * Arrays.copyOfRange() 左闭右开。 可以适当画个图来做。
     * 注意 题干中方法的返回值。
     * 例如：
     * <p>
     * 前序序列{1,2,4,7,3,5,6,8} = pre
     * 中序序列{4,7,2,1,5,3,8,6} = in
     * <p>
     * 根据当前前序序列的第一个结点确定根结点，为 1
     * 找到 1 在中序遍历序列中的位置，为 in[3]
     * 切割左右子树，则 in[3] 前面的为左子树， in[3] 后面的为右子树
     * 则切割后的左子树前序序列为：{2,4,7}，切割后的左子树中序序列为：{4,7,2}；切割后的右子树前序序列为：{3,5,6,8}，切割后的右子树中序序列为：{5,3,8,6}
     * 对子树分别使用同样的方法分解
     */

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);

        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) { //注意这里左子树要从1开始，因为0位置是根  。  Arrays.copyOfRange(arr,left,right) 范围是左闭右开的。
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i, in.length));
                break;//break 减少无谓的循环。
            }

        }
        return root;

    }
}
