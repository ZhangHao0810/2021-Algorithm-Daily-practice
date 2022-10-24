package 二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:37
 *
 *
 * 前序与中序遍历序列构造二叉树 中序与后序遍历序列构造二叉树
 * https://www.cnblogs.com/dong973711/p/10887392.html
 */
public class 前序遍历和后序遍历构造二叉树 {
    int[] pre, post;

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        this.pre = pre;
        this.post = post;
        return make(0, 0, pre.length);
    }

    public TreeNode make(int i0, int i1, int N) {
        if (N == 0) return null;
        TreeNode root = new TreeNode(pre[i0]);
        if (N == 1) return root;

        int L = 1;
        for (; L < N; ++L)
            if (post[i1 + L-1] == pre[i0 + 1])
                break;

        root.left = make(i0+1, i1, L);
        root.right = make(i0+L+1, i1+L, N-1-L);
        return root;
    }

}
