package Q06_从尾到头打印链表;

import java.util.ArrayList;

/**
 * @author ZhangHao
 * @date 2020/2/19 21:44
 * @Description： 链表倒着打印, 相当于打印最后一个,然后再打印剩下的,
 * 剩下的又可以当成一个链表,打印他的最后一个,再打印剩下的
 * 递归完成.
 */
public class _1_递归法 {

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }

        ArrayList<Integer> out = printListFromTailToHead(list.getHead());
        System.out.println(out);


    }

    private static ArrayList<Integer> printListFromTailToHead(Node listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add((Integer)listNode.data);
        }
        return ret;
    }



}