package leaf;

import component.Organization;

/**
 * @author ZhangHao
 * @date 2019/11/4 9:08
 * @Description： 系, 最小的组织单位.  add和remove方法就不用再写了. 因为他是叶子结点,不需要再管理其他单位.
 *
 */
public class Department extends Organization {

    /** 2019/11/4 9:10
     * 没有集合,他是最小节点,无需聚合其他.
    */

    /**
     * 2019/11/4 9:08
     * 构造器
     */
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
