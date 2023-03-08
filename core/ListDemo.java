

import java.util.*;

/**
 * @author Super-Zhang
 * @date 2021-03-22 11:21
 * <p>
 * 可以精确控制元素位置的集合。 有序。
 * <p>
 * List的常⻅实现类
 * ArrayList 是⼀个数组队列，相当于动态数组。
 *  它由数组实现，随机访问效率⾼，随机插⼊、随机删除效率低。
 * LinkedList 是⼀个双向链表。它也可以被当作堆栈、队列或双端队列进⾏操作。
 *  LinkedList随机访问效率低，但随机插⼊、随机删除效率⾼。
 * Vector 是⽮量队列，和ArrayList⼀样，它也是⼀个动态数组，由数组实现。
 *  但是ArrayList是⾮线程安全的，⽽Vector是线程安全的。
 * Stack 是栈，它继承于Vector。它的特性是：先进后出(FILO, First In Last Out)。
 * <p>
 * ArrayList到了最大值，扩容至原来的1.5倍，而Vector则变为2倍。
 **/

public class ListDemo {

    //    点击查看源码
    List demo = new ArrayList();

    public static void main(String[] args) {
//        arrayListDemo();
//        linkedListDemo();
        vectorDemo();
        stackDemo();
    }

    /**
     * ArrayList
     */
    private static void arrayListDemo() {

        List<String> list = new ArrayList<>();

//        增
        list.add("o");
        list.add("wo");
        list.add("shi");
        list.add("da");
        list.add("da1");
        list.add("shuai");
        list.add("ge");

//        删
        list.remove(0);
        list.remove("da1");

//        改
        list.set(2, "hahaha");

//        遍历的三种方式 普通 for，增强for，迭代器Iterator。 推荐增强for，内部实现了迭代器。
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String string : list) {
            System.out.println(string);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

//      排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);  //正序。  o2.compareTo(o1) 倒序
            }
        });

// ======================================================================
        ArrayList<Student> stu = new ArrayList();

        stu.add(new Student(19, 12, "zhangsan", "五班"));
        stu.add(new Student(15, 11, "李四", "五班"));

//        自定义类排序
        Collections.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                //按年龄正序。 o1-o2 正序，o2-o1 倒序
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(stu);

    }

    /**
     * LinkedList
     */
    private static void linkedListDemo() {
        //双向列表,列表中的每个节点都包含了对前一个和后一个元素的引用.
//        api中包含对链头和链尾的 add remove get 操作。

//        添加
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.add(1, "new1"); //带索引的添加。
        lList.addFirst("0");
        lList.addLast("last");

        System.out.println("链表的第一个元素是 : " + lList.getFirst());
        System.out.println("链表最后一个元素是 : " + lList.getLast());

//      遍历
        for (String str : lList) {
            System.out.println(str);
        }

//       从链表生成子链，【注意：子链和母链的共享同一块内存地址】
        List subl = lList.subList(1, 4);
        System.out.println("son" + subl);
        System.out.println("mather:" + lList);
        subl.remove(0);  //子链删除一个元素。
        System.out.println("son:" + subl);
        System.out.println("mather:" + lList);//母链随子链减少一个元素。

//        删掉所有元素：清空LinkedList
        lList.clear(); // 对子表的清空 可以区域删除链表。

    }

    /**
     * Vector 线程安全，有序可重复
     */
    private static void vectorDemo() {

        // 如何将一个非线程安全的ArrayList转换成线程安全的ArrayList
        List list = new ArrayList();  // 这是一个非线程安全的ArrayList
        // 调用Collections.synchronizedList(list<Object> list)方法
        List list1 = Collections.synchronizedList(list);// list1是线程安全的了

        Vector<String> hs = new Vector<String>();
        hs.add("aa");
        hs.add("bb");
        hs.add("aa");
        hs.add("cc");
        hs.add("aa");
        hs.add("dd");
        System.out.println(hs);
    }

    /**
     * 栈Stack
     */
    private static void stackDemo() {

        //初始化
        Stack<Integer> stack = new Stack<Integer>();
        //进栈
        stack.push(1);
        stack.push(2);
        //出栈
        stack.pop();
        //取栈顶值（不出栈）
        System.out.println("栈顶："+stack.peek());
        //判断栈是否为空
        System.out.println(stack.isEmpty());
    }

}

class Student {
    private int age, score;
    private String name, sclass;

    public Student(int age, int score, String name, String sclass) {
        this.age = age;
        this.score = score;
        this.name = name;
        this.sclass = sclass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Strdent{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", sclass='" + sclass + '\'' +
                '}';
    }
}