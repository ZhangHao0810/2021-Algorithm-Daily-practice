package Q36_二叉搜索树与双向链表;

/**
 * @author ZhangHao
 * @date 2020/3/17 10:15
 * @Description：
 *
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * 二叉搜索树的特点反应在中序遍历上,中序遍历是先左孩子,父亲,右孩子 二叉搜索树的中序遍历就是对节点的增排序
 *
 *
 * 二叉树中，每个节点有两个指向子节点的节点。双向链表中，也有两个分别指向两端的节点，一前一后。
 * 鉴于这两种数据结构的结构相似，因此理论上是可以实现二叉搜索树和排序的双向链表的转换的。
 * 二叉搜索树——左子节点的值总是小于父节点的值，右子节点的值总是大于父节点的值
 * 在将二叉搜索树转换成排序双向链表时，原先指向左子节点调整为链表中的前向节点，右子节点调整为链表中的后向节点
 */

/** 2020/3/17 10:40
 * 想要看懂这个算法,一定要把引用和实际的对象做好区分. 不然不好理解草图.
*/
public class Q36 {

    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode root) {
        inOrder(root);
        return head;
    }

    /** 2020/3/17 11:13
     * 理解这个递归函数的关键,是理解二叉树的中序遍历
     *
     * public static void 中序遍历(Node root){
     *     if(root!=null){
     *         中序遍历(root.left);
     *         print();
     *         中序遍历(root.right);
     *     }
     * }
    */
    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);

//      pre是排序(中序遍历之后)位于node前面的值.node是中序遍历递归的变,pre是被动的变.之后pre位置OK了,再变.
//        left一直是指向前面的.这一句保证了爷爷可以指向左边的最右孙子. 右边的左孙子也能指向爷爷.只要当node是左叶子的时候,这句话代码是废话.
        node.left = pre;
        if (pre != null)
//            pre的right指向了更大的值,也就是node. 只有当node是右叶子的时候,这句代码是废话.
            pre.right = node;
//       pre左右已经指向好,pre变成更大的node值.等待node接下来的中序遍历.
        pre = node;
        if (head == null)
            head = node;


//        接着再中序遍历,node往更大的值的位置走.
        inOrder(node.right);
    }
}
