package composite;

import component.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/11/4 8:51
 * @Description： University,是Composite 可以管理College
 */
public class University extends Organization {

    List<Organization> organizations = new ArrayList<>();

    /** 2019/11/4 8:54
     * 构造器
    */
    public University(String name, String des) {
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
     * 这个print方法就是输出University包含的学院. 他循环的是college,另一个composite.
    */
    @Override
    public void print() {
        System.out.println("*************"+getName()+"**************");
        for (Organization component : organizations) {
            component.print();
        }
    }
}

