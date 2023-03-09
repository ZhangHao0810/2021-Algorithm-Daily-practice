package Q35_复杂链表的复制;

/**
 * @author ZhangHao
 * @date 2020/3/16 10:43
 * @Description：
 *
 * 输入一个复杂链表
 * （每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的 head。
 */
public class Q35 {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;
        // 第一步，在每个节点的后面插入复制的节点。
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        // 第二步，对复制节点的 random 链接进行赋值
        cur = pHead;
        while (cur != null) {
            RandomListNode clone = cur.next;
            if (cur.random != null)
//                cur.random是原节点的random节点, cur.random.next 便是cur.random节点的克隆.所以应该把clone.random指向这个节点.
                clone.random = cur.random.next;
            cur = clone.next;
        }
        // 第三步，将链表拆分成两个一样的链表.
        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (cur.next != null) {
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }

        return pCloneHead;
    }
}
