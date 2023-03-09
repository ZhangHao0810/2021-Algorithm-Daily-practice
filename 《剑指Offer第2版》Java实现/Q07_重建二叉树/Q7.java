package Q07_重建二叉树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangHao
 * @date 2020/2/20 20:50
 * @Description： 考察二叉树的相关知识.
 * 前序遍历的第一个值为根节点的值, 使用这个值将中序遍历结果分成两部分
 * 左部分为树的左子树中序遍历结果,右部分为右子树的中序遍历结果.
 */
public class Q7 {

    public static void main(String[] args) {

//        前序遍历
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
//        中序遍历
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

        BinTree result = reConstructBinaryTree(pre, in);

        System.out.println(result.getData());

    }

    // 缓存中序遍历数组每个值对应的索引
    private static Map<Integer, Integer> indexForInOrders = new HashMap<>();

    private static   BinTree reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++) {
//            key为值, value为中序遍历的索引.
            indexForInOrders.put(in[i], i);
        }
        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
    }

    private static BinTree reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR)
            return null;
        BinTree root = new BinTree(pre[preL]);
        int inIndex = indexForInOrders.get(root.getData());
        int leftTreeSize = inIndex - inL;
        root.setlChild(reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL));
        root.setrChild(reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1));
        return root;
    }





}
