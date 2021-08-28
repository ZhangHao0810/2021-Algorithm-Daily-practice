import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Super-Zhang
 * @date 2021-08-08 20:07
 *
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class JZ22从上往下打印二叉树 {

    /**
     * 之前的积累派上用场了，但是一定要多复习。不然就会遇到 知道怎么做，明知道很简单，就是写不出来的尴尬。
     *
     * 牛客的编译器有点猫饼 不能返回null，记住要返回Null的时候，new 一个相应的对象返回它。
     */

//    if(root==null) return new ArrayList();
//    if(root==null) return null; //报NullPointerException


    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        if(root==null) return new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        return list;
    }
}
