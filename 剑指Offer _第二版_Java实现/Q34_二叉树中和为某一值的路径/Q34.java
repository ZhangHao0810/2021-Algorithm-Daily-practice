package Q34_二叉树中和为某一值的路径;

import java.util.ArrayList;

/**
 * @author ZhangHao
 * @date 2020/3/15 14:06
 * @Description： 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。  某二叉树有两条和为 22 的路径：10, 5, 7 和 10, 12
 */
public class Q34 {
//    每一个元素是一条路径,ret保存所有的路径.
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
        if (node == null)
            return;
//        将该节点添加到路径中,并调整target的值.
        path.add(node.val);
        target -= node.val;

        //已遍历到叶节点并且路径和为target，则把当前路径添加到输出列表里
        //因为add添加的是引用，如果不new一个的话，最终list保存到的只是最后一个path
        if (target == 0 && node.left == null && node.right == null) {
//            找到一个路径序列,作为一个元素添加进ret.
            ret.add(new ArrayList<>(path));
        } else {
//            没有找到序列,接着往下找.元素存在path.
            backtracking(node.left, target, path);
            backtracking(node.right, target, path);
        }
//        ArrayList索引从0开始,size返回个数,从1开始. 所以得到最后的索引就是size()-1
        //已到叶节点之后会跳过两个递归函数到这里，此时要把最后一个结点从路径中删除，才能返回上层结点
//        遍历左孩子, 结束后 node回到叶子父亲,需要删除path存储的左叶子.
//        递归完成,执行第二行,即右递归
//        遍历右孩子, 结束后,node回到叶子父亲,需要删除path存储的右叶子.
//        递归完成 再往下,便没有递归
//        node应该去叶子爷爷位置, 需要删除path存储的叶子父亲.
//        这行代码比较关键，可以看成是回溯（深度优先搜索）的思想
        path.remove(path.size() - 1);
    }
}
