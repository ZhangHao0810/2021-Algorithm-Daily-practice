package Q06_从尾到头打印链表;

/**
 * @author ZhangHao
 * @date 2020/2/19 22:29
 * @Description：
 *
 *      用Java实现了简单的单链表结构.
 */
//    节点类,表示一个节点.
class Node<E> {
    E data;//数据域
    Node<E> next;//指针域,其实就是另外一个节点对象的引用.

    public Node(Node<E> next) {
        this.next = next;
    }

    Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data.toString();
    }

}

//我自己编写的链表类,表示一整条链表.  比较特别的是,该类可以直接返回链表的尾巴节点.
public class LinkedList<E> {
    private Node<E> head;//头节点(是固定的)
    private Node<E> tail;//尾节点(随着插入而往后移动)
    private int size;//大小

    LinkedList() {//构造方法

    }

    Node<E> getHead() {//获得头节点.
        return head;
    }


    void add(E data) {    //添加数据
        Node<E> newNode = new Node<E>(data, null);
        Node<E> p = tail; //p节点作为尾巴节点的暂存节点.
        tail = newNode;
        if (p == null)
            head = newNode;
        else p.next = newNode;
        size++;

    }

    public boolean delete(int i) {//删除第i个节点
        if (i < 0 || i > size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(i));
        if (i == 0) {
            head = head.next;
            size--;
            return true;
        } else {
            int pos = 1;
            Node<E> p = head;
            while (pos < i) {
                p = p.next;
                pos++;
            }
            p.next = p.next.next;
            size--;
            return true;
        }
    }

    public boolean insert(int i, E data) {//插入节点到位置i
        if (i < 0 || i > size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(i));
        if (i == 0) {
            head = new Node<E>(data, head);
            size++;
            return true;
        } else {
            int pos = 1;
            Node<E> p = head;
            while (pos < i) {
                p = p.next;
                pos++;
            }
            p.next = new Node<E>(data, p.next);
            size++;
            return true;
        }
    }

    public boolean contains(E data) {//判断一个数据是否属于链表
        Node<E> p = head;
        while (p != null) {
            if (p.data.equals(data)) return true;
            else {
                p = p.next;
            }
        }
        return false;
    }

    public boolean set(int i, E data) {//修改第i个节点的值
        if (i < 0 || i > size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(i));
        else {
            int pos = 0;
            Node<E> p = head;
            while (pos < i) {
                p = p.next;
                pos++;
            }
            p.data = data;
            return true;
        }
    }

    public E get(int i) {//获得第i个节点的值
        if (i < 0 || i > size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(i));
        else {
            int pos = 0;
            Node<E> p = head;
            while (pos < i) {
                p = p.next;
                pos++;
            }
            return p.data;
        }
    }

    public int getSize() {//获取链表长度
        return size;
    }

    public void clear() {//清空链表
        head = null;
        size = 0;
    }

    private String outOfBoundsMsg(int i) {//输入的i越界
        return "Index: " + i + ", Size: " + size;
    }

}