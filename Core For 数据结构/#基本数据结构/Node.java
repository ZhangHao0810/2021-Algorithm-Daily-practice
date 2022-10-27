/**
 * 全局使用的Node类
 * @author Super-Zhang
 * @date 2021-04-21 11:31
 */
public class Node {

    public String value;
    public Node next;

    public  Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    /**
     * 最终返回的就是末位的node， 但是 最开始调用的的参数node是head
     * @param i node 的长度 也是 node 的value值 。
     * @param node
     * @return
     */
    public static Node createNodes(Integer i, Node node) {
        if (i <= 0) {
//            Node last = new Node("NULL", null);
//            node.next=last;
//            return last;
            return node;
        }
        Node next = new Node(i.toString(), null);
        node.next = next;

        return createNodes(i - 1, next);
    }

}