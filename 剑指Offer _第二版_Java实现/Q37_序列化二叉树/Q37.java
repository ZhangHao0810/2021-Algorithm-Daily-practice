package Q37_序列化二叉树;

/**
 * @author ZhangHao
 * @date 2020/3/18 19:02
 * @Description： 实现两个函数，分别用来序列化和反序列化二叉树。
 */
public class Q37 {

    private String deserializeStr;

    public String Serialize(TreeNode root) {
//        当root是叶子的 子节点. 返回#
        if (root == null)
            return "#";
//        前序遍历.
        return root.val + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    public TreeNode Deserialize(String str) {
        deserializeStr = str;
        return Deserialize();
    }

    /** 2020/3/18 19:09
     * 将字符串以空格为间隔的字符颠倒位置.  也用到了迭代.
    */
    private TreeNode Deserialize() {
        if (deserializeStr.length() == 0)
            return null;
//        找到第一个空格的位置. 如果没有空格,就返回-1;
        int index = deserializeStr.indexOf(" ");
//        保存第一个.
        String node = index == -1 ? deserializeStr : deserializeStr.substring(0, index);
//        原字符串扣去第一个.
        deserializeStr = index == -1 ? "" : deserializeStr.substring(index + 1);

//        到根节点了.返回null
        if (node.equals("#"))
            return null;
//        得到结点值.
        int val = Integer.valueOf(node);
//        将节点保存到TreeNode
        TreeNode t = new TreeNode(val);

//        递归遍历,得到左右. 次序跟上面的遍历方式一样,先保存,再遍历左 再遍历右.
        t.left = Deserialize();
        t.right = Deserialize();
        return t;
    }
}
