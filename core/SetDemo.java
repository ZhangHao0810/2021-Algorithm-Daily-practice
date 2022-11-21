

import java.util.*;

/**
 * @author Super-Zhang
 * @date 2021-03-21 11:00
 */

/**
 * Set 继承 Collection接口。 不重复集合。
 * HashSet TreeSet
 * 有序集合：集合⾥的元素可以根据 key 或 index 访问 (List、Map)
 * ⽆序集合：集合⾥的元素只能遍历。（Set）
 * <p>
 * 在判断重复元素：
 * HashSet 集合会调⽤ hashCode()和 equal()⽅法来实现；、
 * TreeSet 集合会调⽤compareTo⽅法来实现。
 * <p>
 * HashSet 继承于AbstractSet，实现了Set, 【Cloneable】, 【Serializable】接口。
 * 可以 clone（）  序列化。
 * 不可重复，可以null，元素无序，
 * <p>
 * TreeSet 继承AbstractSet，实现NavigableSet, 【Cloneable】, 【Serializable】接口。
 * 实现TreeMap 底层为红黑树。
 * TreeSet可以排序，自然排序12345（默认）和自定义排序两种。
 *
 *  返回值， 1 即交换， 0和 -1 即不交换。
 */
public class SetDemo {

    public static void main(String[] args) {
//        点击查看Set接口以及实现类的源码 可以从源码看到，HashSet调用了HashMap。 TreeSet调用了TreeMap
        Set set = new HashSet();
        Set set2 = new TreeSet();

        SetDemo demo = new SetDemo();
        //1. HashSet
        demo.hashSetDemo();
//        2.TreeSet  注意 迭代器提供升序和降序两种迭代。
        demo.treeSetDemo();


//        TreeSet排序测试
//        1.自然排序
        naturalSort();
//        2.1 自定义排序：类实现Comparable接口。类中重写compareTO方法。
        customSort_Comparable();
//        2.2 自定义排序：创建对象时实现Comparetor接口。匿名类中重写compare方法。
        customSort_Comparetor();

    }

    private void hashSetDemo() {

//       1: HashSet
        Set<String> hashSet = new HashSet<String>();
        System.out.println("HashSet初始容量大小：" + hashSet.size());

        //元素添加：
        hashSet.add("my");
        hashSet.add("name");
        hashSet.add("is");
        hashSet.add("zhang");
        System.out.println("HashSet容量大小：" + hashSet.size());

        //迭代器遍历 注释Set是无序的。 你一定要知道你在操作什么。
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        //增强for遍历
        for (String str : hashSet) {
            if ("zhang".equals(str)) {
                System.out.println("我的名字是：" + str);
            }
//            System.out.println(str);
        }

        //元素删除：
        hashSet.remove("jiaboyan");
        System.out.println("HashSet元素大小：" + hashSet.size());
        hashSet.clear();
        System.out.println("HashSet元素大小：" + hashSet.size());

        //集合判断：
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet是否为空：" + isEmpty);
        boolean isContains = hashSet.contains("hello");
        System.out.println("HashSet是否包含 hello：" + isContains);

        System.out.println("============================");
    }

    private void treeSetDemo() {

        TreeSet<String> treeSet = new TreeSet<String>();
        System.out.println("TreeSet初始化容量大小：" + treeSet.size());

        //元素添加：
        treeSet.add("my");
        treeSet.add("name");
        treeSet.add("is");
        treeSet.add("who");

        System.out.println("TreeSet容量大小：" + treeSet.size());
        System.out.println("TreeSet元素顺序为：" + treeSet.toString());

//        增强for
        for (String str : treeSet) {
            System.out.println("遍历元素：" + str);
        }

        //【迭代器遍历：升序】
        Iterator<String> iteratorAesc = treeSet.iterator();
        while (iteratorAesc.hasNext()) {
            String str = iteratorAesc.next();
            System.out.println("遍历元素升序：" + str);
        }

        //【迭代器遍历：降序  descendingIterator】
        Iterator<String> iteratorDesc = treeSet.descendingIterator();
        while (iteratorDesc.hasNext()) {
            String str = iteratorDesc.next();
            System.out.println("遍历元素降序：" + str);
        }
// = =============================================================================================
        //元素获取:因为实现了NavigableSet接口

        //获取头节点。
        String firstEle = treeSet.first();//获取TreeSet头节点：
        System.out.println("TreeSet头节点为：" + firstEle);

        // 获取指定元素之前的所有元素集合：(不包含指定元素)
        SortedSet<String> headSet = treeSet.headSet("name");
        System.out.println("name节点之前的元素为：" + headSet.toString());

        //获取给定元素之间的集合：（包含头，不包含尾）
        SortedSet subSet = treeSet.subSet("my", "who");
        System.out.println("my - who之间节点元素为：" + subSet.toString());
//=================================================================================================
        //集合判断：
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("TreeSet是否为空：" + isEmpty);
        boolean isContain = treeSet.contains("who");
        System.out.println("TreeSet是否包含who元素：" + isContain);

        //元素删除：
        boolean jiaboyanRemove = treeSet.remove("is");
        System.out.println("is元素是否被删除" + jiaboyanRemove);

        //集合中不存在的元素，删除返回false
        boolean whoRemove = treeSet.remove("zhang");
        System.out.println("zhang元素是否被删除" + whoRemove);

        //删除并返回第一个元素：如果set集合不存在元素，则返回null
        String pollFirst = treeSet.pollFirst();
        System.out.println("删除的第一个元素：" + pollFirst);

        //删除并返回最后一个元素：如果set集合不存在元素，则返回null
        String pollLast = treeSet.pollLast();
        System.out.println("删除的最后一个元素：" + pollLast);

        treeSet.clear();//清空集合:

        System.out.println("====================================");
    }

    // 默认自然排序 升序
    public static void naturalSort() {
        TreeSet<String> treeSetString = new TreeSet<String>();
        treeSetString.add("a");
        treeSetString.add("z");
        treeSetString.add("d");
        treeSetString.add("b");
        System.out.println("字母顺序：" + treeSetString.toString());

        TreeSet<Integer> treeSetInteger = new TreeSet<Integer>();
        treeSetInteger.add(1);
        treeSetInteger.add(24);
        treeSetInteger.add(23);
        treeSetInteger.add(6);
        System.out.println(treeSetInteger.toString());
        System.out.println("数字顺序：" + treeSetString.toString());

        System.out.println("=======================================");
    }

    //   自定义排序 1  待比较的类实现Comparable接口，重写CompareTo方法。
    public static void customSort_Comparable() {

        TreeSet<Animal> sortSet1 = new TreeSet<Animal>();

        //排序对象：
        Animal an1 = new Animal("dog", 10);
        Animal an2 = new Animal("fish", 20);
        Animal an3 = new Animal("cat", 15);
        Animal an4 = new Animal("bird", 25);

        //添加到集合：
        sortSet1.add(an1);
        sortSet1.add(an2);
        sortSet1.add(an3);
        sortSet1.add(an4);
        System.out.println("TreeSet集合顺序为：" + sortSet1);

        System.out.println("====================================");
    }

    //   自定义排序 2  利用比较器  实现Comparator接口，重写compare方法
    public static void customSort_Comparetor() {

//        创建对象时new一个匿名类。
        TreeSet<Fruit> sortSet2 = new TreeSet<Fruit>(new Comparator<Fruit>() {
            @Override
            //比较方法：先比较年龄，年龄若相同在比较名字长度；
            public int compare(Fruit o1, Fruit o2) {
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().length() - o2.getName().length() : num;
            }
        });

        //排序对象：
        Fruit fr1 = new Fruit("apple", 10);
        Fruit fr2 = new Fruit("banana", 20);
        Fruit fr3 = new Fruit("orange", 15);
        Fruit fr4 = new Fruit("cherry", 25);

        sortSet2.add(fr1);
        sortSet2.add(fr2);
        sortSet2.add(fr3);
        sortSet2.add(fr4);

        System.out.println("TreeSet集合顺序为："+sortSet2);
    }
}

class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animal o) {
//       自定义比较规则：先比较name长度，再比较age

//        【返回正整数，说明this > o ，返回负整数则相反，相等返回0】
        int num = this.name.length() - o.name.length();
        return num == 0 ? this.age - o.age : num;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/**
 * 自定义排序方法2：比较器方法 实现Comparetor<t>接口 重写compare方法
 * 这种方法原始类无需做更改。
 */
class Fruit {
    private String name;
    private int age;

    public Fruit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



