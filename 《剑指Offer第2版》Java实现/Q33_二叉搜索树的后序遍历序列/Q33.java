package Q33_二叉搜索树的后序遍历序列;

/**
 * @author ZhangHao
 * @date 2020/3/14 10:44
 * @Description： 输入一个整数数组,判断该数组是不是某二叉搜索树的后序遍历结果.
 * 假设输入数组的任意两个数字都不重复.
 *
 * 二叉排序树（Binary Sort Tree），又称二叉查找树（Binary Search Tree），亦称二叉搜索树。
 *
 *  注意二叉搜索树的特征:
 *
 * （1）若左子树不空，则左子树上所有结点的值均小于它的根结点的值；
 *
 * （2）若右子树不空，则右子树上所有结点的值均大于它的根结点的值；
 *
 * （3）左、右子树也分别为二叉排序树；
 *
 * （4）没有键值相等的节点。
 */
public class Q33 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return verify(sequence, 0, sequence.length - 1);
    }

    /** 2020/3/14 10:55
     * 二叉搜索树,分三部分, 最后一个元素是根节点, 前半部分是根节点的左子树,都比根节点小, 后半部分是右子树,都比根节点大!
    */
    private boolean verify(int[] sequence, int first, int last) {
        if (last - first <= 1)
            return true;
        int rootVal = sequence[last];

//        后部分首元素的插旗.
        int cutIndex = first;
//        找到前部分和后部分的临界值点,  while后cutIndex就是后部分的第一个元素索引.
//        在这个过程当中也同时判断了前部分了.
        while (cutIndex < last && sequence[cutIndex] <= rootVal)
            cutIndex++;

//        判断后部分是否满足特征..
        for (int i = cutIndex; i < last; i++)
            if (sequence[i] < rootVal)
                return false;
//        对前部分和后部分再分别判断. 注意last是根节点.
        return verify(sequence, first, cutIndex - 1) && verify(sequence, cutIndex, last - 1);
    }
}
