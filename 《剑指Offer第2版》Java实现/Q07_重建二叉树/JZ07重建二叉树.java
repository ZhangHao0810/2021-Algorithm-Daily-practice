package Q07_重建二叉树;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-08-03 11:27
 * @update 2023年3月29日11:49:38
 * 前中后序 指的是 根节点的遍历顺序。
 * 描述
 * 给定某二叉树的前序遍历和中序遍历，请重建出该二叉树并返回它的头结点。(给遍历数组，返回一颗二叉树)
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
 * 说明：
 * 返回根节点，系统会输出整颗二叉树对比结果
 * 输入：
 * [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
 * 返回值：
 * {1,2,5,3,4,6,7}
 */
public class JZ07重建二叉树 {

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

    @Test
    public void main() {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

        TreeNode root = reConstructBinaryTree(pre, in);
        // 打印前序和中序遍历进行验证
        TreeNode.preorder(root);
        System.out.println();
        TreeNode.inorder(root);

    }

    /**
     * @description 根据前序和中序遍历，重建二叉树，并返回跟节点。
     * @author zh
     * @data 2023/3/29
     */
    private TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length==0 || in.length==0) {
            return null;
        }

        TreeNode root = new TreeNode(pre[0]);

        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                // 注意，递归的不是左右字数，而是前序和中序遍历的树数组。
                root.leftChild = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.rightChild = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
                break;
            }
        }

        return root;
    }

}
