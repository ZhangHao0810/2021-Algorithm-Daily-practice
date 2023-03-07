package composite;

import component.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/11/4 9:02
 * @Description： 院校, 跟University很相似,将来实际业务中,College的add和remove 的方法体可能不同. college直接面向的就是leaf,所以他print时候循环的是叶子.这一点和university有区别
 *
 */
public class College extends Organization {

    /** 2019/11/4 9:03
     * 这个LIST中包含的是Department 聚合关系.存的是叶子.
    */
    List<Organization> organizations = new ArrayList<>();

    /** 2019/11/4 8:54
     * 构造器
     */
    public College(String name, String des) {
//        构造器中的super是指父类的构造器
        super(name, des);
    }

    /** 2019/11/4 8:55
     * 重写add方法
     */
    @Override
    public void add(Organization organization) {
        organizations.add(organization);
    }

    /** 2019/11/4 8:57
     * 重写remove方法
     */
    @Override
    public void remove(Organization organization) {
        organizations.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    /** 2019/11/4 8:58
     * 这个print方法就是输出University包含的学院.
     */
    @Override
    public void print() {
        System.out.println("---------"+getName()+"----------------");
        for (Organization component : organizations) {
            component.print();
        }
    }
}
