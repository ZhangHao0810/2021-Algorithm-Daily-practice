
## Java 数据结构与算法每日一练 
起始时间
2021年3月20日19:56:09

## 算法篇

### 经典算法

#### 排序八大算法

插入排序  
[直接排序](src/排序/插入排序/Straight_Insertion_Sort.java)  
[希尔排序](src/排序/插入排序/Shell_Sort.java)

选择排序  
[简单选择排序](src/排序/选择排序/Simple_Selection_Sort.java)
[简单选择排序改进](src/排序/选择排序/Simple_Selection_Sort_2.java)  
[堆排序](src/排序/选择排序/Heap_Sort.java)  

交换排序：  
[冒泡排序](src/排序/交换排序/Bubble_Sort.java)  
[快速排序](src/排序/交换排序/Quick_Sort.java)  

归并排序:   
[归并排序](src/排序/归并排序/Merge_Sort.java)

桶排序:   
[基数排序](src/排序/桶排序_基数排序/Radix_Sort.java)

### 算法考题

#### 排序
[输入n个整数,找出其中最小的K个数](src/排序/输入n个整数_找出其中最小的K个数.java)  
包含堆排序（输入数组不变）和快排（输入数组可变）两种思路


### LetCode

---

## 数据结构篇  

### [数组 Array](src/_基本数据结构_/数组.md) 
大小固定，有序数组就是按一定顺序排列的数组  

### [栈 Stack](https://blog.csdn.net/weixin_42014622/article/details/105524005)
后进先出，Stack底层是采用数组来实现的

### [队列 Queue ](https://blog.csdn.net/u011240877/article/details/52860924)  
[QueueDemo](src/_基本数据结构_/QueueDemo.java)  
插入和删除的操作分别在表的两端进行，队列的特点就是先进先出(First In First Out)
 
### [链表LinkedList](https://blog.csdn.net/jdsjlzx/article/details/41654295)
空间可以不连续  

**Java 集合框架类**  
[Java集合：List](https://blog.csdn.net/qq_41657790/article/details/89218808?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.baidujs&dist_request_id=&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.baidujs)
---[ArrayList](https://blog.csdn.net/pipizhen_/article/details/107417406)
,[★LinkedList](https://blog.csdn.net/jdsjlzx/article/details/41654295)
,[Vector](https://blog.csdn.net/aamjz20022/article/details/101539986?utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.baidujs&dist_request_id=1328680.52773.16163964616992767&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.baidujs)
,[ Stack](https://blog.csdn.net/weixin_42014622/article/details/105524005)  
-->[ListDemo,ArrayListDemo,LinkedListDemo,VectorDemo,StackDemo](src/_基本数据结构_/ListDemo.java)  
[Java集合：Set](https://www.jianshu.com/p/b48c47a42916)
-->[★SetDemo,HashSet,TreeSet](src/_基本数据结构_/SetDemo.java)  
[Java集合：Map]()

### [散列表 Hash (哈希表)]()
快速的插入操作和查找操作。其key基于数组来实现。key-value 

### [树 Tree]()
二叉树  
完全⼆叉树  
满二叉树  
二叉查找树  
平衡二叉树  
红黑树  
B树，B+树，B*树  
LSM树

### [堆 Heap]() 
是一个可动态申请的内存空间，是一个特殊的二叉树
### [图 Graph]() 

[各种数据结构的优缺点]()

BFS DFS

