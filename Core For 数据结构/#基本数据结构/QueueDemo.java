

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @author Super-Zhang
 * @date 2021-03-20 20:09
 *
 *  java 中的 Queue 接口 继承自Collection接口
 *
 *  Queue 用来存放 等待处理元素 的集合，这种场景一般用于缓冲、并发访问。
 *  Deque, LinkedList, PriorityQueue, BlockingQueue 等类都实现了它。
 *
 *  【Linkedlist】 是queue的实现类，但是可以添加null
 *  其他的都不建议添加null，否则 poll 和peek在异常时候返回null，不好判断。
 *
 *  【Priority Queue】 并不是先进先出的，顺序是根据自然排序或者自定义comparator的。
 *
 */
public class QueueDemo {

    public static void main(String[] args) {
//        点击 查看Queue的源码。
        Queue queue = new ArrayDeque();

//        头部添加
        queue.add(123);
//        尾部添加
        queue.offer(456);

//        remove and poll 都是删除并返回头部
//          队列空时 poll返回null，remove报异常
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);

//        element and peek 都是获取元素。【queue先进先出】
//        队列空时 peek返回null，element报异常
        System.out.println(queue.element());
        System.out.println(queue.peek());
    }

}
