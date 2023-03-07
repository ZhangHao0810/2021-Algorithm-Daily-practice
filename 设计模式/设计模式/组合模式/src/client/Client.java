package client;

import component.Organization;
import composite.College;
import composite.University;
import leaf.Department;

/**
 * @author ZhangHao
 * @date 2019/11/4 9:11
 * @Description： 客户端测试类
 *  这种组合的实质其实就是List集合的顺序输出.不过可以随意的调用composite来展示他他下面的leaf,或者调用总的composite来展示他下面的composite和leaf
 */
public class Client {
    public static void main(String[] args) {
        /** 2019/11/4 9:12
         * 从大到小创建对象,先创建学校 (其实学校和学院这俩的类实现很相似)
        */
        Organization university1 = new University("北信科", "中国顶级大学!!!");
//        Organization university2 = new University("清华", "中国次级大学!!!");

        /** 2019/11/4 9:18
         * 创建学院
        */
        Organization computerCollege= new College("计算机学院", "世界最强学院");
        Organization softwareCollege= new College("软件学院", "宇宙最强学院");


        /** 2019/11/4 9:20
         * 创建学院下面的系(专业)
        */

        computerCollege.add(new Department("信息工程", "信息工程还行"));
        computerCollege.add(new Department("网络工程", "网络工程还行"));
        computerCollege.add(new Department("IT工程", "信IT工程还行"));

        softwareCollege.add(new Department("过程蓝图","真难呀"));
        softwareCollege.add(new Department("模式挖掘","不是很好理解"));

        //下面也是测试代码:先添加leaf 再添加composite,会先显示leaf
//        university1.add(new Department("test","test"));
//        university2.add(new Department("test","test"));


       /** 2019/11/4 9:43
         * 将两个学院加入到学校中
        */
        university1.add(computerCollege);
        university1.add(softwareCollege);

        /** 2019/11/4 9:51
         * 这是测试代码,计算机学院下面有了北信科和清华的所有leaf,不能两个composite互相添加.
        */
//        computerCollege.add(university1);
//        computerCollege.add(university2);

        university1.print();

//        computerCollege.print();

//        softwareCollege.print();

    }
}
