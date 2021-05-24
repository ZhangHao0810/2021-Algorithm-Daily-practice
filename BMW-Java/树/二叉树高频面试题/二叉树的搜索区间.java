package 树.二叉树高频面试题;

import java.util.ArrayList;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:47
 *
 * 给定两个值 k1 和 k2（k1 < k2）和一个二叉查找树的根节点。找到树中所有值在 k1 到 k2 范围内的节点。
 * 即打印所有x (k1 <= x <= k2) 其中 x 是二叉查找树的中的节点值。返回所有升序的节点值。
 */
public class 二叉树的搜索区间 {
    ArrayList<Integer> result;
    ArrayList<Integer> searchRange(TreeNode root,int k1,int k2){
        result = new ArrayList<Integer>();
        searchHelper(root,k1,k2);
        return result;
    }
    void searchHelper(TreeNode root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.val>k1){
            searchHelper(root.left,k1,k2);
        }
        if(root.val>=k1&&root.val<=k2){
            result.add(root.val);
        }
        if(root.val<k2){
            searchHelper(root.right,k1,k2);
        }
    }
}
