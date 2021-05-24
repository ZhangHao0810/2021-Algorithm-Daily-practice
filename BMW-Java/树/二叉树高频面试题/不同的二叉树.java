package 树.二叉树高频面试题;

/**
 * @author Super-Zhang
 * @date 2021-05-24 9:49
 * 给出 n，问由 1…n 为节点组成的不同的二叉查找树有多少种？
 */
public class 不同的二叉树 {
    int numTrees(int n ){
        int[] counts = new int[n+2];
        counts[0] = 1;
        counts[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 0;j<i;j++){
                counts[i] += counts[j] * counts[i-j-1];
            }
        }
        return counts[n];
    }
}
