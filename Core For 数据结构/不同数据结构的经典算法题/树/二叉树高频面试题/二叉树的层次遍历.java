package 二叉树高频面试题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:48
 */
public class 二叉树的层次遍历 {
    ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(int i = 0;i < size ;i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
