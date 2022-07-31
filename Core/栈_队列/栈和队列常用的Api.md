# 栈 和 队列 常用的Api

在java中要实现栈和队列，需要用到java集合的相关知识，特别是Stack、LinkedList等相关集合类型。

## 一、栈的实现

栈的实现，有两个方法：一个是用java本身的集合类型Stack类型；另一个是借用LinkedList来间接实现Stack。
### 1.Stack实现

官方建议：使用栈尽量使用ArrayDeque：Deque接口及其实现提供了LIFO堆栈操作的完整操作。

```Deque stack=new ArrayDeque();```

直接用Stack来实现非常方便，常用的api函数如下：

```
boolean isEmpty() // 判断当前栈是否为空
synchronized E peek() //获得当前栈顶元素
synchronized E pop() //获得当前栈顶元素并删除
E push(E object) //将元素加入栈顶
synchronized int search(Object o) //查找元素在栈中的位置，由栈低向栈顶方向数
```

栈又称堆栈  

```boolean empty()```
测试堆栈是否为空。  
```Object peek( )```
查看堆栈顶部的对象，但不从堆栈中移除它。  
```Object pop( )```
移除堆栈顶部的对象，并作为此函数的值返回该对象。  
```Object push(Object element)```
把项压入堆栈顶部。  
```int search(Object element)```
返回对象在堆栈中的位置，以 1 为基数。  

### 2.LinkedList实现

LinkedList 是一个继承于AbstractSequentialList的双向链表。它也可以被当作堆栈、队列或双端队列进行操作。
LinkedList 实现 List 接口，能对它进行队列操作。

实现Deque接口，即能将LinkedList当作双端队列使用。
当LinkedList被当做栈来使用时，常用api及对应关系如下：

```
栈方法  等效方法
push(e)： addFirst(e)
pop()： removeFirst()
peek()： peekFirst()
```

## 二、队列的实现

java中虽然有Queue接口，但java并没有给出具体的队列实现类，而Java中让LinkedList类实现了Queue接口，所以使用队列的时候，一般采用LinkedList。因为LinkedList是双向链表，可以很方便的实现队列的所有功能。

Queue使用时要尽量避免Collection的add()和remove()方法，而是

    offer()加入元素，poll()获取并移出元素。它们的优点是通过返回值可以判断成功与否，
    add()和remove()方法在失败的时候会抛出异常。
    如果要使用前端而不移出该元素，使用element()或者peek()方法。 

java中定义队列 一般这样定义：
	
```Queue queue = new LinkedList();```

当采用LinkedList来实现时，api的使用和对用关系如下：

```
队列方法 等效方法
offer(e) offer(e)/offerLast(e) //进队列，将元素加入队列末尾
poll() poll()/pollFirst() //获取队列头的元素并移除
peek() peek()/peekFirst() //获取队列头的元素 isEmpty() //判断是否为空
```

实例：
```
Queue  queue = new LinkedList ();
queue.offer(1);
queue.offer(2);
queue.offer(3);
System.out.println(queue);
System.out.println(queue.peek());
queue.poll();
System.out.println(queue);
```
双向队列

```
Deque  deque = new LinkedList ();
deque.offer(1);
deque.offer(2);
deque.offerFirst(3);
System.out.println(deque);
deque.pollLast();
System.out.println(deque);
```